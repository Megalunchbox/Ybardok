package com.megalunchbox.game.Map.Tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Util.Location;

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
