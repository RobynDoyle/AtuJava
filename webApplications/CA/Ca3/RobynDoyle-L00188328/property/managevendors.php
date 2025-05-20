<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Manage Vendors</title>
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

<a href='admin.php' class='btn btn-outline-warning'>Admin Home Area</a>
<a href='logout.php' class='btn btn-outline-warning'>Logout</a>
<hr>
<h3>Manage Vendors</h3>
<a href="addvendor.php" class="btn btn-outline-warning mt-3 mb-3">Add a new vendor</a>
<br>
<br>
<?php
require 'connect.php';

$sql="SELECT * from vendor";
$result=mysqli_query($link, $sql);
if (mysqli_num_rows($result)>0)
{
    echo "<div class='table-responsive'>"; /*needed to wrap table in a responsive table class in BS*/
    echo "<table class='table'>"; /*need to add the table class to use BS table styles */
    echo "<tr>
        <td><strong>Email</td>
        <td><strong>First Name</td>
        <td><strong>Surname</td>
        <td><strong>Phone</td>
        <td><strong>Update</td>
        <td><strong>Delete</td>
        </tr>";
    while($row=mysqli_fetch_array($result)) {
        $vendor_email=$row["vendor_email"];
        $vendor_firstname=$row["vendor_firstname"];
        $vendor_surname=$row["vendor_surname"];
        $vendor_phone=$row["vendor_phone"];
        echo "<tr>
            <td>$vendor_email</td>
            <td>$vendor_firstname</td>
            <td>$vendor_surname</td>
            <td>$vendor_phone</td>
            <td><a href='editvendor.php?vendor_email=$vendor_email' class='btn btn-outline-warning'>Update</a></td>
            <td><a href='confirmdeletevendor.php?vendor_email=$vendor_email' class='btn btn-outline-warning'>Delete</a></td>
            </tr>";
    }
    echo "</table>";
    echo "</div>";
    }
    else
    {
    echo ("There are no records in the database");
    }
    mysqli_close($link);
    ?>
    
</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
