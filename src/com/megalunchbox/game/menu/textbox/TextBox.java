package com.megalunchbox.game.menu.textbox;

public class TextBox {

    String name;
    String input;

    private float width;
    private float height;
    private float x;
    private float y;

    public static boolean selected;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public static void setSelected(boolean selected) {
        TextBox.selected = selected;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
