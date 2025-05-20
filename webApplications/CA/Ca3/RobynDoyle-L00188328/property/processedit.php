<?php
require 'connect.php';
//The following code checks if the submit button is clicked and updates the data in the database accordingly
if(isset($_POST['submit']))
{
  //store the data posted in the form in variables and use real escape string to clean data fields the user can enter
  $propertyid=$_POST['propertyid'];
  $town=mysqli_real_escape_string($link,$_POST['town']);
  $address1=mysqli_real_escape_string($link,$_POST['address1']);
  $county=mysqli_real_escape_string($link,$_POST['county']);
  $price=mysqli_real_escape_string($link,$_POST['price']);
  $bedrooms=mysqli_real_escape_string($link,$_POST['bedrooms']);
  $shortdescription=mysqli_real_escape_string($link,$_POST['shortdescription']);
  $longdesc=mysqli_real_escape_string($link,$_POST['longdescription']);
  $vendor_email=$_POST["vendor_email"];
  $categoryid=$_POST["category"];
  $image=mysqli_real_escape_string($link,$_POST['image']);
  //query to update the fields in the product record
  $sql= "UPDATE property SET town='$town', address1='$address1', county='$county', bedrooms='$bedrooms', price='$price', shortdescription='$shortdescription', longdescription='$longdesc', vendor_email='$vendor_email', categoryid='$categoryid', image='$image' WHERE propertyid=$propertyid";

  //if the query is successful return to the manageproducts page, otherwise output an error message
  if (mysqli_query( $link, $sql))
  {
    header("Location: http://localhost/property/manageproducts.php");
    exit;
  }
  else 
 {
  echo "Could not update property";
  echo "<pre>".mysqli_error($link)."</pre>";
}
}
mysqli_close($link);
?>
