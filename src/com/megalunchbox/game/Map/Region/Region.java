package com.megalunchbox.game.Map.Region;

import java.io.Serializable;
import java.util.ArrayList;
import com.megalunchbox.game.util.Location;
import com.megalunchbox.game.Map.World;
import java.lang.character;
import java.io.ObjectInputStream;
import com.badlogic.gdx.files.FileHandle;
import java.io.FileInputStream;
import java.lang.Math;


public class Region implements Serializable {
  
  //all chunks that are in the region.
  
  public ArrayList<Chunk> chunks;
  
  //location of the region
  
  public Location location;
  
  //the world the region belongs to
  
  public World world;
  
  //serialversionuid
  
  private static final long serialVersionUID 23L;
  
  protected Region(World world, Location location, Arraylist<Chunk> chunks) {
    this.world = world;
    this.location = location;
    
       if (chunks != null) {
          this.chunks = chunks;
       }
    
  }
  
  //creates a region with no generated chunks
  public static Region createRegion(Location location, World world) {
    return new Region(world, location, null);
  }
  
  public FileHandle getRegionPath(Region region) {
    Location location = region.getLocation();
    char[] characters = {'a', 'b', 'c', 'd', 'e', 
                         'f', 'g', 'h', 'i', 'j',
                         'k', 'l', 'm', 'n', 'o',
                         'p', 'q', 'r', 's', 't',
                         'u', 'v', 'w', 'x', 'y', 
                         'z'};
    
    int x = (int) Math.floor(location.getX()/16);
    int y = (int) Math.floor(location.getY()/16);
      
    if (location.getX() > 0 && location.getY() > 0) {
    FileHandle file = Gdx.files.local(world.getDir() + "\" + "pp" + "\" + (String) characters[x] + (String) characters[y] + "\" + location.getX() + location.getY() + ".rgf");
    } else if (location.getX() <= 0 && location.getY() <= 0) {
      FileHandle file = Gdx.files.local(world.getDir() + "\" + "mm" + "\" + (String) characters[x] + (String) characters[y] + "\" + location.getX() + location.getY() + ".rgf");
    } else if (location.getX() > 0 && location.getY() <= 0) {
      FileHandle file = Gdx.files.local(world.getDir() + "\" + "pm" + "\" + (String) characters[x] + (String) characters[y] + "\" + location.getX() + location.getY() + ".rgf");
    } else if (location.getX() <= 0 && location.getY() > 0) {
      FileHandle file = Gdx.files.local(world.getDir() + "\" + "mp" + "\" + (String) characters[x] + (String) characters[y] + "\" + location.getX() + location.getY() + ".rgf");
    }
  }
  
  public static FileHandle getRegionPathByLocation(Location location) {
    
  }

  public static Region loadRegion(FileHandle handle) throws IOException, ClassNotFoundException {
           try {
            FileInputStream fis = new FileInputStream(handle);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            region = (Region) ois.readObject();
            return region;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
  }
  
  public static void saveRegion(Location location) {
    //TODO: Get saving location relative to file path
  }
  
  public static void delRegion(Region region) {
    //TODO: replace region parameter with FileHandle and delete region
  }
  
  public void setTileAt() {
    
  }
  
  public void getTileAt() { 
    
  }
  
  public ArrayList<Chunk> getChunks() {
    return chunks;
  }
  
  public long getSerialVersionUID() {
    return serialVersionUID;
  }
  
  public static Region generateRegion(Region region) {
    ArrayList<Chunk> buildingChunks = region.getChunks();
    //TODO: Chunk generation here for the whole region.
    return region;
  }
}
