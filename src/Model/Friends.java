package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Friends extends Object {

	PApplet app;
	PImage friends;
	
	public Friends(int posx, int posy, int sizex, int sizey, PApplet app) {
		super(posx, posy, sizex, sizey);
		this.app = app;
		friends = app.loadImage("../resources/Friends.png");
	}

	
	public void paintObject() {
		app.image(friends, getPosX(), getPosY());	
	}

}
