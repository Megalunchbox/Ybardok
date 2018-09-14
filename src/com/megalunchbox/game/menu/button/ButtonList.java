package com.megalunchbox.game.menu.button;


import java.util.ArrayList;

public class ButtonList {

    private final ArrayList<Button> buttonList = new ArrayList<Button>();

    public void addButton(Button button) {
        buttonList.add(button);
    }

    public ArrayList<Button> getButtonList() {
        return buttonList;
    }

    public void removeButton(Button b) {
        buttonList.remove(b);
    }

    public void getButton(int index) {
        buttonList.get(index);
    }
}
