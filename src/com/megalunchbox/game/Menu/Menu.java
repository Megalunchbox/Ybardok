package com.megalunchbox.game.menu;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.menu.button.ButtonList;
import com.megalunchbox.game.menu.page.Page;
import com.megalunchbox.game.menu.page.PageFactory;

public class Menu {

    public ButtonList menuButtons = new ButtonList();

    private PageFactory pageFactory;

    public Menu() {

    }

    public void onMenuState() {
        Page menu = new Page();
        pageFactory.buildPage(menu.withButtons(menuButtons));
    }

    public static void render(SpriteBatch batch) {
        Background.render(batch);
    }

    public ButtonList getMenuButtons() {
        return menuButtons;
    }

    public PageFactory getPageFactory() {
        return pageFactory;
    }
}
