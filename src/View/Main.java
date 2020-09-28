package View;

import processing.core.PApplet;

public class Main extends PApplet {

	public CompScreen compScreen;
	public FinalScreen finalScreen;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size (1280, 720);
	}
	
	public void setup(){
		compScreen = new CompScreen(this);
		finalScreen = new FinalScreen(this);
	}	
	
	public void draw() {
		background (0);
		compScreen.paintComposition();
	}
	
	public void mousePressed() {
		
	}
	
	public void mouseDragged() {
		
	}
	
}
