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
	}
	
	public void paintComposition() {
		app.rect(200, 200, 200, 200);
	}
	
	public void paintObject() {
		
		compControl.paintObject();
		
	}
	

	
}
