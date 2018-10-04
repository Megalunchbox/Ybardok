package com.megalunchbox.game;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class AssetManager {

  HashMap<String, Texture> assets;
  
  public AssetManager() {
    assets = new HashMap<String, Texture>();
  }
  
  public AssetManager(HashMap<String, Texture> assets) {
    this.assets = assets;
  }
  
  public void load(String name, FileHandle file) {
    assets.put(name, new Texture(file));
  }
  
  public Texture get(String name) {
    return assets.get(name);
  }
}
