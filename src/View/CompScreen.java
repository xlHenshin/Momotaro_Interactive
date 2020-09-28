package View;

import Controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class CompScreen {
	
	PApplet app;
	PImage composition;
	public Controller compControl;
	
	public CompScreen (PApplet app) {
		
		this.app = app;
		compControl = new Controller();
		composition = app.loadImage("../resources/Composition.png");
	}
	
	public void paintComposition() {
		app.image(composition,0,0);
	}
	
	public void paintObject() {
		
		compControl.paintObject();
		
	}
	

	
}
