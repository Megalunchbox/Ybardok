package com.megalunchbox.game.map.tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.util.Location;

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
}
