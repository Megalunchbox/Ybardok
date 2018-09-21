package com.megalunchbox.game.game;

public enum Mode {
  
  REGION_MODE(0,"Region Mode"),
  CHUNK_MODE(0,"Chunk Mode");

  int id;
  String name;
  
  Mode(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "id: " + id + " name: " + name;
  }
}
