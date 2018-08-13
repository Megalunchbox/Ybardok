package com.megalunchbox.game.Input.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.megalunchbox.game.Menu.Button.Button;
import com.megalunchbox.game.Util.GameMath;

import java.lang.reflect.InvocationTargetException;

public class Input implements InputProcessor{

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        if (button == com.badlogic.gdx.Input.Buttons.LEFT) {
            for (Button b : Button.getButtons()) {
                if (GameMath.isWithin(b.getX(), b.getY(), b.getWidth(), b.getHeight(), screenX, screenY)) {
                    try {
                        //can we just admire that I did this without it even crossing my mind I could just do b.onClick();
                        b.getClass().getMethod("execute").invoke(b);
                    } catch (NoSuchMethodException e) {
                        System.out.println(e.toString());
                    } catch (InvocationTargetException e) {
                        System.out.println(e.toString());
                    } catch (IllegalAccessException e) {
                        System.out.println(e.toString());
                    }
                }
            }

            return true;
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
