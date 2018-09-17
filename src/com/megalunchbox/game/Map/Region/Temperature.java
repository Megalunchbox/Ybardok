package com.megalunchbox.game.map.region;

public enum Temperature {
  
  HIGHEST(127),
  HOT(80),
  MEDIUM(0),
  COLD(-80),
  LOWEST(-127),
  ;
  
  private byte temperature;
  private String description;
  
  public Temperature(byte temperature) {
    this.temperature = temperature;
    if (temperature >= -30 || temperature <= 30) {
      this.description = "Relatively good temperature";
    } else if (temperature <= -30) {
      this.description = "Cold temperature";
    } else if (temperature >= 30){
      this.description = "Hot temperature";
    }
  }
  
  

}
