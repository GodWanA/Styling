/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package styling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Csernay Attila
 *
 * Feladat: Create an application. The root node will be VBox or HBox. Create
 * five Label objects and add them to the root node. Create a CSS file and try
 * to style the labels with CSS in different ways. The aim is to create five
 * labels with completely different styles. Create one of the labels with an
 * inline style and another one using the pseudo-class selector with hover. Try
 * to create nice and aesthetic labels! Upload the entire project in one
 * compressed file!
 */
public class Styling extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        
        for (int i = 0; i < 5; i++) {
            Label l = new Label("Lorem Ipsum");
            l.setId("l" + (i + 1));
            if(i==4){
                l.setStyle("-fx-background-color: #fff;");
            }
            
            root.getChildren().add(l);
        }        
        
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("file:Style.css");
        primaryStage.setTitle("Styling");
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
