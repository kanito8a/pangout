package com.pangout.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PangoutGame extends ApplicationAdapter {
	
	SpriteBatch batch;
	Texture img;
	float x = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("data/redbubble.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, 0);
		batch.end();
		x+=1;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
