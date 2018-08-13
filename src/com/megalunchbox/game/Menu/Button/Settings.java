package com.megalunchbox.game.Menu.Button;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Util.Font;

public class Settings extends Button{

    Font font = new Font(new BitmapFont());


    @Override
    public void execute() {

    }

    @Override
    public void render(SpriteBatch batch) {

        font.getFont().draw(batch, "Settings", getX(), getY());

    }
}
