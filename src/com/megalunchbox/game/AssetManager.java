package com.megalunchbox.game;

public class AssetManager {

  HashMap<String, AssetLoader.Asset> assets;
  
  public AssetLoader() {
    assets = new HashMap<String, Texture texture>();
  }
  
  public AssetLoader(HashMap<String, Texture texture> assets) {
    this.assets = assets;
  }
  
  public void load(String name, FileHandle file) {
    assets.put(name, file);
  }
  
  public Texture get(String name) {
    return assets.get(name);
  }
}
