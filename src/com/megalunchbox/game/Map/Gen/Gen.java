package com.megalunchbox.game.map.gen;

import com.megalunchbox.game.map.region.Region;
import com.megalunchbox.game.map.world.World;
import com.megalunchbox.game.util.Location;
import org.jetbrains.annotations.NotNull;

public class Gen {

    public static void genRegions(World world) {
        for(int x = 0; x < world.getWorldWidth(); x++)
            for(int y = 0; y < world.getWorldHeight(); y++) {
                world.addRegion(new Region(world, new Location(x, y)));
            }
    }

    @NotNull
    public static Region genRegion(World world, int x, int y) {
        return new Region(world, new Location(x, y));
    }


}

