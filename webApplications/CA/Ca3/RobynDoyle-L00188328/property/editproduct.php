<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Edit Product</title>
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
<?php
require 'connect.php';
$propertyid=$_GET["propertyid"];         //retrieve the propertyid passed in the url
$sql="SELECT * FROM property, category WHERE propertyid=$propertyid AND category.categoryid=property.categoryid";
$result=mysqli_query($link, $sql);      //run the query
$row=mysqli_fetch_array($result);     //store the recordset in $row
//retrieve the database fields from the recordset and assign to variables for output
$propertyid=$row["propertyid"];
$town=htmlspecialchars($row["town"]);
$address1=htmlspecialchars($row["address1"]);
$county=htmlspecialchars($row["county"]);
$price=htmlspecialchars($row["price"]);
$bedrooms=htmlspecialchars($row["bedrooms"]);
$shortdesc=htmlspecialchars($row["shortdescription"]);
$longdesc=htmlspecialchars($row["longdescription"]);
$vendor_email=htmlspecialchars($row["vendor_email"]);
$categoryid=$row["categoryid"];
$categoryname=htmlspecialchars($row["categoryname"]);
$image=htmlspecialchars($row["image"]);
?>
 <!--show image of product and then write out the existing fields into the form fields-->
 <?php echo "<img src='$image' width=200 height=200>" ?>
 <form method="post" action="processedit.php">
 <input type="hidden" name="propertyid" value="<?php echo $propertyid; ?>"/> <!--propertyid is not displayed but needed to update the correct record in the processedit page-->
<label for="address1">Street</label>
<div><input type="text" name="address1" id="address1" class="form-control mt-2 mb-2" value="<?php echo $address1; ?>" required/></div>
<label for="town">Town / City</label>
<div><input type="text" name="town" id="town" class="form-control mt-2 mb-2" value="<?php echo $town; ?>" required/></div>
<label for="address1">County / State</label>
<div><input type="text" name="county" id="county" class="form-control mt-2 mb-2" value="<?php echo $county; ?>" required/></div>
<label for="price">Bedrooms:</label>
<div><input type="number" name="bedrooms" id="bedrooms" class="form-control mt-2 mb-2" value="<?php echo $bedrooms; ?>" required/></div>
<label for="price">Price:</label>
<div><input type="number" name="price" id="price" step="0.01" min="0" class="form-control mt-2 mb-2" value= "<?php echo $price; ?>" required /></div>
<label for="description">Description:</label>
<div><textarea name="shortdescription"  id="shortdescription" class="form-control mt-2 mb-2" rows="8" cols="35" required><?php echo $shortdesc; ?> </textarea>
</div>
<label for="longdescription">Long Description:</label>
<div><textarea name="longdescription" id="longdescription" class="form-control mt-2 mb-2" rows="8" cols="35" required><?php echo $longdesc; ?></textarea></div>
<label for="vendoremail">Vendor Email:</label>
<!--create a select box with dropdown email options taken from the database as this is more user friendly-->
<div><select name="vendor_email" class="mt-2 mb-2" id="vendoremail" required>
<?php
echo "<option value = '$vendor_email'>$vendor_email</option>";      
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
<select name="category" class="mt-2 mb-2" id="categoryid" required>
<?php
  echo "<option value = '$categoryid'>$categoryname</option>";     
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
<div><input type="text" id="image" name="image" class="form-control mt-2 mb-2" value="<?php echo $image; ?>" required /></div>

<div><input type="submit" class="btn btn-outline-warning mt-5" name="submit" value="Edit Product"/></div>

</form>
</div>

</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
