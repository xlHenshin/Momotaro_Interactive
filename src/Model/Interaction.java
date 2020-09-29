package Model;

import processing.core.PApplet;

public class Interaction extends PApplet{

	PApplet app;
	public Object sailboat;
	public Object friends;
	public Object demonFight;
	public Object demonSurrender;
	public Object cart;
	
	public Interaction(PApplet app) {
		
		this.app=app;
		sailboat = new Sailboat(app);
		friends = new Friends(app);
		demonFight = new DemonFight(app);
		demonSurrender = new DemonSurrender(app);
		cart = new Cart(app);
		
	}

	
	public void paintSailboat() {
	
		sailboat.paintObject();
	}
	
	public void paintFriends() {
		
		friends.paintObject();
	}
	
	public void paintDemonF() {
		
		demonFight.paintObject();
	}
	
	public void paintDemonS() {
	
		demonSurrender.paintObject();
	}
	
	public void paintCart() {
	
		cart.paintObject();
	}

}
