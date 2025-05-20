<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Process Delete Vendor</title>
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
$vendor_email = mysqli_real_escape_string($link, $_GET["vendor_email"]);
$sql_checkprop="SELECT * FROM property WHERE vendor_email='$vendor_email'";
$result=mysqli_query($link, $sql_checkprop);
if(mysqli_num_rows($result)>0)
{
    echo "<h3>Warning</h3>";
    echo "<p>This vendor has a property listed. </p>";
    echo "<p>Delete the property first if the vendor is to be deleted.</p>";
    echo "<a href='managevendors.php' class='btn btn-outline-warning' >Return to Vendor Admin page</a>";
    
}
else{
$sql = "DELETE FROM vendor WHERE vendor_email = '$vendor_email'";
if (mysqli_query( $link, $sql))
{
header("Location: http://localhost/property/managevendors.php");
  exit;
}
else
{
  echo "Could not delete vendor";
  echo "<pre>".mysqli_error($link)."</pre>";
}
}
mysqli_close($link);
?>
</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>