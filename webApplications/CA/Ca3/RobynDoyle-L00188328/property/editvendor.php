<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Edit Vendor</title>
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
<a href='admin.php' class='btn btn-outline-warning'>Admin Home Area</a>
<a href='managevendors.php' class='btn btn-outline-warning'>All Vendors</a>
<a href='logout.php' class='btn btn-outline-warning'>Logout</a>
<hr>
<?php
require 'connect.php';
$vendor_email = mysqli_real_escape_string($link, $_GET["vendor_email"]);
$sql = "SELECT * FROM vendor WHERE vendor_email = '$vendor_email'";
$result=mysqli_query($link, $sql);      //run the query
$row=mysqli_fetch_array($result);     //store the recordset in $row
//retrieve the database fields from the recordset and assign to variables for output
$vendor_email=$row["vendor_email"];
$vendor_firstname=$row["vendor_firstname"];
$vendor_surname=$row["vendor_surname"];
$vendor_phone=$row["vendor_phone"];

?>
 <!--show image of product and then write out the existing fields into the form fields-->
 <form method="post" action="processeditvendor.php">
 
 
<div><input type="hidden" name="vendor_email" id="vendor_email" class="form-control mt-2 mb-2" value="<?php echo $vendor_email; ?>" required/></div>

 <label for="address1">First Name</label>
<div><input type="text" name="vendor_firstname" id="vendor_firstname" class="form-control mt-2 mb-2" value="<?php echo $vendor_firstname; ?>" required/></div>
 <label for="address1">Surname</label>
<div><input type="text" name="vendor_surname" id="vendor_surname" class="form-control mt-2 mb-2" value="<?php echo $vendor_surname; ?>" required/></div>
 <label for="address1">Phone</label>
<div><input type="text" name="vendor_phone" id="vendor_phone" class="form-control mt-2 mb-2" value="<?php echo $vendor_phone; ?>" required/></div>

<div><input type="submit" class="btn btn-outline-warning mt-5" name="submit" value="Edit Vendor"/></div>

</form>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
