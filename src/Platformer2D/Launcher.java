package Platformer2D;

import gameEngine2D.*;
import gameEngine2D.Tile;
import processing.core.PApplet;

public class Launcher extends BaseLauncher{
	public boolean started = false;
	int waiting = 0;
	
	public Launcher(PApplet p) {
		super(p);
	}

	public void StartGame() {
		if(this.started) 
			return;
		
			super.StartGame();
			if(waiting < 90) {
				parent.background(0);
				parent.text("Game Starting", parent.width / 2, parent.height / 2);
				waiting++;
				return;
			}
		
			LevelLoad();
			
	}
	
	public void LevelLoad() {
		Player player = new Player(parent, parent.width / 2, parent.height / 2, 60,60);
		player.start();
		this.gameManager.addObject(player);
		this.gameManager.addPlayerGameObjects(player);
		int platforms = 100;
		int tw = parent.width / 40;
		int th = parent.height / 10;
		int numPlatformsX = 2 * parent.width / tw;
		int numPlatformsY = 2 * parent.height / th;
		
		Tile platform;
		for (int i = 0; i < platforms; i++) {
			int x = (int) parent.random(0, numPlatformsX) * tw;
			int y = (int) parent.random(-numPlatformsY, numPlatformsY) * th;
			platform = new Tile(parent, x, y, tw, th, parent.random(0, 255),parent.random(0, 255),parent.random(0, 255),parent.random(255));
			platform.start();
			this.gameManager.addObject(platform);
			this.gameManager.addGameBoundingBoxes(platform);
	}
	}
	
}
