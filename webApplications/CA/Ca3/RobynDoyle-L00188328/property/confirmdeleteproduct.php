<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Confirm Delete</title>
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

<div class="container-lg feedback">
<a href='admin.php' class='btn btn-outline-warning'>Admin Home Area</a>
<a href='manageproducts.php' class='btn btn-outline-warning'>All Properties</a>
<a href='logout.php' class='btn btn-outline-warning'>Logout</a>
<hr> 
<?php
require 'connect.php';
$propertyid=$_GET['propertyid'];
$sql="SELECT * from property where propertyid=$propertyid";
$result=mysqli_query($link, $sql);
    echo "<h3>Confirm Delete Property</h3>";
    echo "<p>";
echo "<table class='table'>";
echo "<tr>
    <td><strong>Image</td>
    <td><strong>Address</td>
    <td><strong>Town / City</td>
    <td><strong>County / State</td>
    <td><strong>Bedrooms</td>
    <td><strong>Price</td>
<td><strong>Short Description</td>
<td><strong>Long Description</td>
    </tr>";

$row=mysqli_fetch_array($result);
    $image=$row["image"];
    $address1=$row["address1"];
    $town=$row["town"];
    $county=$row["county"];
    $bedrooms=$row["bedrooms"];
    $shortdescription=$row["shortdescription"];
    $longdescription=$row["longdescription"];
    $price=$row["price"];
    echo "<tr>
<td><img src='$image' width=150 height=150> </td>
        <td>$address1</td>
        <td>$town</td>
        <td>$county</td>
        <td>$bedrooms</td>
        <td>&euro; $price</td>
        <td>$shortdescription</td>
        <td>$longdescription</td>
        </tr>";
echo "</table>";
echo "<p> Are you sure you want to delete this property? <p>
    <a href='deleteproduct.php?propertyid=$propertyid' class='btn btn-outline-warning'>Delete</a>
    <a href='manageproducts.php' class='btn btn-outline-warning'>Cancel</a>";

mysqli_close($link);
?>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
