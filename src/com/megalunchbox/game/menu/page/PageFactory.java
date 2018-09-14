package com.megalunchbox.game.menu.page;

import java.util.ArrayList;

public class PageFactory {

    private Page currentPage;
    private final ArrayList<Page> pages = new ArrayList<Page>();

    public Page buildPage(Page p) {
        pages.add(p);
        return p;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public Page getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
    }
}
