package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Cart extends Object {

	PApplet app;
	PImage cart;
	
	public Cart(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		cart= app.loadImage("../resources/Cart.png");
	}

	protected void paintObject() {
		
		app.image(cart, posX, posY);
		
		
	}

	protected void paintInteraction() {	
	}

	//The object will take the position of the mouse each time the mouse is clicked in a sensitive zone.
	protected void dragInteraction() {
		setPosX(app.mouseX);
		setPosY(app.mouseY);
	
	}

}
