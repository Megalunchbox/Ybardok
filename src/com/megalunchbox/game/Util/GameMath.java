package com.megalunchbox.game.Util;

public class GameMath {

    public static boolean isWithin(float x, float y, float width, float height, float inputX, float inputY) {

        if (inputX >= x && inputX <= x + width) {
            if (inputY >= y && inputY <= y + height) {
                return true;
            }
        }

        return false;
    }
}
