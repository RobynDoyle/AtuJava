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


public class Convert extends Application {
    public void start(Stage stage){

        Label lblEuro = new Label("Enter Euro Amount €");
        TextField txtEuro = new TextField();
        txtEuro.setMaxWidth(50);
        

        Label lblDollar = new Label("Width");
        TextField txtDollar = new TextField();
        txtDollar.setMaxWidth(50);

        

        Button btnConvertToEuro = new Button("Convert To Euro");
        Label lblResultConEuro = new Label();
        
        Button btnConvertToDollar = new Button("Convert To Dollar");
        Label lblResultConDollar = new Label();

        btnConvertToEuro.setOnAction(e -> {
            try{
                // double euro = Double.parseDouble(txtEuro.getText());
                double dollar = Double.parseDouble(txtDollar.getText());
                double dollarToEuro = dollar / 0.88;

                lblResultConEuro.setText("€" + dollarToEuro);
            } catch (NumberFormatException ex) {
                lblResultConEuro.setText("Please Enter valid numbers.");
            }
        });
       
        btnConvertToDollar.setOnAction(e -> {
            try{
                // double euro = Double.parseDouble(txtEuro.getText());
                double euro = Double.parseDouble(txtEuro.getText());
                double euroToDollar = euro * 0.88;

                lblResultConDollar.setText("€" + euroToDollar);
            } catch (NumberFormatException ex) {
                lblResultConDollar.setText("Please Enter valid numbers.");
            }
        });

        HBox inputOne = new HBox(10);
        inputOne.getChildren().addAll(lblEuro, txtEuro, btnConvertToDollar, lblResultConDollar);
        inputOne.setAlignment(Pos.CENTER);
        
        HBox inputTwo = new HBox(10);
        inputTwo.getChildren().addAll(lblDollar, txtDollar, btnConvertToEuro, lblResultConEuro);
        inputTwo.setAlignment(Pos.CENTER);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(inputOne, inputTwo);
        Scene scene = new Scene(root, 350, 250);
        stage.setScene(scene);
        stage.setTitle("Convert");
        stage.show();
    }

   
    
}
