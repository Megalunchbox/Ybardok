package com.megalunchbox.game.map.chunk;

public class City extends ChunkContent {

  private String name;
  private Civilization civ; //TODO: add Civilizations
  
  public City(String name, Civiliation civ, Race race) {
    this.name = name;
    this.civ = civ;
    this.race = race;
  }
  
  public String name() {
    return name;
  }
  
  public Civilization civ() {
    return civ;
  }
  

}
