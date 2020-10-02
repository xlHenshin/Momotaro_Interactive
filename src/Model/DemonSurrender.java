package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonSurrender extends Object {

	PApplet app;
	PImage demonS;
	
	public DemonSurrender(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		demonS = app.loadImage("../resources/DemonSurrender.png");
	}
	
	protected void paintObject() {

		app.image(demonS, posX, posY);
	}

}
