package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Friends extends Object {

	PApplet app;
	PImage friends;
	
	int x;
	int y;
	
	public Friends(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		x = posX;
		y = posY;
		this.app = app;
		friends = app.loadImage("../resources/Friends.png");

	}
	
	protected void paintObject() {
		
		app.image(friends, x, y);
	}

	protected void paintInteraction() {
		
		
	}

	protected void dragInteraction() {
		
	}
	
	

}
