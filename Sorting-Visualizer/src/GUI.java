import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.sun.prism.paint.Color;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class GUI extends Application 
{
 
   private String sortingAlgo;
   private Number arraySize = 0;
   
	
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
	   
	  // Create a Button control.
	  Button Sort = new Button("Sort");
	  
	  Sort.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	
		
		    }
		});
		   
	  // Create a Label control.
	  Label SortA = new Label("Sorting Algorithm:");
	  Label Size = new Label("Size:");

	  // Create a ComboBox.
	  ComboBox<String> comboBox = new ComboBox<>();
	  comboBox.getItems().addAll("Quick Sort", "Merge Sort", "Heap Sort", "Bubble Sort");
	  
	  // Register an event handler for the ComboBox.
      comboBox.setOnAction(event ->
      {
         sortingAlgo = comboBox.getValue();
      });
	  
	  
	  // Create Slider to take input for ArraySize
	  Slider ArraySizeSlider = new Slider(0, 100, 50);
	  
	  // Get value from slider when changed
	  ArraySizeSlider.valueProperty().addListener( 
	            new ChangeListener<Number>() { 
	            public void changed(ObservableValue <? extends Number > observable, Number oldValue, Number newValue) 
	            { 
	            	arraySize = newValue;
	            } 
	        }); 

	  
	  // Put the Label and TextField in an HBox with 10 pixels of spacing.
	  HBox h1 = new HBox(15, Sort, SortA, comboBox, Size, ArraySizeSlider);
	  
	  // Put the HBox and Button in a VBox with 10 pixels of spacing.
	  VBox root = new VBox(10, h1);
	  root.setPadding(new Insets(10));
	  
	  // Create a Scene with the VBox as its root node.
	  Scene scene = new Scene(root);
	  
	  // Add the Scene to the Stage.
	  primaryStage.setScene(scene);
	  
	  
	  // Set the stage title.
	  primaryStage.setTitle("Sorting Visualizer");
	  
	  // Show the window.
	  primaryStage.show();
	  
	  
	  
	   }


}