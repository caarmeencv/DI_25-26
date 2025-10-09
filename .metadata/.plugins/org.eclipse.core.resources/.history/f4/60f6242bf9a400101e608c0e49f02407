package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercicio8_MiniCalculadora extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		HBox h = new HBox();
		
		//field text para los dos operandos de la operacion y las variables
		TextField uno = new TextField();
		TextField dos = new TextField();
		uno.setPromptText("Operando 1");
		dos.setPromptText("Operando 2");
		
		//text label para el texto de resultado
		Label msg = new Label("Resultado:");
		
		//botones para cada operacion
		Button btn1 = new Button("+");
		Button btn2 = new Button("-");
		Button btn3 = new Button("x");
		Button btn4 = new Button("/");
		
		//funcions dos botons
		btn1.setOnAction(e -> {
			try {
				
		        Double primero = Double.parseDouble(uno.getText());
		        Double segundo = Double.parseDouble(dos.getText());
		        Double resultado = primero + segundo;
		        msg.setText("Resultado:\n" + resultado);
		        
		    } catch (NumberFormatException e1) {
		    	
		        msg.setText("Falta algún operando");
		        
		    }
		});

		btn2.setOnAction(e -> {
			try {
				
		        Double primero = Double.parseDouble(uno.getText());
		        Double segundo = Double.parseDouble(dos.getText());
		        Double resultado = primero - segundo;
		        msg.setText("Resultado:\n" + resultado);
		        
		    } catch (NumberFormatException e1) {
		    	
		    	msg.setText("Falta algún operando");
		        
		    }
		});
		
		btn3.setOnAction(e -> {
			try {
				
		        Double primero = Double.parseDouble(uno.getText());
		        Double segundo = Double.parseDouble(dos.getText());
		        Double resultado = primero * segundo;
		        msg.setText("Resultado:\n" + resultado);
		        
		    } catch (NumberFormatException e1) {
		    	
		    	msg.setText("Falta algún operando");
		        
		    }
		});
		
		btn4.setOnAction(e -> {
			try {
				
		        Double primero = Double.parseDouble(uno.getText());
		        Double segundo = Double.parseDouble(dos.getText());
		        Double resultado = primero / segundo;
		        msg.setText("Resultado:\n" + resultado);
		        
		        
		    } catch (NumberFormatException e1) {
		    	
		        msg.setText("¡¡ERRO!!");
		        
		    }
		});
		
		h.getChildren().addAll( uno, dos, msg, btn1, btn2, btn3, btn4);

		Scene scene = new Scene(h, 600, 50);
		stage.setScene(scene);
		stage.setTitle("MiniCalculadora");
		stage.show();
		
	}
}
