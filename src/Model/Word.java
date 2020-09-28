package Model;

import java.util.ArrayList;

public class Word {
	
	public Object object;
	ArrayList<String> tale;
	
	public Word () {
		
		object = new Object(500, 400, 1, 1);
		tale = new ArrayList<String>();
	}
	
	public void paintObject() {
		
		object.paintObject();
		
	}
	
	
}
