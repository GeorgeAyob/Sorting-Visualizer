import java.util.ArrayList;
import java.util.Random;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape; 


public class GraphCanvas extends Shape {
	
	private Canvas canvas = new Canvas(100.0f, 100.0f); 
    private Group group = new Group(canvas); 
	private int size;
	private int[] arr;

	
	public GraphCanvas(int s) {
		this.size = s;
		arr = new int[size];
	}
	
	public void createList() {
		
		Random rand = new Random(); 
		
		for(int i = 0; i<= size; i++ ) 
			arr[i] = (int)rand.nextInt(1000); 	
	}

	
	

}
