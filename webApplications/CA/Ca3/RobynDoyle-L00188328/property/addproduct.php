<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Add Product</title>
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
<a href='manageproducts.php' class='btn btn-outline-warning'>All Properties</a>
<a href='logout.php' class='btn btn-outline-warning'>Logout</a>
<hr>
<h3>Add a Property</h3>
<form method="post" action="processadd.php">
<label for="street">Property Street Location</label>
<div><input class="mt-2 mb-2 form-control" type="text" name="street" id="street" placeholder="Adress Line 1" required/></div>
<label for="town">Town:</label>
<div><input class="mt-2 mb-2 form-control" type="text" name="town" id="town" placeholder="Town or city." required/></div>
<label for="county">County / State</label>
<div><input class="mt-2 mb-2 form-control" type="text" name="county" id="county" placeholder="California" required/></div>
<label for="bedrooms">Bedrooms</label>
<div><input class="mt-2 mb-2 form-control" type="number" name="bedrooms" id="bedrooms" placeholder="Number of bedrooms" required/></div>
<label for="price">Price</label>
<div><input class="mt-2 mb-2 form-control" type="number" name="price" id="price" step="0.01" min="0" placeholder="0.00" required /></div>
<label for="description">Description</label>
<div><textarea class="mt-2 mb-2 form-control" name="description" id="description" rows="8" cols="35" placeholder="Enter product short description" required ></textarea>
</div>
<label for="longdescription">Long Description:</label>
<div><textarea class="mt-2 mb-2 form-control" name="longdescription" id="longdescription" rows="8" cols="35" placeholder="Enter product long description" required></textarea></div>
<label for="vendoremail">Vendor Email:</label>
<!--create a select box with dropdown email options taken from the database as this is more user friendly-->
<div><select class="mt-2 mb-2" name="vendor_email" id="vendoremail" required>
<?php
 require 'connect.php';
$sql="SELECT vendor_email FROM vendor";  //choose all the  possible options from the database table
 $result=mysqli_query($link,$sql);  //run the query
   if (mysqli_num_rows($result) >0)   //if records exist, output them as dropdown options
   {
 while ($row=mysqli_fetch_array($result)){
          $vendor_email=$row['vendor_email'];
        echo "<option value='$vendor_email'>$vendor_email</option>";  //set the value of the option selected and show the user the possible email addresses
  }
    }
    ?>
</select>
</div>
<label for="categoryid">Category ID: </label>

<!--create a select box with dropdown category options taken from the database as this is more user friendly-->
<div>
    <select class="mt-2 mb-2" name="category" id="categoryid" required>
<option>Select Category</option>
<?php
  $sql="SELECT * FROM category";       //choose all the  possible options from the database table
  $result=mysqli_query($link, $sql);    // run the query
  if (mysqli_num_rows($result) >0)    //if records exist, output them as dropdown options
  {
   while ($row=mysqli_fetch_array($result)){
     $categoryname=$row['categoryname'];
   $categoryid=$row['categoryid'];
     echo "<option value='$categoryid'>$categoryname</option>";  //set the value of the option selected to the categoryid but show the user the category name
    }
  }
mysqli_close($link);
?>
</select>
</div>
<label for="image">Image Path: </label>
<div><input class="mt-2 mb-2 form-control" type="text" id="image" name="image" placeholder="Enter image path" required /></div>

<div><input type="submit" class="btn btn-outline-warning mt-5 mb-5" name="submit" value="Add Product"/></div>

</form>
</div> <!--close the container-lg div -->

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
