/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Klient extends Application {
    
    //Socket
    int port = 8000;
    String host ="localhost";
    ObjectOutputStream out;
    ObjectInputStream in;
    Socket socket;
    
    BorderPane bpane;
    Pane top = new Pane();
    Pane center = new Pane();
    Pane bottom = new Pane();
    Label topLabel = new Label("Tast inn brukernavn: ");
    TextField txt = new TextField();
    Button btn = new Button("Log inn");
    
    
    
    @Override
    public void start(Stage primaryStage) {
    
        bpane = new BorderPane();
        bpane.setTop(top);
        bpane.setCenter(center);
        bpane.setBottom(bottom);
        
        top.setPrefHeight(100);
        top.setStyle("-fx-border-color: black; -fx-background-color: grey;");
        center.setPrefHeight(300);
        center.setStyle("-fx-border-color: black; -fx-background-color: white;");
        bottom.setPrefHeight(100);
        bottom.setStyle("-fx-border-color: black; -fx-background-color: grey;");
        topLabel.setStyle("-fx-text-fill:BLACK; -fx-font-size: 30;");
        
        top.getChildren().add(topLabel);
        topLabel.setLayoutX(25);
        topLabel.setLayoutY(25);
        
        center.getChildren().add(txt);
        txt.setLayoutX(150);
        txt.setLayoutY(140);
        center.getChildren().add(btn);
        btn.setOnAction((event) -> {
            bpane.getChildren().remove(center); 
            bpane.setCenter(getChatroomPane());
        });
        btn.setLayoutX(350);
        btn.setLayoutY(140);
        
       
        
        Scene scene = new Scene(bpane, 600, 500);
        
        primaryStage.setTitle("Klient");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public Pane getChatroomPane() {
        Pane chatroomPane = new Pane(); 
        chatroomPane.setPrefHeight(300);
        chatroomPane.setStyle("-fx-border-color: black; -fx-background-color: white;");
        
        Button chatroom1 = new Button("Chatroom1"); 
        chatroom1.setStyle("-fx-background-color: white; -fx-border: 2px solid blac;");
        chatroomPane.getChildren().add(top);
        
        return chatroomPane; 
    }
    
}
