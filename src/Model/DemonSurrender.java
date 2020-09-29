package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonSurrender extends Object {

	PApplet app;
	PImage demonS;
	
	
	public DemonSurrender(PApplet app) {
		super(app);
		this.app = app;
		demonS = app.loadImage("../resources/DemonSurrender.png");
	}

	protected void paintObject() {

		app.image(demonS, 1150, 185);
	}

}
