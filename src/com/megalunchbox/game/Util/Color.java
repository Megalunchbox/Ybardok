package com.megalunchbox.game.Util;

public class Color {

    int r;
    int g;
    int b;

    Color(int r, int g, int b) {

        if ( r < 255 && r > 0) {
            this.r = r;
        } else if (r > 255) {
            this.r = 255;
        } else {
            this.r = 0;
        }

        if (g < 255 && g > 0) {
            this.g= g;
        } else if (g > 255) {
            this.g = 255;
        } else {
            this.g = 0;
        }

        if ( r < 255 && b > 0) {
            this.b = b;
        } else if (b > 255) {
            this.b = 255;
        } else {
            this.b = 0;
        }
    }

    //TODO: this

    public void tintR(float multiplier) {


    }

    public void tintG(float multiplier) {

    }

    public void tintB(float multiplier) {

    }

    public void shadeR(float dividend) {

    }

    public void shardeG(float dividend) {

    }

    public void shadeB(float dividend) {

    }
}
