<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>All Properties</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/styles.css">

 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

<meta name="description" content="ROYLE Properties offers properties for sale in the greater LA Area in California.">
<meta name="keywords" content="All properties, browse, ROYLE Properties, Los Angeles, House, Residential, Commercial, Sites.">

<!-- set the viewport element to give the browser instructions on how to control the page's dimensions and scaling-->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap Icons CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid p-0">
<?php include("includes/nav.php");?>

<section class="p-3 mt-3">
<?php
require "connect.php"; //access the connection code
$sql="SELECT * from property";
$result=mysqli_query($link, $sql);
if(mysqli_num_rows($result)>0) //check there are records in the result set
{
echo "<div class='container-lg'>";//set up the BS container
echo "<h4>All Properties</h4>";
echo "<div class='row justify-content-left my-5'>";//set up a BS row for the cards

while($row=mysqli_fetch_array($result)) //while there are records in the array
{
$propertyid=$row["propertyid"];
$image=$row["image"];
$town=$row["town"];
$productdesc=$row["shortdescription"];
$price=$row["price"];
$displayprice=number_format($price);
echo "<div class='col-lg-3 col-md-4 mb-3'>";//creates a responsive BS column to house each card
echo "<div class='card h-100 d-flex flex-column'>"; //create a card - each card is a child of the BS row
echo "<img src='$image' class='card-img-top' style='height:190px; object-fit: cover;' alt='property'>";
echo "<div class='card-body flex-grow-1'>"; //this BS div adds a horizontal rule and holds the property  location , description and price
echo "<hr>";
echo "<p class='card-title fw-bold'>$town</p>";//output the property location
echo "<p>&dollar; $displayprice</p>"; //output the dollar sign and price
echo "<p class='card-text'> $productdesc</p>"; //output the property description
echo "<div class='card-footer text-center mt-auto'>"; //this BS card footer div contains the moredetails button
echo "<p><a class='btn btn-outline-warning' href='moredetails.php?propertyid=$propertyid'>Details</a></p>";
echo "</div>"; //close the card-footer div
echo "</div>"; //close the card-body div
echo "</div>"; //close the card
echo "</div>"; //close the card column
} //end while loop
echo "</div>"; //close the BS row since no more records
}
else //if there are no records in the result set
{
echo "<h3>There are no products in the database</h3>"; //output a message
}
mysqli_close($link); //close the connection
?>


</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
