package com.megalunchbox.game.Map.Region;

import java.io.Serializable;
import java.util.ArrayList;
import com.megalunchbox.game.util.Location;
import com.megalunchbox.game.Map.World;

public class Region implements Serializable {
  
  //all chunks that are in the region.
  
  public Arraylist<Chunk> chunks;
  
  //location of the region
  
  public Location location;
  
  //the world the region belongs to
  
  public World world;
  
  //serialversionuid
  
  private static final long serialVersionUID 23L;
  
  public Region createRegion() {
    //Region generation, using temperatures, world axis.
    Region region = new Region();
    return region;
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
  
  public long getSerialVersionUID() {
    return serialVersionUID;
  }
  
}
