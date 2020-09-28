package View;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {

	public CompScreen compScreen;
	public FinalScreen finalScreen;
	String [] tale;
	ArrayList<String> taleWords;
	
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
		tale = loadStrings("../resources/tale.txt");
		taleWords = new ArrayList<String>();
		
		for (int i = 0; i < tale.length; i++) {
			String [] tempArray = tale[i].split(" ");
			
			for (int j = 0; j < tempArray.length; j++) {
				taleWords.add(tempArray[j]);
			}
		}
		
		
		for (String element : taleWords) {
			
			System.out.println(element);
			
		}
		
		
	}	
	
	public void draw() {
		background (0);
		compScreen.paintComposition();
		for (String element : taleWords) {
			
			if(element.equals("velero")) {
				ellipse(40,50,40,40);
			}
			
		}
	}
	
	public void mousePressed() {
		
	}
	
	public void mouseDragged() {
		
	}
	
}
