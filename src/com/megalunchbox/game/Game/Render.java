package com.megalunchbox.game.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Render {

    public static void render(SpriteBatch batch, OrthographicCamera cam, Mode mode, World world) {
        if (mode == Mode.REGION_MODE) {
        for (Region region : world.getLoadedRegions()) {
            Color color = new Color(region.getTemperature()); //TODO: improve this... can't test yet
            //draw biome region texture code
            //code to only draw stuff on camera 
            //ahahahah
        }
        }
    }


}
