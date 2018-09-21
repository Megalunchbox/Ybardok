package com.megalunchbox.game.map.biome;

public enum Type {

    GRASSLAND("Grassland", 0),
    DESERT("Desert", 1),
    RAINFOREST("Rainforest", 2),
    FOREST("Forest", 3)
    ;

    private String name;
    private int id;
    private Biome biome;

    Type(String name, int id, Biome biome) {
    this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public Biome getBiome() {
        return biome;
    }


}
