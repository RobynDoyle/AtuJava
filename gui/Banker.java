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
        Button btnDeposit = new Button("Execute Deposit");
        
        Label lblWithdraw = new Label("Enter Withdrawal Amount");
        TextField txtWithdraw = new TextField();
        txtWithdraw.setMaxWidth(50);
        Button btnWithdrawal = new Button("Execute Withdrawal");

        btnViewAlldetials.setOnAction(e -> {lblViewAlldetials.setText(currAcc.toString());
        }
        );

        btnViewBalance.setOnAction(e -> {lblViewBalance.setText("Balance: €" + currAcc.viewBalance());});

        btnDeposit.setOnAction(e -> {
            try {
                double deposit = Double.parseDouble(txtDeposit.getText());
                currAcc.depositMoney(deposit);
                lblDeposit.setText("€" + deposit + " Deposited. Current Balance = " + currAcc.viewBalance());
            } catch (NumberFormatException ex) {
                lblDeposit.setText("Wrong number format");
                // TODO: handle exception
            }
        });
       
        btnWithdrawal.setOnAction(e -> {
            double withdrawal = Double.parseDouble(txtWithdraw.getText());
            currAcc.withdrawMoney(withdrawal);
            lblWithdraw.setText("€" + withdrawal + " Withdrawn. Current Balance = " + currAcc.viewBalance());
        });

        HBox inputOne = new HBox(15);
        inputOne.getChildren().addAll(btnViewAlldetials, lblViewAlldetials);
        inputOne.setAlignment(Pos.CENTER_LEFT);
        
        HBox inputTwo = new HBox(15);
        inputTwo.getChildren().addAll(btnViewBalance, lblViewBalance);
        inputTwo.setAlignment(Pos.CENTER_LEFT);
        
        HBox inputThree = new HBox(15);
        inputThree.getChildren().addAll(txtDeposit, btnDeposit, lblDeposit);
        inputThree.setAlignment(Pos.CENTER_LEFT);
        
        HBox inputFour = new HBox(15);
        inputFour.getChildren().addAll(txtWithdraw, btnWithdrawal, lblWithdraw);
        inputFour.setAlignment(Pos.CENTER_LEFT);
    
        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(inputOne, inputTwo, inputThree, inputFour);
        Scene scene = new Scene(root, 550, 350);
        stage.setScene(scene);
        stage.setTitle("Bank Account");
        stage.show();
    }

   
    
}

