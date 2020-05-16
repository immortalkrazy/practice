import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindGrade extends Application {

      private Statement stmt;
      private TextField tfSSN = new TextField();
      private TextField tfCourseID = new TextField();
      private Label lblStatus = new Label();

      @Override
      public void start(Stage primaryStage) {

            initializeBD();

            Button btShowGrade = new Button("Show Grade");
            HBox hBox = new HBox(5);
            hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseID, (btShowGrade));

            VBox vBox = new VBox(10);
            vBox.getChildren().addAll(hBox, lblStatus);

            tfSSN.setPrefColumnCount(6);
            tfCourseID.setPrefColumnCount(6);
            btShowGrade.setOnAction(e -> showGrade());

            Scene scene = new Scene(vBox, 420, 80);
            primaryStage.setTitle("Final Grade");
            primaryStage.setScene(scene);
            primaryStage.show();

      }

      private void initializeBD() {

            try {
                  Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("Driver Loaded!");

                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook?" +
                                                                      "user=javaUser&password=F7361i10350");
                  System.out.println("Database Connected!");

                  stmt = connection.createStatement();

            } catch (Exception e) {
                  e.printStackTrace();
            }
      }

      private void showGrade() {

      }

}
