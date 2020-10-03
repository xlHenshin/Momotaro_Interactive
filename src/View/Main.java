package View;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {

	PApplet app;
	public CompScreen compScreen;
	public FinalScreen finalScreen;
	String [] tale;
	ArrayList<String> finalTale;
	ArrayList<String> taleWords;
	int clickInteraction;
	int compSwitch;
	int interactionCounter;
	int activateFriends;

	boolean friendsInteraction;
	boolean demonFinteraction;
	boolean demonSinteraction;

	boolean firstInteraction;
	boolean secondInteraction;
	boolean thirdInteraction;
	boolean fourthInteraction;
	boolean fifthInteraction;

	public static void main(String[] args) {

		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size (1280, 720);
	}

	public void setup(){
		compScreen = new CompScreen(this);
		finalScreen = new FinalScreen(this);

		interactionCounter = 0;
		activateFriends = 0;
		clickInteraction = 0;
		compSwitch = 1;

		friendsInteraction = false;
		demonFinteraction = false;
		demonSinteraction = false;

		//These booleans allow one interaction to be added at a time (in interactionCounter).
		firstInteraction = false;
		secondInteraction = false;
		thirdInteraction = false;
		fourthInteraction = false;
		fifthInteraction = false;

		tale = loadStrings("../resources/tale.txt");
		taleWords = new ArrayList<String>();
		finalTale = new ArrayList<String>();

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
		
		// If user does all the interactions (5 in total), compSwitch value will be 2.
		//Then Final Screen will be displayed.
		if (interactionCounter == 5) {
			
			if (frameCount %60 == 0) {
				compSwitch = 2;
			}
			
		}

		//This switch changes the screens between Composition Screen and Final Screen.
		//In case 1, all interactive objects are painted.
		switch (compSwitch) {
		case 1:

			compScreen.paintComposition();
			
			//This for finds 5 keywords to paint the objects
			for (String element : taleWords) {


				if(element.equals("velero")) {

					compScreen.paintSailboat();
				}

				if(element.equals("irrumpieron")) {

					if(friendsInteraction == false) {
						compScreen.paintFriends();
					}

				}

				if(element.equals("siesta")) {
					
					//demonFinteraction boolean makes the object disappear when the interaction is activated
					if(demonFinteraction == false) {	
						compScreen.paintDemonF();
					}
				}

				if(element.equals("bramaron")) {
					
					//same as the previous boolean
					if(demonSinteraction == false) {
						compScreen.paintDemonS();
					}
				}

				if(element.equals("monedas")) {

					compScreen.paintCart();
				}

			}

			// This if receives a signal (activateFriends) from mouseDragged to paint the first interaction.
			if (activateFriends==1) {
				friendsInteraction = true;
				compScreen.friendsInteraction();
			}

			// clickInteraction switch paints third and fourth interactions.
			// Each case receives a signal to hide the object while the interaction is happening.
			switch (clickInteraction) {

			case 1:
				compScreen.demonFInteraction();
				demonFinteraction = true;
				if (frameCount %30 == 0) {	//The interaction lasts half a second
					clickInteraction = 0;
					demonFinteraction = false;	//Hides the object
				} 

				break;

			case 2:

				compScreen.demonSInteraction();
				demonSinteraction = true;
				if (frameCount %30 == 0) {	//The interaction lasts half a second
					clickInteraction = 0;
					demonSinteraction = false;	//Hides the object
				}
				break;

			default:
				break;
			}

			break;
			
		//compSwitch case 2
		case 2:

			finalScreen.paintFinalScreen();
			
			break;

		default:
			break;
		}

	}

	
	//mouseCliccked method checks clicks in the screen in a specific sensitive zone (interactive objects).
	//When clicked, it sends a message to draw method to paint interactions, while static objects in the composition disappear.
	//It is necessary to send a message to draw method because clicks last less than half a second.
	public void mouseClicked() {

		if (mouseX > 386 && mouseX < 386+140 
				&& mouseY > 334 && mouseY < 334+158) {
			activateFriends=1;

			if (secondInteraction==false) {
				interactionCounter+= 1;
				secondInteraction = true;
			}
		
			System.out.println(interactionCounter);

		}

		if (mouseX > 716 && mouseX < 716+240 
				&& mouseY > 28 && mouseY < 28+174) {
			clickInteraction = 1;

			if (thirdInteraction==false) {
				interactionCounter+= 1;
				thirdInteraction = true;
			}
			
			System.out.println(interactionCounter);
		}

		if (mouseX > 1074 && mouseX < 1074+175 
				&& mouseY > 79 && mouseY < 79+217) {
			clickInteraction = 2;

			if (fourthInteraction==false) {
				interactionCounter+= 1;
				fourthInteraction = true;
			}
			
			System.out.println(interactionCounter);

		}
		
		//This click only works in the Final Screen.
		if (compSwitch==2) {
			
			if (mouseX > 583 && mouseX < 583+114
					&& mouseY > 430 && mouseY < 430+55) {
				exit ();
			}
			
		}
	}
	
	//This method calls drag interactions methods from model package (specifically from each object).
	//When mouse is pressed in a specific sensitive zone, the object will follow mouse position.
	
	public void mouseDragged() {

		if (mouseX > 30 && mouseX < 30+332 
				&& mouseY > 377 && mouseY < 377+317) {
			compScreen.dragSailboat();

			if (firstInteraction==false) {
				interactionCounter+= 1;
				firstInteraction = true;
			}
			
			System.out.println(interactionCounter);
			
		}

		if (mouseX > 603 && mouseX < 603+464 
				&& mouseY > 355 && mouseY < 355+350) {

			compScreen.dragCart();

			if (fifthInteraction==false) {
				interactionCounter+= 1;
				fifthInteraction = true;
			}
			
			System.out.println(interactionCounter);

		}
	}

}
