package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class FirstGui extends Application
{
public void start(Stage stage)
{
//create a Label with text on it
Label myLabel = new Label("I love programming!");
//Create a Layout using VBox
VBox root = new VBox();
//Add label to the layout
root.getChildren().add(myLabel);
//Add VBox to the scene with a width of 100 pixels and heightof 100 pixels
Scene scene = new Scene(root, 100, 100);
//Add scene to the stage
stage.setScene(scene);
//Show the stage
stage.show();
}
public static void main(String []args)
{
launch(args);
}
}