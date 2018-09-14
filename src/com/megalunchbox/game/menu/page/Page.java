

import java.util.ArrayList;

public class Page {

    private ArrayList<TextBox> textBoxes;
    private ButtonList buttons;

    public Page() {

    }

    public Page(ArrayList<TextBox> textBoxes, ButtonList buttons) {
        this.textBoxes = textBoxes;
        this.buttons = buttons;
    }

    public Page withTextBoxes(ArrayList<TextBox> textBoxes) {
        this.textBoxes = textBoxes;
        return this;
    }

    public Page withButtons(ButtonList buttons) {
        this.buttons = buttons;
        return this;
    }

    public ArrayList<TextBox> getTextBoxes() {
        return textBoxes;
    }

    public ButtonList getButtons() {
        return buttons;
    }

}
