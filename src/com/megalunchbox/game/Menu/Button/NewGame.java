package com.megalunchbox.game.menu.button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Main;
import com.megalunchbox.game.Setting;
import com.megalunchbox.game.map.Mode;
import com.megalunchbox.game.state.State;
import com.megalunchbox.game.util.Font;

public class NewGame extends Button {

    Font font;

    public NewGame(){
        font = new Font(new BitmapFont(Gdx.files.internal("main.fnt"), false));
    }

    @Override
    public void execute() {
        //TODO: world creation settings, etc

        State.setCurrentState(State.States.Game);
        Mode.setCurrentMode(Mode.REGION_MODE);
    }

    @Override
    public void render(SpriteBatch batch) {

        if (Setting.getInstance().getMainMenu().getMenuButtons().getButtonList().get(Button.getSelected()) == this) {
            font.setColor(Color.YELLOW);
        } else {
            font.setColor(Color.WHITE);
        }


        font.getFont().draw(batch, "New Game", getX(), getY());

    }
}
