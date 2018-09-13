package com.megalunchbox.game.Map.Region;

import java.io.Serializable;
import java.util.ArrayList;
import com.megalunchbox.game.util.Location;
import com.megalunchbox.game.Map.World;

public class Region implements Serializable {
  
  //all chunks that are in the region.
  
  public ArrayList<Chunk> chunks;
  
  //location of the region
  
  public Location location;
  
  //the world the region belongs to
  
  public World world;
  
  //serialversionuid
  
  private static final long serialVersionUID 23L;
  
  public Region(World world, Location location, Arraylist<Chunk> chunks) {
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
