import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Interface extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField ans = new TextField("0");
        Label anslabel = new Label("Ans:");
        TextField num1 = new TextField("0");
        Label num1label = new Label("Number A:");
        TextField num2 = new TextField("0");
        Label num2label = new Label("Number B:");

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button times = new Button("x");
        Button divide = new Button("/");

        Pane root = new Pane();

        root.getChildren().add(anslabel);
        anslabel.setLayoutX(10);
        anslabel.setLayoutY(3);
        root.getChildren().add(num1label);
        num1label.setLayoutX(10);
        num1label.setLayoutY(28);
        root.getChildren().add(num2label);
        num2label.setLayoutX(10);
        num2label.setLayoutY(53);

        root.getChildren().add(ans);
        ans.setPrefWidth(100);
        ans.setLayoutX(45);
        ans.setLayoutY(0);
        root.getChildren().add(num1);
        num1.setPrefWidth(70);
        num1.setLayoutX(75);
        num1.setLayoutY(25);
        root.getChildren().add(num2);
        num2.setPrefWidth(70);
        num2.setLayoutX(75);
        num2.setLayoutY(50);

        root.getChildren().add(plus);
        plus.setPrefWidth(35);
        plus.setPrefHeight(35);
        plus.setLayoutX(25);
        plus.setLayoutY(90);
        root.getChildren().add(minus);
        minus.setPrefWidth(35);
        minus.setPrefHeight(35);
        minus.setLayoutX(90);
        minus.setLayoutY(90);
        root.getChildren().add(times);
        times.setPrefWidth(35);
        times.setPrefHeight(35);
        times.setLayoutX(25);
        times.setLayoutY(150);
        root.getChildren().add(divide);
        divide.setPrefWidth(35);
        divide.setPrefHeight(35);
        divide.setLayoutX(90);
        divide.setLayoutY(150);

        Scene scene = new Scene(root, 150, 200);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
