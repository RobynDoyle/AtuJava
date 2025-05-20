<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Admin</title>
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
<div class="feedback">
<?php
session_start();
if (isset($_SESSION['username'])){
$username = $_SESSION['username'];
echo "<h3> Administrator Area</h3>";
echo "Hi " . $username . "!<p>";
echo "Choose one of the menu options to Manage Comments, Properties or Vendors.  &nbsp; &nbsp;";
echo "<a href='logout.php' class='btn btn-outline-warning'>Logout</a>";
echo "<p><a href='managecomments.php' class='btn btn-outline-warning'>Manage Comments</a></p>";
echo "<p><a href='manageproducts.php' class='btn btn-outline-warning'>Manage Properties</a></p>";
echo "<p><a href='managevendors.php' class='btn btn-outline-warning'>Manage Vendors</a></p>";
} else {
  echo "<p>You are not logged in. Please <a href='adminlogin.php'>login</a> first.</p>";
}
?>
</div>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
