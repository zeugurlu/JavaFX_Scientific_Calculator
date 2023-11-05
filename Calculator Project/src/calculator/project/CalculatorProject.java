/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.project;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ErenK
 */
public class CalculatorProject extends Application {
    
    
public void start(Stage primaryStage) throws IOException {
    
    //Zehra
    BorderPane pane = new BorderPane();
    
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("cal.fxml"));
    Parent root = loader.load();
    
    // Center the content both vertically and horizontally
    BorderPane.setAlignment(root, Pos.CENTER);
    
    pane.setCenter(root);
    Scene scene = new Scene(pane);
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
