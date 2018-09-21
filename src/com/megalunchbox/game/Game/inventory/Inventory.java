package com.megalunchbox.game.game.inventory;

import com.megalunchbox.game.game.item.Item;

import java.util.HashMap;

public class Inventory {
  
  HashMap<Integer, Item> inventory;
  
  public Inventory(HashMap<Integer, Item> inventory) {
    this.inventory = inventory;
  }
}
