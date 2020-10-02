package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Friends extends Object {

	PApplet app;
	PImage friends;
	
	public Friends(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		friends = app.loadImage("../resources/Friends.png");

	}
	
	protected void paintObject() {
		
		app.image(friends, posX, posY);
	}

	protected void paintInteraction() {
		// TODO Auto-generated method stub
		
	}
	
	

}
