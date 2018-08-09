package com.megalunchbox.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.megalunchbox.game.State.State;

public class Game extends ApplicationAdapter {
	
	@Override
	public void create () {
        State.setCurrentState(State.States.Menu);
	}

	@Override
	public void render () {

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	    handleInput();
	    update();

	    if (State.getCurrentState() == State.States.Menu) {
	        renderMenu();
        } else {
	        renderGame();
        }


	}
	
	@Override
	public void dispose () {
	}

	public void update() {

    }

    public void handleInput() {

    }

    public void renderMenu() {

    }

    public void renderGame() {

    }



}
