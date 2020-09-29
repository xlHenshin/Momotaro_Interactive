package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Sailboat extends Object {

	PApplet app;
	PImage sailboat;
	
	public Sailboat(PApplet app) {
		super(app);
		this.app = app;
		sailboat = app.loadImage("../resources/Sailboat.png");
	}
	
	protected void paintObject() {
		
		app.image(sailboat, 500, 500);
	}

}
