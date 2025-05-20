<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Process</title>
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
$server="localhost";
$dbuser="root";
$password="";
$link=mysqli_connect($server,$dbuser,$password);
mysqli_select_db($link, "property");
$title=mysqli_real_escape_string($link,$_POST["title"]); //escapes special characters in a string for use in an SQL query
$content=mysqli_real_escape_string($link,$_POST["content"]);
$author_name=mysqli_real_escape_string($link,$_POST["author_name"]);
$email=mysqli_real_escape_string($link,$_POST["author_email"]);
$sql_insert="INSERT INTO comment (title, content, author_name, author_email) 
          VALUES ('$title', '$content', '$author_name', '$email')";
echo "<div class='container-lg feedback'>";
if(mysqli_query($link, $sql_insert)) {
echo "<h4>Testimonial Added!</h4>Thank you for your feedback. Our administrators moderate all comments and it will be attended to shortly<p>";
echo "<a class='btn btn-outline-warning mt-3' href='getcomments.php'>Return to Testimonials page</a>";}
else {
  echo "An error occurred, try again!";
}
echo "</div>";
mysqli_close($link);
?>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
