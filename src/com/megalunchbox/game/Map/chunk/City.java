package com.megalunchbox.game.map.chunk;

import com.megalunchbox.game.game.Civilization;
import com.megalunchbox.game.game.Race;

public class City extends Chunk.Content {

  private String name;
  private Civilization civ; //TODO: add Civilizations
  private Race race;
  
  public City(String name, Civilization civ, Race race) {
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
