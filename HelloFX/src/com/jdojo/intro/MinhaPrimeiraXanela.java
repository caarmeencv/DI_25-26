package com.jdojo.intro;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MinhaPrimeiraXanela extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();
		
		Button btn = new Button ("Cambiar titulo");
		
		
		//crear controlador para manexar o evento do boton
		 btn.setOnAction(e -> {
	            if (stage.getTitle().equals("Miña primeira xanela")) {
	                stage.setTitle("Titulo cambiado");
	            } else {
	            	stage.setTitle("Miña primeira xanela");
	            }
	        });
		
		root.getChildren().add(btn);

		Scene scene = new Scene(root, 400, 300);
		stage.setScene(scene);
		stage.setTitle("Miña primeira xanela");
		stage.show();

	}

}