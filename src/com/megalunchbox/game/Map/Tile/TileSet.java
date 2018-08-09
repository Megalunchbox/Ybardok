package com.megalunchbox.game.Map.Tile;

import com.megalunchbox.game.Map.Biome.Biome;

import java.util.ArrayList;

public enum TileSet {

    ;

    Biome biome;
    ArrayList<Tile> tileList;


    /**
     * @param biome the biome the TileSet will belong to
     * @param tileList the list of tiles that will be in the biome
     */


     TileSet(Biome biome, ArrayList tileList) {
     this.biome = biome;
     this.tileList = tileList;
    }


}
