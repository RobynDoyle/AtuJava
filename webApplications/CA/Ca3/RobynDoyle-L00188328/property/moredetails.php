<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Property Details</title>
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
<?php
require "connect.php"; //access the connection code

$propertyid= $_GET["propertyid"];
$sql= "SELECT * FROM property WHERE propertyid=$propertyid";
$result=mysqli_query($link, $sql);
$row = mysqli_fetch_array($result);

$town = $row["town"];
$address = $row["address1"];
$price = $row["price"];
$description = $row["shortdescription"];
$longdescription = $row["longdescription"];
$image = $row["image"];
$bedrooms = $row["bedrooms"];

echo "<div class='container-lg mt-5'>";
echo "<div class='card shadow-lg border-0'>";
echo "<div class='row g-0'>";
echo "<div class='col-md-6'>";
echo "<img src='" . htmlspecialchars($image) . "' class='img-fluid rounded-start w-100' style='height:100%; object-fit:cover;' alt='Property image'>";
echo "</div>";
echo "<div class='col-md-6'>";
echo "<div class='card-body'>";
echo "<h4 class='card-title mb-3'>" . htmlspecialchars($address) . ", " . htmlspecialchars($town) . "</h4>";
echo "<h5 class='text-muted mb-3'>&dollar;" . number_format($price, 2) . "</h5>";
echo "<p><strong>Description:</strong><br>" . htmlspecialchars($description) . "</p>";
if ($bedrooms > 0) {
    echo "<p><strong>Bedrooms:</strong> " . htmlspecialchars($bedrooms) . "</p>";
}
echo "<p><strong>Full Details:</strong><br>" . nl2br(htmlspecialchars($longdescription)) . "</p>";

echo "<p><a class='btn btn-lg btn-warning' href='displayallproductscards.php'>Listings</a></p>";

echo "</div>"; 
echo "</div>"; 
echo "</div>"; 
echo "</div>"; 
echo "</div>"; 

mysqli_close($link);

?>

<script>

</script>
</div> <!--close the BS container-->

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
