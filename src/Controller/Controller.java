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
	
	public void dragSailboat() {
		
		interaction.dragSailboat();
	}
	
	public void paintFriends() {
		interaction.paintFriends();
	}
	
	public void paintDemonF() {
		interaction.paintDemonF();
	}
	
	public void demonFInteraction() {
		interaction.demonFInteraction();
	}
	
	public void paintDemonS() {
		interaction.paintDemonS();
	}
	
	public void demonSInteraction() {
		interaction.demonSInteraction();
	}
	
	public void paintCart() {
		interaction.paintCart();
	}
	
	public void dragCart() {
		
		interaction.dragCart();
	}
	
}
