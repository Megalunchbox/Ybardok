package com.megalunchbox.game;

import com.megalunchbox.game.menu.Menu;

public class Setting {

    private static int displayHeight;
    private static int displayWidth;
    private static boolean fullScreen;

    Setting(int displayHeight, int displayWidth, boolean fullScreen) {
        this.displayHeight = displayHeight;
        this.displayWidth = displayWidth;
        this.fullScreen = fullScreen;
    }

    public static int getDisplayHeight() {
        return displayHeight;
    }

    public static int getDisplayWidth() {
        return displayWidth;
    }

    public static boolean isFullScreen() {
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
