package Model;

import processing.core.PApplet;

public abstract class Object extends PApplet{

	PApplet app;
	
	public Object(PApplet app) {
		this.app = app;
	}

	protected abstract void paintObject();
	
}
