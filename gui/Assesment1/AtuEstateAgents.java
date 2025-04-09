// Author: Robyn Doyle
// Student Number: L00188328

package gui.Assesment1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.ArrayList;

public class AtuEstateAgents extends Application {
    ArrayList<Property> propertyList = new ArrayList<>();

    public void start(Stage stage){

        // Main Headline Label
        Label lblHeadline = new Label("**** Enter Property Details ****");

        // Info entry TextFields with Labels
        TextField textStreet = new TextField();
        textStreet.setMaxWidth(200);
        Label lblStreet = new Label("Street");

        TextField textTown = new TextField();
        textTown.setMaxWidth(200);
        Label lblTown = new Label("Town");

        TextField textCounty = new TextField();
        textCounty.setMaxWidth(200);
        Label lblCounty = new Label("County");

        TextField textBeds = new TextField();
        textBeds.setMaxWidth(50);
        Label lblBeds = new Label("Beds");

        TextField textReceptions = new TextField();
        textReceptions.setMaxWidth(50);
        Label lblReceptions = new Label("Receptions");

        TextField textBath = new TextField();
        textBath.setMaxWidth(50);
        Label lblBath = new Label("Bath");

        TextField textType = new TextField();
        textType.setMaxWidth(200);
        Label lblType = new Label("Type");

        TextField textPrice = new TextField();
        textPrice.setMaxWidth(200);
        Label lblPrice = new Label("Price");

        // Button Headline
        Label lblButton = new Label("**** Property Functions ****");

        // Function Buttons

        Button btnAddProperty = new Button("Add Property");
        Button btnViewAllProperties = new Button("View All Properties");
        Button btnRemoveProperty = new Button("Remove Property");
        Button btnUpdatePropertyPrice = new Button("Update Property Price");

        // Output area
        TextArea textOutput = new TextArea();
        textOutput.setMaxSize(800, 200);
        textOutput.setEditable(false);

        // Bonus Function Buttons
        Button btnF1 = new Button("F1");
        Button btnF2 = new Button("F2");
        Button btnF3 = new Button("F3");
        

////////////////////////////////////////////////////////

        // Horizontal Boxes to align elements
        HBox headline = new HBox(10);
        headline.getChildren().addAll(lblHeadline);
        headline.setAlignment(Pos.CENTER);

        HBox input1 = new HBox(10);
        input1.getChildren().addAll(lblStreet, textStreet, lblTown, textTown, lblCounty, textCounty);
        input1.setAlignment(Pos.CENTER);

        HBox input2 = new HBox(10);
        input2.getChildren().addAll(lblBeds, textBeds, lblReceptions, textReceptions, lblBath, textBath, lblType, textType, lblPrice, textPrice);
        input2.setAlignment(Pos.CENTER);

        HBox buttonTitle = new HBox(10);
        buttonTitle.getChildren().addAll(lblButton);
        buttonTitle.setAlignment(Pos.CENTER);
        
        HBox buttons1 = new HBox(10);
        buttons1.getChildren().addAll(btnAddProperty, btnViewAllProperties, btnRemoveProperty, btnUpdatePropertyPrice);
        buttons1.setAlignment(Pos.CENTER);
        
        HBox boxArea = new HBox(10);
        boxArea.getChildren().addAll(textOutput);
        boxArea.setAlignment(Pos.CENTER);
        
        HBox bonusFunction = new HBox(10);
        bonusFunction.getChildren().addAll(btnF1, btnF2, btnF3);
        bonusFunction.setAlignment(Pos.CENTER);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(headline, input1, input2, buttonTitle, buttons1, boxArea, bonusFunction);
        Scene scene = new Scene(root, 1000, 800);
        stage.setScene(scene);
        stage.setTitle("Area");
        stage.show();
        
    }
    
}
