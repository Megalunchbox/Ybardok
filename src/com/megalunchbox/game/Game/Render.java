package com.megalunchbox.game.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Setting;
import com.megalunchbox.game.map.Mode;
import com.megalunchbox.game.map.region.Region;
import com.megalunchbox.game.map.world.World;

public class Render {

    public static void render(SpriteBatch batch, OrthographicCamera cam, Mode mode, World world) {
        if (mode == Mode.REGION_MODE) {
        for (Region region : world.getLoadedRegions()) {
            region.render(batch);
        }
        }
    }


}
