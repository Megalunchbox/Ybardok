package com.megalunchbox.game.game;

public class Race {



    public enum RaceType {

        Orc(0, "orc"),
        Dwarf(1, "dwarf"),
        Elf(2, "elf"),
        Human(3, "human");

        RaceType(int id, String name) {
            this.id = id;
            this.name = name;
        }

        int id;
        String name;

    }


    public static RaceType[] getRaceTypes() {
        return RaceType.values();
    }
}
