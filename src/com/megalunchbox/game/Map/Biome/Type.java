package com.megalunchbox.game.map.biome;

public enum Type {

    GRASSLAND("Grassland", 0, new Biome(null)),
    DESERT("Desert", 1, new Biome(null)),
    RAINFOREST("Rainforest", 2, new Biome(null)),
    FOREST("Forest", 3, new Biome(null))
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
