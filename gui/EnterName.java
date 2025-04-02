package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class EnterName extends Application {
    public void start(Stage stage){
        Label lblName = new Label("Enter your Name");
        TextField txtName = new TextField();
        txtName.setMaxWidth(100);
        Label lblOutput = new Label();
        Button btnName = new Button("Click Me");

        EventHandler output = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                lblOutput.setText("Hello "+txtName.getText());
            }
        };
        btnName.setOnAction(output);

        VBox root = new VBox();
        root.getChildren().addAll(lblName,txtName, btnName, lblOutput);
        Scene scene = new Scene(root,250, 150);
        stage.setScene(scene);
        stage.show();

    }
    
}
