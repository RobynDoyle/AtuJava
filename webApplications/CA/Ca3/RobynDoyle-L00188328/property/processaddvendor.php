<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Process Add Vendor</title>
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

if (isset($_POST['submit'])) {
    if (empty($_POST['vendor_email']) || empty($_POST['vendor_firstname']) || empty($_POST['vendor_surname']) || empty($_POST['vendor_phone'])) {
        echo "<h3>Error</h3>";
        echo "<p>All fields are required. Please fill in all fields.</p>";
        echo "<a href='addvendor.php' class='btn btn-outline-warning'>Return to Add Vendor</a>";
        exit;
    }

    $vendor_email = mysqli_real_escape_string($link, $_POST['vendor_email']);
    $vendor_firstname = mysqli_real_escape_string($link, $_POST['vendor_firstname']);
    $vendor_surname = mysqli_real_escape_string($link, $_POST['vendor_surname']);
    $vendor_phone = mysqli_real_escape_string($link, $_POST['vendor_phone']);

    // Check if vendor already exists in the database
    $sql_check_vendor = "SELECT * FROM vendor WHERE vendor_email='$vendor_email'";
    $result = mysqli_query($link, $sql_check_vendor);

    if (mysqli_num_rows($result) > 0) {
        echo "<h3>Warning</h3>";
        echo "<p>This vendor already exists.</p>";
        echo "<p>Please instead use the update option for the vendor with the email <strong>$vendor_email</strong>.</p>";
        echo "<a href='managevendors.php' class='btn btn-outline-warning'>Return to Vendor Admin page</a>";
    } else {
        $sql_insert = "INSERT INTO vendor(vendor_email, vendor_firstname, vendor_surname, vendor_phone)
                       VALUES ('$vendor_email', '$vendor_firstname', '$vendor_surname', '$vendor_phone')";
        if (mysqli_query($link, $sql_insert)) {
            echo "Vendor has been successfully added <p>";
            echo "<a class='btn btn-outline-warning mt-5' href='managevendors.php'>Return to Manage Vendors page</a>";
        } else {
            echo "An error occurred, try again!";
            echo "<pre>" . mysqli_error($link) . "</pre>";
        }
    }
}
mysqli_close($link);
?>

    </div>
    
</section>
<?php include("includes/footer.php");?>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
