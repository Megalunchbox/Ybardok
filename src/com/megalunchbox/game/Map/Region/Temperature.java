package com.megalunchbox.game.map.region;

public class Temperature {
  
  /*HIGHEST((byte)127),
  HOT((byte)80),
  MEDIUM((byte)0),
  COLD((byte)-80),
  LOWEST((byte)-128),
  ; */
  
  private byte temperature;
  private String description;
  
  Temperature(byte temperature) {
    this.temperature = temperature;
    if (temperature >= -30 && temperature <= 30) {
      this.description = "Relatively good temperature";
    } else if (temperature <= -30) {
      this.description = "Cold temperature";
    } else if (temperature >= 30){
      this.description = "Hot temperature";
    }
  }

  public byte getBytes() {
    return temperature;
  }
}
