<?php
require 'connect.php';
//The following code checks if the submit button is clicked and updates the data in the database accordingly
if(isset($_POST['submit']))
{
  //store the data posted in the form in variables and use real escape string to clean data fields the user can enter
  $vendor_email=$_POST['vendor_email'];
  $vendor_firstname=mysqli_real_escape_string($link,$_POST['vendor_firstname']);
  $vendor_surname=mysqli_real_escape_string($link,$_POST['vendor_surname']);
  $vendor_phone=mysqli_real_escape_string($link,$_POST['vendor_phone']);



  //query to update the fields in the product record
  $sql= "UPDATE vendor SET vendor_firstname='$vendor_firstname', vendor_surname='$vendor_surname', vendor_phone='$vendor_phone' WHERE vendor_email='$vendor_email'";

  //if the query is successful return to the manageproducts page, otherwise output an error message
  if (mysqli_query( $link, $sql))
  {
    header("Location: http://localhost/property/managevendors.php");
    exit;
  }
  else 
 {
  echo "Could not update vendor";
  echo "<pre>".mysqli_error($link)."</pre>";
}
}
mysqli_close($link);
?>
