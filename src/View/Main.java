package View;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {
	
	PApplet app;
	public CompScreen compScreen;
	public FinalScreen finalScreen;
	String [] tale;
	ArrayList<String> taleWords;
	int clickInteraction;
	
	boolean demonFinteraction;
	boolean demonSinteraction;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size (1280, 720);
	}
	
	public void setup(){
		compScreen = new CompScreen(this);
		finalScreen = new FinalScreen(this);
		
		clickInteraction = 0;
		demonFinteraction = false;
		demonSinteraction = false;
		
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
		imageMode(CENTER);
		
		
		compScreen.paintComposition();
		//compScreen.paintObject();
		for (String element : taleWords) {
			

			if(element.equals("velero")) {
				
				compScreen.paintSailboat();
			}
			
			if(element.equals("irrumpieron")) {
				
				compScreen.paintFriends();
			}
			
			if(element.equals("siesta")) {
				
				if(demonFinteraction == false) {
				compScreen.paintDemonF();
				}
			}
			
			if(element.equals("bramaron")) {
				
				if(demonSinteraction == false) {
					compScreen.paintDemonS();
					}
			}
			
			if(element.equals("monedas")) {
				
				compScreen.paintCart();
			}
			
		}
		
		switch (clickInteraction) {
		case 1:
			
			break;
			
		case 2:
			compScreen.demonFInteraction();
			demonFinteraction = true;
			if (frameCount %60 == 0) {
                clickInteraction = 0;
				demonFinteraction = false;
			} 
			
			break;
			
		case 3:
			
			compScreen.demonSInteraction();
			demonSinteraction = true;
			if (frameCount %60 == 0) {
                clickInteraction = 0;
				demonSinteraction = false;
			}
			break;

		default:
			break;
		}
	}
	
	
	public void mouseClicked() {
		PApplet.println(mouseX);
		PApplet.println(mouseY);
		
		if (mouseX > 386 && mouseX < 386+140 
				&& mouseY > 334 && mouseY < 334+158) {
				
			}
		
		if (mouseX > 716 && mouseX < 716+240 
			&& mouseY > 28 && mouseY < 28+174) {
			
			
			clickInteraction = 2;
		}
		
		if (mouseX > 1074 && mouseX < 1074+175 
				&& mouseY > 79 && mouseY < 79+217) {
			clickInteraction = 3;
			}
	}
	
	public void mouseDragged() {
		
	}
	
}
