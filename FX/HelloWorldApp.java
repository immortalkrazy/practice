import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.Group;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

  public static void main(String[]args){
    Application.launch(args);
  }

  public void start(Stage primaryStage){

    Text text = new Text(300, 200, "HelloWorld!");
    text.setFont(new Font(40));

    Group root = new Group();
    root.getChildren().add(text);

    Scene scene = new Scene(root, 600, 400);

    Stage stage = new Stage();
    stage.setTitle("Welcome");
    stage.setScene(scene);
    stage.showAndWait();

    System.out.println("\nDone");
  }
}
