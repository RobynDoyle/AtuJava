import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.util.ArrayList;

public class StudentGUIArrayList extends Application
{
   //Create ArrayList for Student class
   ArrayList<Student> studentList = new ArrayList<>();
   
   TextField txtStudentNo;
   TextField txtStudentName;
   TextField txtCourseName;
   Label lblOutput;
   Button btnAddStudent;
   Button btnViewAllStudents;
   Button btnSearchStudents;
   Button btnCountStudents;
   Button btnWriteStudents;
   TextArea txtOutput;
   public void start(Stage stage)
   {
      txtStudentNo = new TextField();
      txtStudentNo.setMaxWidth(50);
      txtStudentName = new TextField();
      txtStudentName.setMaxWidth(100);
      txtCourseName = new TextField();
      txtCourseName.setMaxWidth(100);
      
      Label lblStudentNo = new Label("Student No");
      Label lblStudentName = new Label("Student Name");
      Label lblCourse = new Label("Course Name");
      
      btnAddStudent = new Button("Add Student");
      btnAddStudent.setOnAction(e -> addStudent(e));
      btnViewAllStudents = new Button("View All Students");
      btnViewAllStudents.setOnAction(e -> viewStudents(e));
      btnSearchStudents = new Button("Find Students by Course");
      btnSearchStudents.setOnAction(e -> findStudents(e));
    
      txtOutput = new TextArea();
      txtOutput.setMaxSize(500, 150);
      txtOutput.setEditable(false);
      HBox input = new HBox(8);
      input.setAlignment(Pos.CENTER);
      input.getChildren().addAll(lblStudentNo, txtStudentNo, lblStudentName, txtStudentName, lblCourse, txtCourseName);
      HBox buttons = new HBox(8);
      buttons.setAlignment(Pos.CENTER);
      buttons.getChildren().addAll(btnAddStudent, btnViewAllStudents, btnSearchStudents);
      VBox root = new VBox(10);
      root.setAlignment(Pos.CENTER);
      root.getChildren().addAll(input, buttons, txtOutput);
      Scene scene = new Scene(root, 600, 400);
      stage.setScene(scene);
      stage.setTitle("Student Registration");
      stage.show();
   }
   
   //Add students to ArrayList
   public void addStudent(ActionEvent e)
   {
      try
      {
         //Check that all TextFields have values
         if(txtStudentNo.getText().isEmpty() || txtStudentName.getText().isEmpty() || txtCourseName.getText().isEmpty())
         {
            txtOutput.setText("Please check that you have entered values in all fields");
         }
         else
         {
            int studentNo = Integer.parseInt(txtStudentNo.getText());
            String name = txtStudentName.getText();
            String course = txtCourseName.getText();
      
            studentList.add(new Student(studentNo, name, course));
            txtOutput.setText("Student has been successfully added");
         }
         //Clear textFields
         txtStudentNo.clear();
         txtStudentName.clear();
         txtCourseName.clear();
      }//close try block
      catch(NumberFormatException ex)
      {
         txtOutput.setText("Student Number must contain digits only");
      }
      catch(IllegalArgumentException ex)
      {
         txtOutput.setText("Student Number cannot be negative");
      }
   }//close method
   
   //View Students
   public void viewStudents(ActionEvent e)
   {
      for(Student s: studentList)
      {
        txtOutput.appendText(s +"\n");
      }
      
      //for(int i = 0; i < studentList.size(); i++)
      //{
        //    txtOutput.appendText(studentList.get(i) + "\n");
      //}
   }
   
   //Find students by course
   public void findStudents(ActionEvent e)
   {
      txtOutput.clear(); //clears TextArea
      
      String searchCourse = txtCourseName.getText();
      boolean isFound = false;
      for(int i = 0; i < studentList.size(); i++)
      {
         if((studentList.get(i).getCourseName()).equalsIgnoreCase(searchCourse))
         {
            txtOutput.appendText(studentList.get(i).getStudentName() + "\n");
            isFound = true;
         }
      }
      if(isFound == false)
      {
         txtOutput.setText("No students registered on that course");
      }
   }
   
   public static void main(String []args)
   {
      launch(args);
   }
}
