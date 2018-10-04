package com.megalunchbox.game.menu;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Main;
import com.megalunchbox.game.Setting;
import com.megalunchbox.game.menu.button.Button;

public class Render {

    public static void render(SpriteBatch batch) {
        for (Button a  : Setting.getInstance().getMainMenu().getMenuButtons().getButtonList()) {
            a.render(batch);
        }

    }

}
