package Model;

import processing.core.PApplet;

public class Object {

	PApplet app;
	
	private int posX;
	private int posY;
	private int speed;
	private int sizeX;
	private int sizeY;
	
	public Object (int posx, int posy, int sizex, int sizey) {
		this.posX = posx;
		this.posY = posy;
		this.sizeX = sizex;
		this.sizeY = sizey;
		
		this.speed = 5;
		
	}
	
	public void paintObject() {
	}
	
	public void objectInteraction() {
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	
	
}
