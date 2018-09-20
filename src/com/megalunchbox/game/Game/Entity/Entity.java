package com.megalunchbox.game.game.entity;

import com.megalunchbox.game.Util.Location;
import java.util.HashMap;

public class Entity {

  private float maxHealth,
  health,
  baseArmor,
  mana;
  
  private String name;
  
  private transient HashMap<String, Float> cachedStats;
  //private HashMap<> inventory; TODO: add this after inventory is created.
  
  private Location location;

  public Entity(float maxHealth, float health, float baseArmor, float mana, String name, Location location) {
    this.maxHealth = maxHealth;
    this.health = health;
    this.baseArmor = baseArmor;
    this.mana = mana;
    this.name = name;
    this.location = location;
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
  
  public Location getLocation() {
    return location;
  }
  
  public void setHealth(float health) {
    this.health = health;
  }
  
  public void setHealth(int health) {
    this.health = (float) health;
  }
  
  public void setMaxHealth(float newMax) {
    maxHealth = newMax;
  }
  
  public void damage(float d) {
    health -= d;
  }
  
  public float getMana() {
    return mana;
  }
  
  public float getBaseArmor() {
    return baseArmor;
  }
  
  public float setBaseArmor(float b) {
    baseArmor = b;
  }
  
  public HashMap<String, Float> getCachedModifiers() {
    return cachedModifiers;
  }
  

}
