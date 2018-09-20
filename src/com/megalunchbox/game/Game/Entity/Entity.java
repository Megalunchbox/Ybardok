package com.megalunchbox.game.game.entity;

import com.megalunchbox.game.Util.Location;

public class Entity {

  float maxHealth,
  health,
  armor,
  mana;
  
  //TODO: add hashmap for getting inventory modifiers for armor and etc
  
  String name;
  
  Location location;

  public Entity(float maxHealth, float health, float armor, float mana, String name, Location location) {
  }
  
  public Entity(float maxHealth, float mana, String name) {
    this(maxHealth,maxHealth,null,mana,name,null);
  }
  
  public Entity(float maxHealth, float mana) {
    this(maxHealth,mana,null);
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  public void setHealth(float health) {
    this.health = health;
  }
  
  public void setHealth(int health) {
    this.health = (float) health;
  }

}
