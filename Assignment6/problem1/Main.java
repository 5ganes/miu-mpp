package Assignment6.problem1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("problem1.fxml"));
        primaryStage.setTitle("Address Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(7);
        grid.setVgap(7);
        grid.setPadding(new Insets(5, 25, 25, 25));

        Label nameLabel = new Label("Name");
        grid.add(nameLabel, 0, 1);
        TextField nameTextField = new TextField();
        grid.add(nameTextField, 0, 2);

        Label streetLabel = new Label("Street");
        grid.add(streetLabel, 1, 1);
        TextField streetTextField = new TextField();
        grid.add(streetTextField, 1, 2);

        Label cityLabel = new Label("City");
        grid.add(cityLabel, 2, 1);
        TextField cityTextField = new TextField();
        grid.add(cityTextField, 2, 2);

        Label stateLabel = new Label("State");
        grid.add(stateLabel, 0, 3);
        TextField stateTextField = new TextField();
        grid.add(stateTextField, 0, 4);

        Label zipLabel = new Label("Zip");
        grid.add(zipLabel, 1, 3);
        TextField zipTextField = new TextField();
        grid.add(zipTextField, 1, 4);

        Button submitBtn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(submitBtn);
        grid.add(hbBtn, 1, 5);

        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println(nameTextField.getText());
                System.out.println(streetTextField.getText());
                System.out.println(cityLabel.getText() + ", " + stateTextField.getText() + " , " + zipTextField.getText());
            }
        });


        Scene scene = new Scene(grid, 600, 150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
