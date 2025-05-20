<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Admin Login</title>
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
if (empty($_SESSION)) 
session_start(); 
//display errors from session
if (isset($_SESSION['errors'])) {
echo "<div class='form-errors'>";
foreach($_SESSION['errors'] as $error) 
{
   echo "<p>" . htmlspecialchars($error) . "</p>";
}
echo "</div>";
}
unset($_SESSION['errors']); //clear errors after displaying them
?>
<div class="container-lg feedback">
<h3> Login </h3>
<form action="login_action.php" method="POST">
<label for="admin_email">Email: </label>
<div><input type="email" class="mt-2 mb-2 form-control" name="admin_email" placeholder="Enter username" required></div>
<label for="password">Password: </label>
<div><input type="password" class="mt-2 mb-2 form-control" name="password" placeholder="Enter password" required></div>
<input type="submit" value="Login" class="btn btn-outline-warning mt-3">
</form>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
