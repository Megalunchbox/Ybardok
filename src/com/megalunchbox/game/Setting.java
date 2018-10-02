package com.megalunchbox.game;

import com.megalunchbox.game.menu.Menu;

public class Setting {

    private int displayHeight;
    private int displayWidth;
    private boolean fullScreen;

    private static Setting setting;

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
}
