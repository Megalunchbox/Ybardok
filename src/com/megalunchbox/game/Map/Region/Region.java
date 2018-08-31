package com.megalunchbox.game.Map.Region;

import java.io.Serializable;
import java.util.ArrayList;
import com.megalunchbox.game.util.Location;

public class Region implements Serializable {
  
  public Arraylist<Chunk> chunks;
  public Location location;
  private static final long serialVersionUID 23L;
  
  public static void saveRegion(Region region) {
  }
  
  public static void delRegion(Region region) {
  }
  
  public long getSerialVersionUID() {
    return serialVersionUID;
  }
  
}
