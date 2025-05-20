<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Search Properties</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/stylesbs.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">


<!-- set the viewport element to give the browser instructions on how to control the page's dimensions and scaling-->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap Icons CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

 <style>
 #searchform {font-size: 0.8em; background-color: #ffffff; width: 30%; padding: 5px; min-width: 300px;}
 select{margin: 10px;}
 #btnSubmit {margin-left: 75px; margin-bottom: 10px;  border: 5px solid #ffc107;}
 </style>
 </head>
<body>

<div class="container-fluid p-0">
  
<?php include("includes/nav.php");?>
<section class="feedback p-3 mt-3 d-flex justify-content-center">
<form method="post" action="results.php" id="searchform">
<h3>Search Properties</h3>
<hr>
<div id ="gettown" class="searchbox">
<label> Location: </label>
<select name="location" required="required">
 <option value="">Select Town</option>
 <?php
   require "connect.php";
   $sql="select DISTINCT town from property";
   $result=mysqli_query($link, $sql);
   if (mysqli_num_rows($result) >0)
  {
   while ($row=mysqli_fetch_array($result)){
    $town=$row['town'];
    echo "<option value='$town'>$town</option>";
   }
  }
mysqli_close($link);
?>
</select>
</div>

<div id ="getcategory">
<label> Category: </label>
<select name="category" required="required">
<option value="">Select Category</option>
<?php
  require "connect.php";
  $sql="select * from category";
  $result=mysqli_query($link, $sql);
  if (mysqli_num_rows($result) >0)
  {
   while ($row=mysqli_fetch_array($result)){
     $categoryname=$row['categoryname'];
	 $categoryid=$row['categoryid'];
     echo "<option value='$categoryid'>$categoryname</option>";
   }
  }
mysqli_close($link);
?>
</select>
</div>

<div id="minprice">
<label>Min Price:</label>
<select name="minprice" required="required">
   <option value="">Select</option>
  <option value="20000">&euro; 20,000</option>
  <option value="50000">&euro; 50,000</option>
  <option value="100000">&euro; 100,000</option>
  <option value="1000000">&euro; 1,000,000 </option>
  <option value="5000000">&euro; 5,000,000 </option>
  <option value="10000000">&euro; 10,000,000 </option>
  <option value="50000000">&euro; 50,0000,000 </option>
  <option value="100000000">&euro; 100,000,000 </option>
</select>
</div>

<div id="maxprice">
<label>Max Price:</label>
<select name="maxprice" required="required">
   <option value="">Select</option>
   <option value="20000">&euro; 20,000</option>
  <option value="50000">&euro; 50,000</option>
  <option value="100000">&euro; 100,000</option>
  <option value="1000000">&euro; 1,000,000 </option>
  <option value="5000000">&euro; 5,000,000 </option>
  <option value="10000000">&euro; 10,000,000 </option>
  <option value="50000000">&euro; 50,0000,000 </option>
  <option value="100000000">&euro; 100,000,000 </option>
</select>
</div>

<div><button type="submit" class='btn btn-outline-warning mt-3 mb-3' name="submit">Search</button></div>
</form>
</section>
<?php include("includes/footer.php");?>
</div>
</body>
</html>