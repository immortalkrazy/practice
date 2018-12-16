import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class HelloWorldFXApp extends Application{

  public static void main(String...args){
    launch(args);
  }

  public void start(Stage primaryStage){
    Text text = new Text(10, 40, "Hello World!");
    text.setFont(new Font(40));

    Group root = new Group();
    root.getChildren().add(text);

    Scene scene = new Scene(root, 600, 400);

    Stage stage = new Stage();
    stage.setTitle("Welcome to JavaFX!");
    stage.setScene(scene);
    stage.showAndWait();

    System.out.println("\nDone");
  }
}
