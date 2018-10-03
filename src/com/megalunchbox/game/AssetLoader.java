package com.megalunchbox.game;

public class AssetLoader {

  ArrayList<AssetLoader.Asset> assets;
  
  public static class Asset {
    private String name;
    private Texture texture;
    
    public Texture texture() {
      return texture;
    }
  }
  
}
