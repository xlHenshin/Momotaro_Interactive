package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Word {
	  
	PApplet app;
	public Object object;
	String [] tale;
	
	public Word () {
		
		object = new Object(500, 400, 1, 1);
		
	}
	
	public void paintObject() {
		
		object.paintObject();
		
	}
	
	
}
