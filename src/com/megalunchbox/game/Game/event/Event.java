package com.megalunchbox.game.game;

abstract class Event {

  public static HashMap<Integer, Event> eventMap;
  
  int id;
  bool cancelled;
  
  public abstract void onEvent();
  
  public void id() {
    return id;
  }
  
  public bool cancelled() {
    return cancelled;
  }
  
  


}
