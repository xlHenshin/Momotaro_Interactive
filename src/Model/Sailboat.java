package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Sailboat extends Object {

	PApplet app;
	PImage sailboat;
	
	public Sailboat(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		sailboat = app.loadImage("../resources/Sailboat.png");
	}

	protected void paintObject() {
		
		app.image(sailboat, posX, posY);
		
	}


	protected void paintInteraction() {
		
	}

	public void dragInteraction() {
		setPosX(app.mouseX);
		setPosY(app.mouseY);
	}

}
