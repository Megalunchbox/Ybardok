package com.megalunchbox.game.map.tile;

import java.util.ArrayList;
import java.util.HashMap;

public enum TileSet {

    ;

    //field hashmap key is the type, integer is the chance multiplier.
    HashMap<TileType, Integer> tileMap;


    /**
     * @param biome the biome the TileSet will belong to
     * @param tileList the list of tiles that will be in the biome
     */


     TileSet(HashMap<TileType, Integer> tileSet) {
     this.tileMap = tileMap;
    }
    
    public ArrayList<TileType> getTypes() {
        return new ArrayList<TileType>(tileMap.keySet());
    }
    
    public HashMap<TileType, Integer> getMap() {
        return tileMap;
    }


}
