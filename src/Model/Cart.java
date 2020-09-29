package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Cart extends Object {

	PApplet app;
	PImage cart;
	
	
	public Cart (PApplet app) {
		super(app);
		this.app = app;
		cart= app.loadImage("../resources/Cart.png");
	}

	protected void paintObject() {
		
		app.image(cart, 1000, 406);
	}

}
