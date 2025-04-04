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


public class Banker extends Application {
    private BankAccount currAcc = new BankAccount(87594, "Mary Green", 250.00);


    public void start(Stage stage){

        

        Button btnViewAlldetials = new Button("View All Details €");
        Label lblViewAlldetials = new Label();
        
        Button btnViewBalance = new Button("View Balance");
        Label lblViewBalance = new Label();

        Label lblDeposit = new Label("Enter Deposit Amount");
        TextField txtDeposit = new TextField();
        txtDeposit.setMaxWidth(50);
        Button btnDeposit = new Button("Execute");
        
        Label lblWithdraw = new Label("Enter Withdrawal Amount");
        TextField txtWithdraw = new TextField();
        txtWithdraw.setMaxWidth(50);
        Button btnWithdrawal = new Button("Execute");

        btnViewAlldetials.setOnAction(e -> {lblViewAlldetials.setText(currAcc.toString());
        }
        );
       
        // btnConvertToDollar.setOnAction(e -> {
        //     try{
        //         // double euro = Double.parseDouble(txtEuro.getText());
        //         double euro = Double.parseDouble(txtEuro.getText());
        //         double euroToDollar = euro * 0.88;

        //         lblResultConDollar.setText("€" + euroToDollar);
        //     } catch (NumberFormatException ex) {
        //         lblResultConDollar.setText("Please Enter valid numbers.");
        //     }
        // });

        HBox inputOne = new HBox(15);
        inputOne.getChildren().addAll(btnViewAlldetials, lblViewAlldetials);
        inputOne.setAlignment(Pos.CENTER_LEFT);
        
        // HBox inputTwo = new HBox(10);
        // inputTwo.getChildren().addAll(lblDollar, txtDollar, btnConvertToEuro, lblResultConEuro);
        // inputTwo.setAlignment(Pos.CENTER);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(inputOne);
        Scene scene = new Scene(root, 550, 350);
        stage.setScene(scene);
        stage.setTitle("Convert");
        stage.show();
    }

   
    
}

