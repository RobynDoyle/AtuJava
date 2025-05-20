<!DOCTYPE HTML>
<html lang="en">
<head>
  <title>Add Vendor</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/styles.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
</head>

<body>
<div class="container-fluid p-0">
<?php include("includes/nav.php");?>

<section class="p-3 mt-3">
<div class="container-lg">
  <a href='admin.php' class='btn btn-outline-warning'>Admin Home Area</a>
  <a href='managevendors.php' class='btn btn-outline-warning'>All Vendors</a>
  <a href='logout.php' class='btn btn-outline-warning'>Logout</a>
  <hr>
  
  <h3>Add a Vendor</h3>
  <form method="post" action="processaddvendor.php">
    <label for="vendor_email">Vendor Email</label>
    <div>
      <input class="mt-2 mb-2 form-control" type="text" name="vendor_email" id="vendor_email" placeholder="email" required/>
    </div>

    <label for="vendor_firstname">First Name</label>
    <div>
      <input class="mt-2 mb-2 form-control" type="text" name="vendor_firstname" id="vendor_firstname" placeholder="Name" required/>
    </div>

    <label for="vendor_surname">Surname</label>
    <div>
      <input class="mt-2 mb-2 form-control" type="text" name="vendor_surname" id="vendor_surname" placeholder="Surname" required/>
    </div>

    <label for="vendor_phone">Phone</label>
    <div>
      <input class="mt-2 mb-2 form-control" type="text" name="vendor_phone" id="vendor_phone" placeholder="+353 123456789" required/>
    </div>

    <div>
      <input type="submit" class="btn btn-outline-warning mt-5 mb-5" name="submit" value="Add Vendor"/>
    </div>
  </form>
</div>
</section>

<?php include("includes/footer.php");?>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
