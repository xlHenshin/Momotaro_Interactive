package Model;

import processing.core.PApplet;

public class Interaction extends PApplet{

	PApplet app;
	public Sailboat sailboat;
	public Object friends;
	public Object demonFight;
	public Object demonSurrender;
	public Cart cart;

	
	public Interaction(PApplet app) {
		
		this.app=app;
		sailboat = new Sailboat(80, 625, app);
		friends = new Friends(450, 415, app);
		demonFight = new DemonFight(820, 105, app);
		demonSurrender = new DemonSurrender(1150, 185, app);
		cart = new Cart(1000, 406, app);
	
		
	}
	
	public void paintSailboat() {
	
		sailboat.paintObject();
	}
	
	public void dragSailboat() {
		
		sailboat.dragInteraction();
	}
	
	
	public void paintFriends() {
		
		friends.paintObject();
	}
	
	public void friendsInteraction() {
		friends.paintInteraction();
	}
	
	public void paintDemonF() {
		
		demonFight.paintObject();
	}
	
	public void demonFInteraction() {
		demonFight.paintInteraction();
	}
	
	public void paintDemonS() {
	
		demonSurrender.paintObject();
	}
	
	public void demonSInteraction() {
		demonSurrender.paintInteraction();
	}
	
	public void paintCart() {
	
		cart.paintObject();
	}
	
	public void dragCart() {
		
		cart.dragInteraction();
	}

}
