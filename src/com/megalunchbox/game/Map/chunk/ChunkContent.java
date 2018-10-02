package com.megalunchbox.game.map.chunk;

import com.badlogic.gdx.graphics.Texture;

public class ChunkContent {
  
    Texture texture;
    Chunk owner;
    
    public Texture texture() {
      return texture;
    }
    
    public Chunk owner() {
      return owner;
    }
  
}
