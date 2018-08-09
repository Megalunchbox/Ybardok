package com.megalunchbox.game.Util;

public class Math {

    public boolean isWithin(float x, float y, float width, float height, float inputX, float inputY) {

        if (inputX >= x && inputX <= x + width) {
            if (inputY >= y && inputY <= y + height) {
                return true;
            }
        }

        return false;
    }
}
