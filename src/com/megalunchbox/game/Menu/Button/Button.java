package com.megalunchbox.game.Menu.Button;

import java.util.ArrayList;

abstract class Button {

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

    abstract void onClick();

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


}
