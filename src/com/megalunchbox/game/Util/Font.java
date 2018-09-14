package com.megalunchbox.game.util;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Font {

    BitmapFont font;

    public Font(BitmapFont font) {
        this.font = font;
    }

    public BitmapFont getFont() {
        return font;
    }

    public void setColor(Color color) {
        font.setColor(color);
    }

}
