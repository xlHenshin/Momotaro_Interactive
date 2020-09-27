package Model;

import processing.core.PApplet;

public class Cart extends Object {

	PApplet app;
	
	public Cart(int posx, int posy, int speed, int sizeX, int sizeY, PApplet app) {
		super(posx, posy, speed, sizeX, sizeY);
		this.app = app;
	}

	
	public void paintObject() {
	
	}

}
