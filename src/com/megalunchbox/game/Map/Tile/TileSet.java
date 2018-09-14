package com.megalunchbox.game.map.tile;

import java.util.ArrayList;

public enum TileSet {

    ;

    ArrayList<TileType> tileList;


    /**
     * @param biome the biome the TileSet will belong to
     * @param tileList the list of tiles that will be in the biome
     */


     TileSet(ArrayList tileList) {
     this.tileList = tileList;
    }
    
    public ArrayList<TileType> getTypes() {
        return tileList;
    }


}
