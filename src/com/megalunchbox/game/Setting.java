package com.megalunchbox.game;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.game.menu.Menu;
import com.megalunchbox.game.util.SimplexNoise_octave;

import java.io.Serializable;
import java.util.Random;

public class Setting implements Serializable {

    transient private Menu mainMenu = new Menu();
    transient private int displayHeight;
    transient private int displayWidth;
    transient private boolean fullScreen;
    private SimplexNoise_octave noise = new SimplexNoise_octave(new Random().nextInt(10000) + 1);
    Main main;

    private static Setting setting = new Setting(Gdx.graphics.getHeight(), Gdx.graphics.getWidth(), Gdx.graphics.isFullscreen());

    public static Setting getInstance() {
        return setting;
    }

    Setting(int displayHeight, int displayWidth, boolean fullScreen) {
        this.displayHeight = displayHeight;
        this.displayWidth = displayWidth;
        this.fullScreen = fullScreen;
        setting = this;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setDisplayHeight(int displayHeight) {
        this.displayHeight = displayHeight;
    }

    public void setDisplayWidth(int displayWidth) {
        this.displayWidth = displayWidth;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    public SimplexNoise_octave getNoise() {
        return noise;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
