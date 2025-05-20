<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Process Add</title>
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
<div class="feedback">
<?php
require 'connect.php';
if(isset($_POST['submit'])) {
$street=mysqli_real_escape_string($link,$_POST['street']);
$town=mysqli_real_escape_string($link,$_POST['town']);
$county=mysqli_real_escape_string($link,$_POST['county']);
$price=mysqli_real_escape_string($link,$_POST['price']);
$bedrooms=mysqli_real_escape_string($link,$_POST['bedrooms']);
$shortdescription=mysqli_real_escape_string($link,$_POST['description']);
$longdesc=mysqli_real_escape_string($link,$_POST['longdescription']);
$vendor_email=$_POST['vendor_email'];
$categoryid=$_POST['category'];
$image=mysqli_real_escape_string($link,$_POST['image']);
$sql_insert="INSERT INTO property(address1, town, county, price, bedrooms, shortdescription, longdescription, vendor_email, categoryid, image) VALUES ('$street', '$town', '$county', '$price', '$bedrooms', '$shortdescription', '$longdesc', '$vendor_email', '$categoryid', '$image')";
if(mysqli_query($link, $sql_insert)) {
    echo "Your property has been successfully added <p>";
    echo "<a class='btn btn-outline-warning mt-5' href='manageproducts.php'>Return to Manage Products page</a>";
    
    }
    else {
      echo "An error occurred, try again!";
      echo "<pre>".mysqli_error($link)."</pre>";
    }

    if (empty($_POST['vendor_email'])) {
      echo "Error: Vendor email must be selected.";
      exit;
    }
    
    }
    mysqli_close($link);
    ?>
    </div>
    
</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
