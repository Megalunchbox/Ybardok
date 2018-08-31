package com.megalunchbox.game.Map;

public class Map {
    
    private String name;
    private String mid;
    
    
    public Map(String name, String mid) {
        this.name = name;
        this.mid = mid;
    }

    public static void loadMap() {

    }

    public static Map createMap(String name, String mid) {
        Map newMap = new Map(name, mid);
        
        return newMap;
    }

    public static void copyMap() {

    }

    public static void deleteMap(String name) {
    }
    
    public static void deleteMap(Map map) {
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMid() {
        return mid;
    } 
    
    public void loadRegion() {
        
    }
    
    public void generateRegion() {
        
    }
    
    public void unloadRegion() {
        
    }
    
}
