package com.megalunchbox.game.menu.textbox;

import java.util.ArrayList;

public class TextBoxFactory {

    private final ArrayList<TextBox> TextBoxList = new ArrayList<TextBox>();

    public TextBox buildTextBox(TextBox box) {

        box = new TextBox();
        TextBoxList.add(box);
        return box;
    }

}
