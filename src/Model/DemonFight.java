package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class DemonFight extends Object {

	PApplet app;
	PImage demonF;
	
	
	public DemonFight(PApplet app) {
		super(app);
		this.app = app;
		demonF = app.loadImage("../resources/DemonFight.png");
	}

	protected void paintObject() {
		
		app.image(demonF, 820, 105);
	}

}
