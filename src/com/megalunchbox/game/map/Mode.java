package com.megalunchbox.game.map;

import java.util.HashMap;

public enum Mode {

    REGIONMODE(0),
    MENUMODE(1),
    CHUNKMODE(2)
    ;

    public static Mode currentMode;
    int id;

    Mode(int id) {
        this.id = id;
    }

    public static void setCurrentMode(Mode currentMode) {
        Mode.currentMode = currentMode;
    }

    public static Mode getCurrentMode() {
        return currentMode;
    }

    public int getId() {
        return id;
    }

    private static HashMap<Integer, Mode> modeMap;

    static {
        modeMap = new HashMap<Integer, Mode>();
        for (Mode tile : Mode.values()) {
            modeMap.put(tile.getId(), tile);
        }
    }

    public static Mode getModeById (int id) {
        return modeMap.get(id);
    }


}
