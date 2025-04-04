package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;


public class Own extends Application {
    public void start(Stage stage){

        Label lblLength = new Label("Length");
        TextField txtLength = new TextField();
        txtLength.setMaxWidth(50);
        

        Label lblWidth = new Label("Width");
        TextField txtWidth = new TextField();
        txtWidth.setMaxWidth(50);

        

        Button btnCalculateArea = new Button("Calculate Area");
        Label lblResult = new Label();

        btnCalculateArea.setOnAction(e -> {
            try{
                double num1 = Double.parseDouble(txtLength.getText());
                double num2 = Double.parseDouble(txtWidth.getText());
                double area = num1 * num2;

                lblResult.setText(area + " units squared.");
            } catch (NumberFormatException ex) {
                lblResult.setText("Please Enter valid numbers.");
            }
            
        });

        HBox input = new HBox(10);
        input.getChildren().addAll(lblLength, txtLength, lblWidth, txtWidth);
        input.setAlignment(Pos.CENTER);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(input, btnCalculateArea, lblResult);
        Scene scene = new Scene(root, 350, 250);
        stage.setScene(scene);
        stage.setTitle("Area");
        stage.show();
    }

   
    
}
