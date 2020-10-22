package cr.ac.una.waze;

import cr.ac.una.waze.util.FlowController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage,null);
        stage.getIcons().add(new Image(App.class.getResourceAsStream("/cr/ac/una/waze/resources/ubi.png")));
        stage.setTitle("WAZE");
        FlowController.getInstance().goViewInWindow("Principal");
    }

    public static void main(String[] args) {
        launch();
    }

}