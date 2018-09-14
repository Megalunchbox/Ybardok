package com.megalunchbox.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.game.Render;
import com.megalunchbox.game.input.menu.Input;
import com.megalunchbox.game.menu.button.Button;
import com.megalunchbox.game.menu.button.LoadGame;
import com.megalunchbox.game.menu.button.NewGame;
import com.megalunchbox.game.menu.button.Settings;
import com.megalunchbox.game.menu.Menu;
import com.megalunchbox.game.state.State;
import com.megalunchbox.game.test.Test;


public class Main extends ApplicationAdapter {


	SpriteBatch batch;
	OrthographicCamera cam;
	private static Menu menu = new Menu();

	@Override
	public void create () {

        Create.create();

        State.setCurrentState(State.States.Menu);
        Gdx.input.setInputProcessor(new Input(menu));

        new Settings();
        new LoadGame();
        new NewGame();

		batch = new SpriteBatch();
		cam = new OrthographicCamera();

		int y =  Gdx.graphics.getHeight() / (menu.menuButtons.getButtonList().size() * 3);
		int i = 0;
		for (Button b : menu.menuButtons.getButtonList()) {
			i++;
			b.setWidth(Gdx.graphics.getWidth()/8);
			b.setHeight(Gdx.graphics.getHeight() / (menu.menuButtons.getButtonList().size() * 3));
			b.setX(Gdx.graphics.getWidth()/2-b.getWidth()/2);
			b.setY(y*2 + y * i);
		}

		new Test();


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
			Gdx.input.setInputProcessor(new Input(menu));
		} else if(!(Gdx.input.getInputProcessor() instanceof com.megalunchbox.game.input.game.Input) && State.getCurrentState() == State.States.Game) {
			Gdx.input.setInputProcessor(new com.megalunchbox.game.input.game.Input());
		}

    }

    public void renderMenu() {
		batch.begin();
        com.megalunchbox.game.menu.Render.render(batch);
        batch.end();
    }

    public void renderGame() {
		batch.begin();
        Render.render(batch);
        batch.end();
    }

	public static Menu getMenu() {
		return menu;
	}

	public static void setMenuNull() {
		menu = null;
	}
}
