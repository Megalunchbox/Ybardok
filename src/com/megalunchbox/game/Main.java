package com.megalunchbox.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.game.game.Render;
import com.megalunchbox.game.input.menu.Input;
import com.megalunchbox.game.map.Mode;
import com.megalunchbox.game.map.gen.Gen;
import com.megalunchbox.game.menu.button.Button;
import com.megalunchbox.game.menu.button.LoadGame;
import com.megalunchbox.game.menu.button.NewGame;
import com.megalunchbox.game.menu.button.Settings;
import com.megalunchbox.game.state.State;

import static com.megalunchbox.game.state.State.States.Menu;
import com.megalunchbox.game.map.world.World;


public class Main extends ApplicationAdapter {


	SpriteBatch batch;
	OrthographicCamera cam;
	static Mode mode;
	World world;

    @Override
	public void create () {

        world = new World(20, 20, "test");
        Gen.genRegions(world);

        Create.create();

        State.setCurrentState(Menu);
        Gdx.input.setInputProcessor(new Input(Setting.getInstance().getMainMenu()));

        Setting.getInstance().getMainMenu().getMenuButtons().addButton(new NewGame());
        Setting.getInstance().getMainMenu().getMenuButtons().addButton(new LoadGame());
		Setting.getInstance().getMainMenu().getMenuButtons().addButton(new Settings());

		batch = new SpriteBatch();
		cam = new OrthographicCamera();

		int y =  Gdx.graphics.getHeight() / (Setting.getInstance().getMainMenu().getMenuButtons().getButtonList().size() * 3);
		int i = 0;
		for (Button b : Setting.getInstance().getMainMenu().getMenuButtons().getButtonList()) {
			i++;
			b.setWidth(Gdx.graphics.getWidth()/8);
			b.setHeight(Gdx.graphics.getHeight() / (Setting.getInstance().getMainMenu().getMenuButtons().getButtonList().size() * 3));
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

	    if (State.getCurrentState() == Menu) {
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

		if (!(Gdx.input.getInputProcessor() instanceof Input) && State.getCurrentState() == Menu) {
			Gdx.input.setInputProcessor(new Input(Setting.getInstance().getMainMenu()));
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
        Render.render(batch, cam, mode, world);
        batch.end();
    }


}

