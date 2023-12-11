package eu.telecomnancy.labfx;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.application.Platform;

public class Main extends Application {

  public static void main(String[] args) {
      Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws IOException {

    Label Titre = new Label("Blank JavaFX Project");

    primaryStage.setTitle("JavaFX Project");
    Button button_quit = new Button("Quitter");
    ImageView imageView = new ImageView(getClass().getResource("/eu/telecomnancy/labfx/images/kawai.png").toExternalForm());
    imageView.setFitHeight(100);
    imageView.setFitWidth(100);
    button_quit.setGraphic(imageView);

    button_quit.setOnAction(e -> {
      Platform.exit();
    });

    Scene scene = new Scene(button_quit, 400, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}
