package com.megalunchbox.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.megalunchbox.game.Input.Menu.Input;
import com.megalunchbox.game.Menu.Menu;
import com.megalunchbox.game.State.State;

public class Game extends ApplicationAdapter {
	
	@Override
	public void create () {
        State.setCurrentState(State.States.Menu);
        Gdx.input.setInputProcessor(new Input());
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

		if (!(Gdx.input.getInputProcessor() instanceof Input) && State.getCurrentState() == State.States.Menu) {
			Gdx.input.setInputProcessor(new Input());
		} else if(!(Gdx.input.getInputProcessor() instanceof com.megalunchbox.game.Input.Game.Input) && State.getCurrentState() == State.States.Game) {
			Gdx.input.setInputProcessor(new com.megalunchbox.game.Input.Game.Input());
		}

    }

    public void renderMenu() {

    }

    public void renderGame() {

    }



}
