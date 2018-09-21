package com.megalunchbox.game.menu.button;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Button {


    private float height;
    private float width;

    private float x;
    private float y;

    public static int selected = 0;

    Button(float height, float width, float x, float y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    Button(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public Button() {

    }


    abstract public void execute();

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public abstract void render(SpriteBatch batch);

    public static int getSelected() {
        return selected;
    }

    public static void setSelected(int selected) {
        Button.selected = selected;
    }
}
