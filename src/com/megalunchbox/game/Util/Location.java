package com.megalunchbox.game.util;



public class Location {

    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float distTo(Location location) {
        float result = (float) Math.sqrt((location.getX() - getX()) ^ 2 + (location.getY() - getY()));
        return result;
    }
}
