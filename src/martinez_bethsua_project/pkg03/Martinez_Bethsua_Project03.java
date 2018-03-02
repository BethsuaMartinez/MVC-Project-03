
package martinez_bethsua_project.pkg03;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;
import martinez_bethsua_project.pkg03.MVC.CitationController;
import martinez_bethsua_project.pkg03.MVC.CitationModel;
import martinez_bethsua_project.pkg03.MVC.CitationView;

/**
 *
 * @author bethsua martinez
 */
public class Martinez_Bethsua_Project03 extends Application {

    
    @Override
    public void start(Stage primaryStage) {
        
        //MVC 
        CitationView citationView = new CitationView();
        CitationModel citationModel = new CitationModel();
        CitationController citationController = new CitationController(citationView, citationModel);

        Scene scene = new Scene(citationView, 1200, 600);

        primaryStage.setTitle("Parking Citations");
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
