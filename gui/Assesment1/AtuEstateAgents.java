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
    // List to store properties - these are the objects created from the Property class
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

        // Function buttons that require input
        Label lblRemoveProperty = new Label("Property Number");
        TextField textRemoveProperty = new TextField();
        textRemoveProperty.setMaxWidth(70);
        Button btnRemoveProperty = new Button("Remove Property");
        
        Label lblUpdatePricePropertyNumber = new Label("Property Number");
        TextField textUpdatePricePropertyNumber = new TextField();
        Label lblPropertyNewPrice = new Label("New Price");
        TextField textUpdatePropertyPrice = new TextField();
        textUpdatePropertyPrice.setMaxWidth(70);
        Button btnUpdatePropertyPrice = new Button("Update Property Price");

        // Output area
        TextArea textOutput = new TextArea();
        textOutput.setPrefSize(800, 200);
        textOutput.setEditable(false);

        // Bonus Function Buttons
        Button btnF1 = new Button("F1");
        Button btnF2 = new Button("F2");
        Button btnF3 = new Button("F3");
        

/////////////////////////////////////////////////////////////////////////////////////

        // Button to add property to Array
        btnAddProperty.setOnAction(e -> {
            try {
                // assigns text fields to variables.
                int receptionsValue = Integer.parseInt(textReceptions.getText());
                String streetValue = textStreet.getText();
                double priceValue = Double.parseDouble(textPrice.getText());
                String townValue = textTown.getText();
                String countyValue = textCounty.getText();
                int bedsValue = Integer.parseInt(textBeds.getText());
                String typeValue = textType.getText();
                int bathValue = Integer.parseInt(textBath.getText());
                
                
                // Checks is String fields are not empty
                if (streetValue.isEmpty() || townValue.isEmpty() || countyValue.isEmpty() || typeValue.isEmpty()) {
                    textOutput.setText("Error: All fields must be filled.");
                    return;
                }
                // CHecks if number fields are not empty and numbers not non numbers.
                if (bedsValue < 0 || receptionsValue < 0 || bathValue < 0 || priceValue < 0) {
                    textOutput.setText("Error: Numbers must be positive.");
                    return;
                }


                // stores variables into the array
                Property p = new Property(streetValue, townValue, countyValue, bedsValue, bathValue, receptionsValue, priceValue, typeValue);
                propertyList.add(p);
                textOutput.setText("The property was added to the database");

                // For next input clear textfields
                textPrice.clear(); textStreet.clear(); textType.clear();  textTown.clear(); textCounty.clear(); textBeds.clear();
                textReceptions.clear(); textBath.clear(); 
            } catch (NumberFormatException ex) {
                textOutput.setText("Double check the entries, they shpuld be numbers or strings.");
            }
        });

        btnViewAllProperties.setOnAction(e-> {
            // clear the text area of any previous text
            textOutput.clear();
            // prints out the properties in the array list
            for (Property p : propertyList) {
                textOutput.appendText(p.toString() + "\n");
            }

        });

        btnRemoveProperty.setOnAction(e-> {
            // clear output area
            textOutput.clear();
            try{
                int removeProperty = Integer.parseInt(textRemoveProperty.getText());

                for (int i = 0; i < propertyList.size(); i++) {
                    if (propertyList.get(i).viewPropNo() == removeProperty) {
                        // remove the property when found
                        propertyList.remove(i);
                        textOutput.setText(removeProperty + " property was removed.");
                    } 
                
             
                }   
            } catch (NumberFormatException ex) {
                textOutput.setText("Please enter a valid property number.");
            }


        });

        btnUpdatePropertyPrice.setOnAction(e-> {
            // clear output area
            textOutput.clear();

            try{
                int updatePricePropertyNumber = Integer.parseInt(textUpdatePricePropertyNumber.getText());
                double updatePrice = Double.parseDouble(textUpdatePropertyPrice.getText());

                // making sure price is above 0 and thus not empty
                if (updatePrice <= 0) {
                    textOutput.setText("Price needs to be more then 0");
                    return;
                }
                for (Property p : propertyList) {
                    if (p.viewPropNo() == updatePricePropertyNumber) {
                        p.setPrice(updatePrice);
                        textOutput.setText("Property " + updatePricePropertyNumber + " was updated to €" + updatePrice);
                        break;
                    }
                }  
            } catch (NumberFormatException ex) {
                textOutput.setText("Please enter a valid property number and price.");
            }

        });




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
        buttons1.getChildren().addAll(btnAddProperty, btnViewAllProperties);
        buttons1.setAlignment(Pos.CENTER);
        
        HBox buttons2 = new HBox(10);
        buttons2.getChildren().addAll(lblRemoveProperty, textRemoveProperty, btnRemoveProperty);
        buttons2.setAlignment(Pos.CENTER);
        
        HBox buttons3 = new HBox(10);
        buttons3.getChildren().addAll(lblUpdatePricePropertyNumber, textUpdatePricePropertyNumber, lblPropertyNewPrice, textUpdatePropertyPrice, btnUpdatePropertyPrice);
        buttons3.setAlignment(Pos.CENTER);
        
        HBox boxArea = new HBox(10);
        boxArea.getChildren().addAll(textOutput);
        boxArea.setAlignment(Pos.CENTER);
        
        HBox bonusFunction = new HBox(10);
        bonusFunction.getChildren().addAll(btnF1, btnF2, btnF3);
        bonusFunction.setAlignment(Pos.CENTER);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(headline, input1, input2, buttonTitle, buttons1, buttons2, buttons3, boxArea, bonusFunction);
        Scene scene = new Scene(root, 1000, 800);
        stage.setScene(scene);
        stage.setTitle("ATU Estate Agents");
        stage.show();
        
    }
    
}
