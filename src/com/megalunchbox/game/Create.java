package com.megalunchbox.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Create {

    //this class will deal with everything that must be done on startup

    public static void create() {
        if (!Gdx.files.local("worlds/").isDirectory()) {
            Gdx.files.local("worlds/init.init").writeString("Writing to a file because libgdx doesn't let me simply create a directory :( \nnewline test :0", true);
        }
        if (!Gdx.files.local("settings.xd").exists()) {
            Gdx.files.local("settings.xd").writeString("", false);
        }
    }

    public static void createDirs() {

    }

    public static void getSettings() {

    }

}
