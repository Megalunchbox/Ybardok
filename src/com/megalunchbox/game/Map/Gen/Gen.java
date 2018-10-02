package com.megalunchbox.game.map.gen;

import com.megalunchbox.game.map.tile.Tile;
import com.megalunchbox.game.map.world.World;

public class Gen {
  
  int xMax;
  int yMax;
  
  int xMin;
  int yMin;
  
  //the tileSet the map will use to gen
  Tile.TileSet tileSet;
  
  public Gen(Tile.TileSet tileSet, World world) {
  }

}
