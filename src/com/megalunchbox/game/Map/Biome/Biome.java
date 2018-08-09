package com.megalunchbox.game.Map.Biome;

import java.util.HashMap;

public class Biome {


    /**
     * @var temperatureMap should contain three string keys, high, low, and average for the biome temperatures.
     */


    HashMap<String, Integer> temperatureMap = new HashMap<String, Integer>();

    public Biome(int high, int low, int average) {

        temperatureMap.put("high", high);
        temperatureMap.put("low", low);
        temperatureMap.put("average", average);

    }

}
