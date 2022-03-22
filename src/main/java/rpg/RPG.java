package rpg;

import javafx.application.Application;
import javafx.stage.Stage;

public class RPG extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage) {
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }
}
