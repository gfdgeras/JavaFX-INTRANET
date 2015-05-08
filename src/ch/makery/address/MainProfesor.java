//UNIVERSIDAD POLITÉCNICA DE SAN LUIS POTOSÍ
package ch.makery.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainProfesor extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private String claveProfesor;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Intranet UPSLP");

        initRootLayout();

       showPersonOverview();
       System.out.println(claveProfesor);
    }

    /**
     * Initializes the root layout.
     */
   
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainProfesor.class.getResource("view/ProfesorBorde.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
   
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainProfesor.class.getResource("view/Docente.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public String getClaveProfesor()
    {
    	return claveProfesor;
    }
    public void setClaveProfesor(String aux)
    {
    	aux=claveProfesor;
    }

    public static void main(String[] args) {
        launch(args);
        
    }
}