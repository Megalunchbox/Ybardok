package com.megalunchbox.game.Menu.Button;


import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Util.Font;

public class LoadGame extends Button{

    Font font = new Font(new BitmapFont());

    public LoadGame() {
    }

    @Override
    public void execute() {
    }

    @Override
    public void render(SpriteBatch batch) {
        font.getFont().draw(batch, "Load game", getX(), getY());

    }
}
