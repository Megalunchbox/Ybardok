package com.megalunchbox.game.game.item;

public class Item {
  
  ItemType itemType;
  
  int durability,
  maxDurability;

  float damage;
  
  String name,
  description;
  
  
  public Item(ItemType itemType, int durability, int maxDurability, float damage, String name, String description) {
    this.itemType = itemType;
    this.name = name;
    this.description = description;
    this.damage = damage;
    this.maxDurability = maxDurability;
    this.durability = durability;
  }
  
  public enum ItemType {
    
    SWORD(1, "sword"),
    AXE(2, "axe"),
    ;
    
    int id;
    String family;
    
    ItemType(int id, String family) {
      this.id = id;
      this.family = family;
    }
    
    public int getId() {
      return id;
    }
    
    public String getFamily() {
      return family;
    }
    
    
  }

}
