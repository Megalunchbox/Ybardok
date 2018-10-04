package com.megalunchbox.game.map.world;

import java.io.*;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.game.map.region.Region;
import com.badlogic.gdx.files.FileHandle;

public class World implements Serializable {
  
  //all loaded regions
  private transient ArrayList<Region> loadedRegions;
  
  //world name
  private String name;
  
  //the uuid so you can have multiple worlds with the same name and no conflicts
  private long uuid;

  int
  worldWidth,
  worldHeight;
  
  private transient final long  serialVersionUUID = 41L;

  public World(int width, int height, String name) {
        worldWidth = width;
        worldHeight = height;
        this.name = name;


  }

  public Region loadRegion(FileHandle handle) throws IOException, ClassNotFoundException {

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
    return name + uuid + "\\" + "region" + "\\";
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
  
  public void loadAllRegions() throws IOException, ClassNotFoundException{
    FileHandle file = Gdx.files.local(getRegionDirAsString());
    ArrayList<Region> regions = new ArrayList<Region>();
    for (FileHandle child : file.list()) {
      if (file.name().endsWith(".rgf"))
      regions.add(loadRegion(file));
    }
    loadedRegions = regions;
  }

    public ArrayList<Region> getLoadedRegions() {
        return loadedRegions;
    }


    public int getWorldHeight() {
        return worldHeight;
    }

    public String getName() {
        return name;
    }

    public int getWorldWidth() {
        return worldWidth;
    }

    public long getUuid() {
        return uuid;
    }

    public void setWorldHeight(byte worldHeight) {
        this.worldHeight = worldHeight;
    }

    public void setWorldWidth(byte worldWidth) {
        this.worldWidth = worldWidth;
    }

    public void saveAllRegions() {
      for (Region region : loadedRegions) {
          region.save(region.getLocation());
      }
    }

    public void addRegion(Region region) {
      loadedRegions.add(region);
    }


}
