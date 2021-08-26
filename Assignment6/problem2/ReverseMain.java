package Assignment6.problem2;

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

import java.util.stream.IntStream;

public class ReverseMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Address Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(7);
        grid.setVgap(7);
        grid.setPadding(new Insets(20, 25, 25, 25));

        Button countBtn = new Button("Count Letters");
        countBtn.setMinSize(270, 30);
        grid.add(countBtn, 0, 1);

        Button reverseBtn = new Button("Reverse Letters");
        reverseBtn.setMinSize(270, 30);
        grid.add(reverseBtn, 0, 2);

        Button removeDupsBtn = new Button("Remove Duplicates");
        removeDupsBtn.setMinSize(270, 30);
        grid.add(removeDupsBtn, 0, 3);

        Label inputLabel = new Label("Input");
        grid.add(inputLabel, 1, 1);
        TextField inputTextField = new TextField();
        grid.add(inputTextField, 1, 2);

        Label outputLabel = new Label("Output");
        grid.add(outputLabel, 1, 3);
        TextField outputTextField = new TextField();
        grid.add(outputTextField, 1, 4);


        countBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                outputTextField.setText(String.valueOf(inputTextField.getText().length()));
            }
        });

        reverseBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                outputTextField.setText(reverse(inputTextField.getText()));
            }
        });

        removeDupsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                outputTextField.setText(removeDuplicates(inputTextField.getText()));
            }
        });


        Scene scene = new Scene(grid, 600, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public String reverse(String str){ // returns reverse of a string
        if(str == null || str.length() == 1) // return str if it is null or has size 1
            return str;
        else {
            StringBuilder sbStr = new StringBuilder(str);
            sbStr.reverse(); // reverse the string
            return sbStr.toString(); // convert StringBuilder to String and return
        }
    }
    public String removeDuplicates(String str){ // removeDuplicates method definition
        StringBuilder sb = new StringBuilder(); // StringBuilder object
        IntStream is = str.chars().distinct(); // get distinct characters from str
        is.forEach(c -> sb.append((char) c)); // add each character to string builder object
        return sb.toString(); // convert string builder object to String and return
    }

}
