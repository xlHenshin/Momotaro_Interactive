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

		firstInteraction = false;
		secondInteraction = false;
		thirdInteraction = false;
		fourthInteraction = false;
		fifthInteraction = false;

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
		
		if (interactionCounter == 5) {
			
			if (frameCount %60 == 0) {
				compSwitch = 2;
			}
			
		}

		switch (compSwitch) {
		case 1:

			compScreen.paintComposition();

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

			if (activateFriends==1) {
				friendsInteraction = true;
				compScreen.friendsInteraction();
			}

			switch (clickInteraction) {

			case 1:
				compScreen.demonFInteraction();
				demonFinteraction = true;
				if (frameCount %30 == 0) {
					clickInteraction = 0;
					demonFinteraction = false;
				} 

				break;

			case 2:

				compScreen.demonSInteraction();
				demonSinteraction = true;
				if (frameCount %30 == 0) {
					clickInteraction = 0;
					demonSinteraction = false;
				}
				break;

			default:
				break;
			}

			break;

		case 2:

			finalScreen.paintFinalScreen();

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
		
		if (compSwitch==2) {
			
			if (mouseX > 583 && mouseX < 583+114
					&& mouseY > 430 && mouseY < 430+55) {
				exit ();
			}
			
		}
	}

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
