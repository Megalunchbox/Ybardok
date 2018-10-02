package com.megalunchbox.game.map.chunk;

import java.util.ArrayList;
import com.megalunchbox.game.map.biome.Biome;
import com.megalunchbox.game.map.tile.Tile;

public class Chunk {
  
  private static int chunkSize = 32;
  private ArrayList<Tile> tiles;
  
  public Chunk() {
    
  }
  
  public void addTile(Tile tile) {
    tiles.add(tile);
  }
  
  public void removeTile(Tile tile) {
    tiles.remove(tile);
  }

  public void genChunk(Biome biome) {
    
  }

}
