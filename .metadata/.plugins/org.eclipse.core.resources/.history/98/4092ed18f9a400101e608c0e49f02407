package com.jdojo.intro;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio7_CicloDeVida extends Application {
	
	TextArea TextArea = new TextArea();	
	
	public Exercicio7_CicloDeVida() {
		String name = Thread.currentThread().getName();
		System.out.println("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do constructor: (" + name + ")");
		TextArea.appendText("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do constructor: (" + name + ")\n");
	}


	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void init() {
		String name = Thread.currentThread().getName();
		System.out.println("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do init(): (" + name + ")");
		TextArea.appendText("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do init(): (" + name + ")\n");
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		String name = Thread.currentThread().getName(); 
		System.out.println("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do start(): (" + name + ")");
		TextArea.appendText("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
				"] Fío do start(): (" + name + ")\n");
		
		VBox root = new VBox();
		
		//label que aparece debaixo do text area de cor vermella
		Label lbl = new Label();
		
		//estilo e texto do label
		lbl.setStyle("-fx-padding: 5px; -fx-text-fill: red;");
        lbl.setText("Pecha a aplicación e comproba na consola a mensaxe");

		
		// boton para pechar a aplicacion
		Button btn = new Button("Pechar a Aplicación");
		
		// funcion do boton para pechar a aplicacion
		btn.setOnAction(e -> {
			stage.close();
		});
		

		root.getChildren().addAll(TextArea, lbl, btn);
		

		Scene scene = new Scene(root, 400, 300);
		stage.setScene(scene);
		stage.setTitle("Ciclo de Vida con Consola");
		stage.show();

	}
	
		@Override
		public void stop() {
			String name = Thread.currentThread().getName();
			System.out.println("[" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()) +
					"] Fío do stop(): (" + name + ")");
		}

}