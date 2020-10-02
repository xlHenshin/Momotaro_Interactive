package Model;

import processing.core.PApplet;

public abstract class Object extends PApplet{

	PApplet app;
	
	protected int posX;
	protected int posY;
	
	public Object(int posx, int posy, PApplet app) {
		
		this.posX = posx;
		this.posY = posy;
		this.app = app;
	}

	protected abstract void paintObject();
	
	protected abstract void paintInteraction();
	
	
}
