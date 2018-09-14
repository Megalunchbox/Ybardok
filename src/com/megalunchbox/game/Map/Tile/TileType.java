package com.megalunchbox.game.map.tile;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

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
