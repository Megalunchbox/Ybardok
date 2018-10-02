package com.megalunchbox.game.game.entity;

import com.megalunchbox.game.util.Location;
import java.util.HashMap;

public class Entity {

  private float maxHealth,
  health,
  baseArmor,
  maxMana,
  mana;
  
  private String name;
  
  private transient HashMap<String, Float> cachedStats;
  //private HashMap<> inventory; TODO: add this after inventory is created.
  
  private Location location;
  private EClass eClass;

  public Entity(float maxHealth, float health, float baseArmor, float maxMana, EClass eClass, String name, Location location) {
    this.maxHealth = maxHealth;
    this.health = health;
    this.baseArmor = baseArmor;
    this.maxMana = mana;
    this.name = name;
    this.location = location;
    this.eClass = eClass;
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
  
  public float getMaxMana() {
    return maxMana;
  }
  
  public float getBaseArmor() {
    return baseArmor;
  }
  
  public void setBaseArmor(float b) {
    baseArmor = b;
  }

  public String getName() {
    return name;
  }

  public float getHealth() {
    return health;
  }

  public float getMaxHealth() {
    return maxHealth;
  }

  public float getMana() {
    return mana;
  }

  public HashMap<String, Float> getCachedStats() {
    return cachedStats;
  }

  public void setMana(float mana) {
    this.mana = mana;
  }
}
