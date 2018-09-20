package com.megalunchbox.game.game.inventory;

import com.megalunchbox.game.game.item.Item;

public class Inventory {
  
  HashMap<Integer, Item> inventory;
  
  public Inventory(Inventory inventory) {
    this.inventory = inventory;
  }
}
