package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonFight extends Object {

	PApplet app;
	PImage demonF;
	
	
	public DemonFight(int posx, int posy, int sizex, int sizey, PApplet app) {
		super(posx, posy, sizex, sizey);
		this.app = app;
		demonF = app.loadImage("../resources/DemonFight.png");
	}


	public void paintObject() {
		app.image(demonF, getPosX(), getPosY(), getSizeX(), getSizeY());
	}

}
