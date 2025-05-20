<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>All Properties</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/styles.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">


<!-- set the viewport element to give the browser instructions on how to control the page's dimensions and scaling-->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap Icons CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid p-0">
<?php include("includes/nav.php");?>

<section class="p-3 mt-3">
<div class="container-lg">
<?php
require 'connect.php';
$categoryid= $_GET["categoryid"];
$sql="SELECT * from property, category WHERE property.categoryid=$categoryid AND category.categoryid=$categoryid";
$result=mysqli_query($link, $sql);
if(mysqli_num_rows($result)>0)
{
$row=mysqli_fetch_array($result);
echo "<h4>" . $row["categoryname"] . "</h4>"; //output category name at the top of the page
echo "<div class='row justify-content-left my-5'>";//set up a BS row for the cards
do 
{ //use do while to ensure the first row is processed
$propertyid=$row["propertyid"];
$image=$row["image"];
$town=$row["town"];
$productdesc=$row["shortdescription"];
$price=$row["price"];
$displayprice=number_format($price);
echo "<div class='col-lg-3 col-md-4 mb-3'>";//creates a responsive BS column to house each card
echo "<div class='card h-100'>"; //create a card - each card is a child of the BS row
echo "<img src='$image' class='card-img-top' width='100' height='250' alt='property'>";
echo "<div class='card-body'>"; //this BS div adds a horizontal rule and holds the property  location, description and price
echo "<hr>";
echo  "<p class='card-title fw-bold'>$town</p>";//output the property location
echo "<p>&dollar; $displayprice</p>"; //output the euro sign and price
echo "<p class='card-text'> $productdesc</p>"; //output the property  description
echo "<div class='card-footer text-center'>"; //this BS card footer div contains the moredetails button
echo "<p><a class='btn btn-outline-warning' href='moredetails.php?propertyid=$propertyid'>Details</a></p>";
echo "</div>"; //close the card-footer div
echo "</div>"; //close the card-body div
echo "</div>"; //close the card
echo "</div>"; //close the card column
} while ($row=mysqli_fetch_array($result)); //while there are records...fetch next row
echo "</div>"; //close the BS row since no more records
}
else //if there are no records in the result set
{
echo "<div class='feedback'>";
echo "<h5>There are no properties in this category</h5>"; //output a message
echo "</div>";
}
mysqli_close($link); //close the connection
?>
</div><!--close the BS container-->



</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
