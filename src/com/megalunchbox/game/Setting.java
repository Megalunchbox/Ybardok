package com.megalunchbox.game;

public class Setting {

    private static int displayHeight;
    private static int displayWidth;
    private static boolean fullScreen;
    private int tileSize;

    Setting(int displayHeight, int displayWidth, boolean fullScreen, int tileSize) {
        this.displayHeight = displayHeight;
        this.displayWidth = displayWidth;
        this.fullScreen = fullScreen;
        this.tileSize = tileSize;
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
