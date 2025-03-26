package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.*;

public class SecondGui extends Application {

    public void start(Stage stage){
        TextField txtEnterText = new TextField();
        txtEnterText.setMaxWidth(250);

        Label lblText = new Label();

        Button btnPushMe = new Button("Put something here and click");
        btnPushMe.setOnAction(e -> lblText.setText("You entered " + txtEnterText.getText()));
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(txtEnterText, btnPushMe, lblText);

        Scene scene = new Scene(root, 350, 150);

        stage.setScene(scene);
        stage.setTitle("Push Me");
        stage.show();
    }

    public static void main(String []args){
    launch(args);
    }
    
}
