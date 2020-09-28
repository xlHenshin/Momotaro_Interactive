package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonSurrender extends Object {

	PApplet app;
	PImage demonS;
	
	
	public DemonSurrender(int posx, int posy, int sizex, int sizey, PApplet app) {
		super(posx, posy, sizex, sizey);
		this.app = app;
		demonS = app.loadImage("../resources/DemonSurrender.png");
	}


	public void paintObject() {
		app.image(demonS, getPosX(), getPosY(), getSizeX(), getSizeY());
	}

}
