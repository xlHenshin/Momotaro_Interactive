package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Sailboat extends Object {

	PApplet app;
	PImage sailboat;
	
	public Sailboat(int posx, int posy, int sizex, int sizey, PApplet app) {
		super(posx, posy, sizex, sizey);
		this.app = app;
		sailboat = app.loadImage("../resources/Sailboat.png");
	}

	
	public void paintObject() {
		app.image(sailboat, getPosX(), getPosY());
		
	}

}
