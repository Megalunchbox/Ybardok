package com.megalunchbox.game.Menu;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Menu.Button.Button;

public class Render {

    public static void render(SpriteBatch batch) {
        for (Button a  : Button.getButtons()) {
            a.render(batch);
        }

    }

}
