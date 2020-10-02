package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonFight extends Object {

	PApplet app;
	PImage demonF;
	
	public DemonFight(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		demonF = app.loadImage("../resources/DemonFight.png");
		
	}

	protected void paintObject() {
		
		app.image(demonF, posX, posY);
	}
	
	public void fightInteraction() {
		
		app.image(demonF, posX, posY);
	}

}
