package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Cart extends Object {

	PApplet app;
	PImage cart;
	
	
	public Cart (int posx, int posy, int sizex, int sizey, PApplet app) {
		super(posx, posy, sizex, sizey);
		this.app = app;
		cart= app.loadImage("../resources/Cart.png");
	}

	
	public void paintObject() {
		app.image(cart, getPosX(), getPosY());
	}

}
