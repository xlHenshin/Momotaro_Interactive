package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonFight extends Object {

	PApplet app;
	PImage demonF;
	PImage demonFzoom;
	
	public DemonFight(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		demonF = app.loadImage("../resources/DemonFight.png");
		demonFzoom = app.loadImage("../resources/DemonFightZoom.png");
	}

	protected void paintObject() {
		
		app.image(demonF, posX, posY);
	}

	protected void paintInteraction() {
		
		app.image(demonFzoom, posX, posY);
	}

}
