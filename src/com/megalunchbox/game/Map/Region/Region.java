package com.megalunchbox.game.map.region;

import java.io.*;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.game.util.Location;
import com.megalunchbox.game.map.world.World;
import com.badlogic.gdx.files.FileHandle;
import java.lang.Math;
import com.megalunchbox.game.util.SimplexNoise;


public class Region implements Serializable {
  
  //all chunks that are in the region.
  
  private ArrayList<Chunk> chunks;
  
  //location of the region
  
  private Location location;
  
  //the world the region belongs to
  
  private World world;
  
  //serialversionuid
  
  private static final long serialVersionUID = 23L;
  
  Temperature temperature;
  
  public Region(World world, Location location, ArrayList<Chunk> chunks) {
    
    this.world = world;
    this.location = location;
    this.chunks = chunks;
    
    
  }
  
  public Region(World world, Location location) {
    
    this.world = world;
    this.location = location;
    //TODO: add math  to make colder temperatures at the poles
    this.temperature = new Temperature((byte) Math.floor(1.2 * (100 * (SimplexNoise.noise(location.getX(), location.getY())))));
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

    FileHandle file;

    if (location.getX() > 0 && location.getY() > 0) {
      file = Gdx.files.local(world.getRegionDirAsString() + "pp" + "\\" +  characters[x] + characters[y] + "\\" + location.getX() + location.getY() + ".rgf");
      return file;
    } else if (location.getX() <= 0 && location.getY() <= 0) {
       file = Gdx.files.local(world.getRegionDirAsString() + "mm" + "\\" +  characters[x] + characters[y] + "\\" + location.getX() + location.getY() + ".rgf");
       return file;
    } else if (location.getX() > 0 && location.getY() <= 0) {
       file = Gdx.files.local(world.getRegionDirAsString() + "pm" + "\\" +  characters[x] + characters[y] + "\\" + location.getX() + location.getY() + ".rgf");
       return file;
    } else if (location.getX() <= 0 && location.getY() > 0) {
       file = Gdx.files.local(world.getRegionDirAsString() + "mp" + "\\" +  characters[x] + characters[y] + "\\" + location.getX() + location.getY() + ".rgf");
       return file;
    }
    return null;
  }


  
  
  public void save(Location location) {
    //TODO: Get saving location relative to file path
  }
  
  public void del(Region region) {
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

    public Location getLocation() {
        return location;
    }
 
}
