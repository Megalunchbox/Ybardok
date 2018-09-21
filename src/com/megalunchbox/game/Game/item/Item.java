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


    public String getName() {
        return name;
    }

    public float getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDamage(float damage) {
        this.damage = damage;
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
