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
		sailboat = new Sailboat(80, 625, app);
		friends = new Friends(450, 415, app);
		demonFight = new DemonFight(820, 105, app);
		demonSurrender = new DemonSurrender(1150, 185, app);
		cart = new Cart(1000, 406, app);
		
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
