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
<a href='managevendors.php' class='btn btn-outline-warning'>All Vendors</a>
<a href='logout.php' class='btn btn-outline-warning'>Logout</a>
<hr> 
<?php
require 'connect.php';
$vendor_email=mysqli_real_escape_string($link, $_GET['vendor_email']);
$sql="SELECT * FROM vendor WHERE vendor_email = '$vendor_email'";
$result=mysqli_query($link, $sql);
    echo "<h3>Confirm Delete Vendor</h3>";
    echo "<p>";
echo "<table class='table'>";
echo "<tr>
    <td><strong>Email</td>
    <td><strong>First Name</td>
    <td><strong>Surname</td>
    <td><strong>Phone</td>
    </tr>";

$row=mysqli_fetch_array($result);
    $vendor_email=$row["vendor_email"];
    $vendor_firstname=$row["vendor_firstname"];
    $vendor_surname=$row["vendor_surname"];
    $vendor_phone=$row["vendor_phone"];
    echo "<tr>
        <td>$vendor_email</td>
        <td>$vendor_firstname</td>
        <td>$vendor_surname</td>
        <td>$vendor_phone</td>
        </tr>";
echo "</table>";
echo "<p> Are you sure you want to delete this vendor? <p>
    <a href='deletevendor.php?vendor_email=$vendor_email' class='btn btn-outline-warning'>Delete</a>
    <a href='managevendors.php' class='btn btn-outline-warning'>Cancel</a>";

mysqli_close($link);
?>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
