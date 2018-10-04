package com.megalunchbox.game.map.region;

import java.io.*;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Setting;
import com.megalunchbox.game.map.biome.Biome;
import com.megalunchbox.game.map.chunk.Chunk;
import com.megalunchbox.game.util.Location;
import com.megalunchbox.game.map.world.World;
import com.badlogic.gdx.files.FileHandle;
import java.lang.Math;


public class Region implements Serializable {
  
  //all chunks that are in the region.
  
  private ArrayList<Chunk> chunks;
  
  //location of the region
  
  private Location location;
  
  //the world the region belongs to
  
  private World world;
  
  //serialversionuid
  
  private static final long serialVersionUID = 23L;

  Color color;

  Texture texture;
  
  private Temperature temperature;
  
  private Biome biome;

  public Region(World world, Location location) {

      this.world = world;
      this.location = location;
    //TODO: make colder temperatures MORE COMMON at poles
      this.temperature = new Temperature((byte) Math.floor((100 * (Setting.getInstance().getNoise().noise(location.getX(), location.getY())))));

      if (temperature.getBytes() < 60) {
        color = Color.YELLOW;
      } else if (temperature.getBytes() > -60) {
          color = Color.WHITE;
      } else if (temperature.getBytes() > 60 && temperature.getBytes() < -60) {
          color = Color.GREEN;
      }

      Pixmap pixmap = new Pixmap(32, 32, Pixmap.Format.RGBA8888);
      pixmap.setColor(color);
      pixmap.fillRectangle(0, 0, 32, 32);
      texture = new Texture(pixmap);
      pixmap.dispose();

      //TODO: BIOMES!
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
  
   public Temperature getTemperature() {
     return temperature;
   }

   public void render(SpriteBatch batch) {
      batch.draw(texture, location.getX() * 32, location.getY() * 32);
   }

    private void createTexture(int width, int height, Color color) {

    }
  
 
}
