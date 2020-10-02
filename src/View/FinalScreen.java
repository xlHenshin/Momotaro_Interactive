package View;

import processing.core.PApplet;
import processing.core.PImage;

public class FinalScreen {
	
	PApplet app;
	PImage finalscreen;
	
	public FinalScreen (PApplet app) {
		
		this.app = app;
		
		finalscreen = app.loadImage("../resources/FinalScreen.png");
	}
	
	public void paintFinalScreen() {
		
		app.image(finalscreen,639.5f,359.5f);
	}
	
}
