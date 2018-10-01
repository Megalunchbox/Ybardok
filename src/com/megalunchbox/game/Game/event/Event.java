package com.megalunchbox.game.game;

abstract class Event {

  public static HashMap<Integer, Event> eventMap;
  
  int id;
  boolean cancelled;
  
  public abstract void onEvent();
  
  public void id() {
    return id;
  }
  
  public boolean cancelled() {
    return cancelled;
  }
  
  


}
