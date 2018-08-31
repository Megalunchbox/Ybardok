package com.megalunchbox.game.Map.Region;

import java.util.ArrayList;
import com.megalunchbox.game.Map.Biome.Biome;

public class Chunk {
  
  private static int chunkSize = 32;
  private ArrayList<Tile> tiles;
  
  public Chunk() {
    
  }
  
  public void addTile(Tile tile) {
    tiles.add(tile);
  }
  
  public void removeTile() {
    tiles.remove(tile);
  }
  
  public void genChunk(Biome biome) {
    
  }

}
