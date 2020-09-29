package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Friends extends Object {

	PApplet app;
	PImage friends;
	
	public Friends(PApplet app) {
		super(app);
		this.app = app;
		friends = app.loadImage("../resources/Friends.png");
	}

	protected void paintObject() {
		
		app.image(friends, 450, 415);
	}

}
