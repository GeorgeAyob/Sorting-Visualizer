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

	Random r = new Random(); 
	
	public GraphCanvas(int s) {
		this.size = s;
		arr = new int[size];
	}
	
	public void createList() {
		initializeList();
		shuffleList();
	}
	
	public void initializeList() {
		for (int i = 0; i < size; i++) 
			arr[i] = i; 	
	}

	public void shuffleList() {
		for(int a = 0; a < 500; a++) {
			for(int i = 0; i < size; i++) {
				int rand = r.nextInt(size);
				int temp = arr[i];
				arr[i] = arr[rand];
				arr[rand] = temp;
			}
		}
	}
	
	

}
