package com.jdojo.intro;

import javafx.scene.paint.Color;
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio02_CambiarCorDeFondo extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();
		
		Button btnR = new Button ("Rojo");
		Button btnV = new Button ("Verde");
		Button btnA = new Button ("Azul");
		
		
		//crear controlador para manexar os eventos dos botons
		btnR.setOnAction(e -> {
		    root.setBackground(new Background (new BackgroundFill(Color.RED, null, null)));
		});

		 btnV.setOnAction(e -> {
			 root.setBackground(new Background (new BackgroundFill(Color.GREEN, null, null)));
	        });
		 btnA.setOnAction(e -> {
			 root.setBackground(new Background (new BackgroundFill(Color.BLUE, null, null)));
	        });
		
		root.getChildren().addAll(btnR, btnV, btnA);
		root.setSpacing(10);
		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		stage.setTitle("Cambiar cor de fondo");
		stage.show();

	}


}
