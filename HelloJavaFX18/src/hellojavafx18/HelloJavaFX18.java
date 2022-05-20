/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellojavafx18;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kashi
 */
public class HelloJavaFX18 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // right click Libraries in the project, add the OpenJFX17 library  

        // right click project, select Properties, go to Run, add the line below to VM Options
        // --add-modules javafx.controls,javafx.fxml          
        // in the Libraries, Run tab, add OpenJFX17 to the Module Path
        // in the libraries tab - make sure the project JDK platform and JFX versions match - 17 for both  
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // change the name of your fxml file to match
        Parent root = FXMLLoader.load(getClass().getResource("Hello.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("GUI GUI GUI");
        stage.setScene(scene);
        stage.show();
    }
    
}
