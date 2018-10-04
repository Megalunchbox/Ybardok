package com.megalunchbox.game.test;

import com.megalunchbox.game.Setting;
import com.megalunchbox.game.util.SimplexNoise_octave;

import java.util.Random;

public class Test {

        static SimplexNoise_octave noise_octave = new SimplexNoise_octave(new Random().nextInt(10000+1));

        public static void main(String []args) {
            for (int y = 0; y < 10; y++)
            for (int x = 0; x < 10 ; x++)
            System.out.println("x: " + x + " y: " + y + " noise result: " + 100 * noise_octave.noise(x, y));
        }



}
