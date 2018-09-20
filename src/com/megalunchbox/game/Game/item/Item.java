package com.megalunchbox.game.game.item.Item.java;

public class Item {
  
  ItemType itemType;
  
  int durability,
  int maxDurability;
  
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
  
  public static enum ItemType {
    
    SWORD(1, "sword"),
    AXE(2, "axe"),
    ;
    
    int id;
    String family;
    
    public ItemType(int id, String family) {
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
