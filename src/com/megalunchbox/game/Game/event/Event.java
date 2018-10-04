package com.megalunchbox.game.game;

import java.util.HashMap;

abstract class Event {

  public static HashMap<Integer, Event> eventMap;
  
  int id;
  boolean cancelled;
  
  public abstract void onEvent();
  
  public int id() {
    return id;
  }
  
  public boolean cancelled() {
    return cancelled;
  }
  
  


}
