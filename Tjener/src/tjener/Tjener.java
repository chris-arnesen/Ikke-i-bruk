/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjener;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Tjener extends Application {
    
    //Socket
    int port = 8000;
    ObjectOutputStream out;
    ObjectInputStream in;
    ServerSocket server;
    Socket socket;
    
    @Override
    public void start(Stage primaryStage) {
    
        
        BorderPane bpane = new BorderPane();
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(bpane, 600, 500);
        
        primaryStage.setTitle("Tjener");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
