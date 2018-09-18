package com.megalunchbox.game.map.world;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.game.map.region.Region;
import java.io.Serializable;
import com.badlogic.gdx.files.FileHandle;
import java.io.ObjectOutputStream;

public class World implements Serializable {
  
  //all loaded regions
  private transient ArrayList<Region> loadedRegions;
  
  //world name
  private String name;
  
  //the uuid so you can have multiple worlds with the same name and no conflicts
  private long uuid;
  
  private int regionSize = 16,
  chunkSize = 16,
  worldWidth,
  worldHeight;
  
  private transient final long  serialVersionUUID = 41L;
  
public void Region loadRegion(FileHandle handle) throws IOException, ClassNotFoundException {

      try {

            FileInputStream fis = new FileInputStream(handle.file());
            ObjectInputStream ois = new ObjectInputStream(fis);

          return (Region) ois.readObject();

      } catch (Exception e) {
            e.printStackTrace();
      }

      return null;
  }
  
  public void unloadRegion(Region region) {
    
  }
  

  public String getDirAsString() {
      return name + uuid + "\\";
  }
  
  public String getRegionDirAsString() {
    return name + uuid + "\\" + "region" + "\\"
  }
  
  public void save() throws IOException {
    
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(this);
        
        FileHandle file = Gdx.files.local(this.name + uuid + "\\" + "world.prop");
                                          
        try {
            file.writeBytes(b.toByteArray(), false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
  }
  
  public void loadAllRegions() {
    FileHandle file = Gdx.files.local(getRegionDirAsString());
    ArrayList<Region> regions;
    for (FileHandle child : file) {
      if (file.name.endsWith(".rgf"))
      region.add(loadRegion(file))
    }
    loadedRegions = regions;
  }

}
