package com.megalunchbox.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.Game.Render;
import com.megalunchbox.game.Input.Menu.Input;
import com.megalunchbox.game.Menu.Button.Button;
import com.megalunchbox.game.Menu.Button.LoadGame;
import com.megalunchbox.game.Menu.Button.NewGame;
import com.megalunchbox.game.Menu.Button.Settings;
import com.megalunchbox.game.State.State;


public class Main extends ApplicationAdapter {


	SpriteBatch batch;
	OrthographicCamera cam;

	@Override
	public void create () {

        State.setCurrentState(State.States.Menu);
        Gdx.input.setInputProcessor(new Input());
        new LoadGame();
        new NewGame();
        new Settings();

		batch = new SpriteBatch();
		cam = new OrthographicCamera();

		int y =  Gdx.graphics.getHeight() / (Button.getButtons().size() * 3);
		int i = 0;
		for (Button b : Button.getButtons()) {
			i++;
			b.setWidth(Gdx.graphics.getWidth()/8);
			b.setHeight(Gdx.graphics.getHeight() / (Button.getButtons().size() * 3));
			b.setX(Gdx.graphics.getWidth()/2-b.getWidth()/2);
			b.setY(y*2 + y * i);
		}


	}

	@Override
	public void render () {

        Gdx.gl.glClearColor(0, 0, 0, 1);
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
		batch.dispose();
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
		batch.begin();
        com.megalunchbox.game.Menu.Render.render(batch);
        batch.end();
    }

    public void renderGame() {
		batch.begin();
        Render.render(batch);
        batch.end();
    }



}
