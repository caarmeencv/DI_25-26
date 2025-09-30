package com.jdojo.intro;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClickMe extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		int contador;
		
		contador = 0;
		
		VBox root = new VBox();
		
		Label lbl = new Label();
		
		Button btn = new Button ("Incrementar");

		//crear controlador para manexar os eventos dos botons
		 btn.setOnAction(e -> {
			 root.setStyle("-fx-background-color: red;");
	        });

		
		root.getChildren().addAll(lbl, btn);

		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		stage.setTitle("Click Me!");
		stage.show();

	}


}