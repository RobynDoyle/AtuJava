<?php
require 'connect.php';

if (isset($_POST['submit'])) {
  $name = mysqli_real_escape_string($link, $_POST['name']);
  $email = mysqli_real_escape_string($link, $_POST['email']);

  // checks that email was not put into databse already
$sql_check_email="SELECT * FROM Subscribers WHERE Email='$email'";
$result=mysqli_query($link, $sql_check_email);
if(mysqli_num_rows($result)>0)
{
  header("Location: http://localhost/property/subscribederror.php"); // sends to subscribed page
    exit;
    
    
}
else {

  // Insert the emails and name into the database
  $sql = "INSERT INTO Subscribers (Email, Name) VALUES ('$email', '$name')";
  //if the query is successful go to success page, otherwise output an error message

  if (mysqli_query($link, $sql)) {
    header("Location: http://localhost/property/subscribedsuccess.php"); // sends to subscribed page
    exit;
  } else {
    echo "Could not subscribe: " . mysqli_error($link);
  }
}
}

mysqli_close($link);
?>
