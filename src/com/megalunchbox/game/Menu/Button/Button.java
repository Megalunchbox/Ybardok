package com.megalunchbox.game.Menu.Button;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public abstract class Button {

    private static ArrayList<Button> buttons = new ArrayList<Button>();


    float height;
    float width;

    float x;
    float y;

    boolean isSelected;

    Button(float height, float width, float x, float y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        buttons.add(this);
    }

    Button(float height, float width) {
        this.height = height;
        this.width = width;
        buttons.add(this);
    }

    Button() {
        buttons.add(this);
    }

    abstract public void execute();

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public static ArrayList<Button> getButtons() {
        return buttons;
    }

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
}
