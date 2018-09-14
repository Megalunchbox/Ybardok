package com.megalunchbox.game.map.biome;

public enum Type {

    GRASSLAND("Grassland", 0),
    DESERT("Desert", 1),
    RAINFOREST("Rainforest", 2),
    FOREST("Forest", 3)
    ;

    private String name;
    private int id;

    Type(String name, int id) {
    this.name = name;
    }

    public String getName() {
        return name;
    }



}
