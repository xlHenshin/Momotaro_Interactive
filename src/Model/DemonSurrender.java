package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonSurrender extends Object {

	PApplet app;
	PImage demonS;
	PImage demonSzoom;
	
	public DemonSurrender(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		demonS = app.loadImage("../resources/DemonSurrender.png");
		demonSzoom = app.loadImage("../resources/DemonSurrenderZoom.png");
	}
	
	protected void paintObject() {

		app.image(demonS, posX, posY);
	}

	protected void paintInteraction() {
		
		app.image(demonSzoom, posX, posY);
	}


	protected void dragInteraction() {
	
	}

}
