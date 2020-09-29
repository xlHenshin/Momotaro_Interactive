package Controller;

import Model.Interaction;
import processing.core.PApplet;



public class Controller {
	
	PApplet app;
	public Interaction interaction;
	
	public Controller(PApplet app) {
		this.app = app;
		interaction = new Interaction(app);
		
		
	}
	
	public void paintSailboat() {
		interaction.paintSailboat();	
	}
	
	public void paintFriends() {
		interaction.paintFriends();
	}
	
	public void paintDemonF() {
		interaction.paintDemonF();
	}
	
	public void paintDemonS() {
		interaction.paintDemonS();
	}
	
	public void paintCart() {
		interaction.paintCart();
	}
	
}
