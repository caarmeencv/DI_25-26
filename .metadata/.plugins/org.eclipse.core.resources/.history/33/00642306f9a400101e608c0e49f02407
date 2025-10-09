package com.jdojo.intro;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio3_ClickMe extends Application {
	
	int contador = 0;

	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		// el 10 significa los pxs le separacion entre elementos
		VBox root = new VBox(10);
		
		Label namelbl = new Label();
		
		Button btn = new Button ("Incrementar");

		//crear controlador para manexar os eventos dos botons
		 btn.setOnAction(e -> {
			 //cada vez que se pulsa el boton se le suma una a la lbl
			 contador++;
			 namelbl.setText(String.valueOf(contador));
	        });
		
		root.getChildren().addAll(namelbl, btn);

		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene);
		stage.setTitle("Click Me!");
		stage.show();

	}


}