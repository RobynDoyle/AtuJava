<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Testimonials</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/styles.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

 <meta name="description" content="ROYLE Properties offers properties for sale in the greater LA Area in California.">
<meta name="keywords" content="Testimonials, comments, ROYLE Properties, Los Angeles, House, Residential, Commercial, Sites.">

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
<?php
$server="localhost";
$dbuser="root";
$password="";
$link=mysqli_connect($server,$dbuser,$password);
mysqli_select_db($link, "property");
$sql="SELECT * from comment WHERE status='planned'";
$result=mysqli_query($link, $sql);
if (mysqli_num_rows($result)>0) 
{
echo "<h4> Customer Testimonials </h4>";
echo "<div class='table-responsive'>"; /*needed to wrap table in a responsive table class in BS*/
echo "<table class='table table-bordered table-striped'>"; /*add the table class and use BS table styles to make more readable */
echo "<tr>
    <th> Title</th>
    <th>Content</th>
    <th>Author</th>
    <th>Created</th>
    </tr>";
while($row=mysqli_fetch_array($result)) {
    $title=htmlspecialchars($row["title"]);  /* use htmlspecialchars to escape user input/prevent XSS*/
    $content=htmlspecialchars($row["content"]); 
    $author=htmlspecialchars($row["author_name"]); 
    $created = date("Y-m-d", strtotime($row["created_at"])); 

echo "<tr>
    <td>$title</td>
    <td>$content</td>
    <td>$author</td>
    <td>$created</td>
    </tr>";
}
echo "</table>";
echo "</div>";
}
else
{
echo ("There are no testimonials to display");
}
mysqli_close($link);

?>
<h4 class="mt-5">Add a Testimonial</h4>
<p>Please leave your feedback on your experience of our site. We appreciate your feedback and take all your comments into consideration! </p>
<!--form for user to enter feedback -->
<form class= "form" method="post" action="process.php" id="commentform">
<label for="title" class="mb-2">Title: </label>
<div><input type="text" name="title" id="title" class="form-control" required></div>
<label for="content" class="mb-2">Content: </label>
<div><textarea name="content" id="content" class="form-control" required></textarea></div>
<label for="name" class="mb-2">Name:</label>
<div><input type="text" name="author_name" id="name" class="form-control" required></div>
<label for="email" class="mb-2">Email: </label>
<div><input type="email" name="author_email" id="email" class="form-control" required></div>
<div class="mt-3">
<button type="submit" class="btn btn-outline-warning mb-5 mt-3">Add Comment</button>
</div>
</form> 

</div>
</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
