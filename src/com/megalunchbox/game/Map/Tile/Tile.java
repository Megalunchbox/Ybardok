package com.megalunchbox.game.map.tile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.util.Location;

import java.util.ArrayList;
import java.util.HashMap;

public class Tile {

    TileType type;
    Location location;

    Tile(TileType type, Location location) {
        this.type = type;
        this.location = location;
    }

    public void render(SpriteBatch batch) {
        batch.draw(type.getTexture(), location.getX(), location.getY());
    }

    public Location getLocation() {
        return location;
    }

    public int getId() {
        return type.getId();
    }

    public enum TileSet {

        ;

        //field hashmap key is the type, integer is the chance multiplier.
        HashMap<TileType, Integer> tileMap;


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

    public enum TileType {
        ;
        protected Texture texture;
        protected int id;

        TileType(Texture texture, int id) {
            this.texture = texture;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        private static HashMap<Integer, TileType> tileMap;

        static {
            tileMap = new HashMap<Integer, TileType>();
            for (TileType tile : TileType.values()) {
                tileMap.put(tile.getId(), tile);
            }
        }

        public static TileType getTileTypeById (int id) {
            return tileMap.get(id);
        }

        public Texture getTexture() {
            return texture;
        }
    }

    public static class TileContent {

        Texture texture;
        Tile owner;

        public Texture texture() {
          return texture;
        }

        public Tile owner() {
          return owner;
        }
    }
}
