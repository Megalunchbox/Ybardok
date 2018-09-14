package com.megalunchbox.game.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background {

    static Texture backgroundTexture;

    public static void render(SpriteBatch batch) {
        batch.draw(backgroundTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public static void setBackgroundTexture(Texture backgroundTexture) {
        Background.backgroundTexture = backgroundTexture;
    }

    public static Texture getBackgroundTexture() {
        return backgroundTexture;
    }

}
