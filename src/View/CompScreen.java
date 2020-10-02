package View;

import Controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class CompScreen {
	
	PApplet app;
	PImage composition;
	public Controller control;
	
	public CompScreen (PApplet app) {
		
		this.app = app;
		control = new Controller(app);
		composition = app.loadImage("../resources/CompositionFix.png");
	}
	
	public void paintComposition() {
		app.image(composition,639.5f,359.5f);
	}
	
	
	public void paintSailboat() {
		control.paintSailboat();	
	}
	
	public void paintFriends() {
		control.paintFriends();
	}
	
	public void paintDemonF() {
		control.paintDemonF();
	}
	
	public void demonFInteraction() {
		control.demonFInteraction();
	}
	
	public void paintDemonS() {
		control.paintDemonS();
	}
	
	public void demonSInteraction() {
		control.demonSInteraction();
	}
	
	public void paintCart() {
		control.paintCart();
	}
	

	
}
