/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.sql.*;


public class Tjener extends Application {
    
    private Connection connectDB() {
        String url = "jdbc:sqlite:C:\\Users\\Mats Engesund\\Documents\\NetBeansProjects\\OBJ2100\\eksamen.db";
        Connection con = null; 
        try {
            con = DriverManager.getConnection(url); 
            System.out.println("Tilkobling til DB er etablert");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        Tjener app = new Tjener(); 
        app.connectDB();
        
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
