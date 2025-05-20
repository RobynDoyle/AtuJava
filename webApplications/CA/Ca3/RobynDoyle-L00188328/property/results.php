<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>search results</title>
  <meta charset="utf-8">
 <link rel="stylesheet" href="css/stylesbs.css">
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
<section class="feedback p-3 mt-3">
<a href='search.php' class='btn btn-outline-warning mt-3 mb-3'>Edit Search</a>
<?php

require 'connect.php';

if (isset($_POST['submit']))
{
$town=$_POST['location'];
$categoryid=$_POST['category'];
$minprice=$_POST['minprice'];
$maxprice=$_POST['maxprice'];
}

$sql="SELECT * from property WHERE property.town='$town' AND property.categoryid='$categoryid' AND property.price>='$minprice' AND property.price<= '$maxprice'";
$result=mysqli_query($link, $sql);
if(mysqli_num_rows($result)>0)
{
echo "<table class='table'>";
echo "<tr>
<td><strong>Image</td>
<td><strong>Property</td>
<td><strong>Price</td>
<td><strong>Description</td>
<td><strong>Details</td>
</tr>";
while($row=mysqli_fetch_array($result)) {
$propertyid=$row["propertyid"];
$image=$row["image"];
$address=$row["address1"];
$shortdesc=$row["shortdescription"];
$price=$row["price"];
$showprice=number_format($price);
echo "<tr>
<td><img src='$image' width=100 height=100> </td>
<td>$address</td>
<td>&euro;$showprice</td>
<td>$shortdesc</td>
<td><a href='moredetails.php?propertyid=$propertyid' class='btn btn-outline-warning mt-3 mb-3'>Details</a></td>
</tr>";
}
echo "</table>";
}
else
{
echo "<h3> There are currently no items in this category</h3>";
}
mysqli_close($link);
?>
</section>
<?php include("includes/footer.php");?>
</div>
</html>