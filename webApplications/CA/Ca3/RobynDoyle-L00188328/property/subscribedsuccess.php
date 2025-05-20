<!-- Robyn Doyle L00188328 -->

<!DOCTYPE HTML>
<html lang="en">
    <head>
        <title>Contact</title>
        <meta charset="utf-8">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Link to your custom css -->
        <link rel="stylesheet" href="css/styles.css">

        <!-- set the viewport element to give the browser instructions on how to control the page's dimensions and scaling-->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap Icons CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Font Awesome Icons CDN -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <!-- link to stackpath Bootstrap for scrolling slideshow -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-r4NyPzZr58AfzC8EwB2ZtFb8KbbAp8MyF+RXER5bYlK/5tJwNnQU5TYrjwEhjLXB" crossorigin="anonymous">

    </head>
    <body>

        <div class="container-fluid p-0">

        <!--menu-->
       
        <!-- navbar adapted from https://getbootstrap.com/docs/5.0/examples/navbars/ where i got the code by right clicking and selecting inspect and getitng the code -->
        <?php include("includes/nav.php");?>

          <!-- CONTACT details list adapted from https://getbootstrap.com/docs/5.3/examples/list-groups/ -->
          <div class="d-flex flex-column align-items-center justify-content-center text-center p-5">
          <div class="position-relative text-center mt-1">
  <img src="images/sky2.jpg" class="img-fluid w-100" alt="Subscription thank you banner" style="height: 650px; object-fit: cover;">

  <div class="position-absolute top-50 start-50 translate-middle text-white bg-dark bg-opacity-50 p-4 rounded">
    <h2 class="mb-3">Thank you for Subscribing!</h2>
    <i class="bi bi-house text-warning mb-3" style="font-size: 4rem;"></i><br>
    <a class="btn btn-lg btn-warning mt-3" href="displayallproductscards.php">Browse</a>
  </div>
</div>
           

        


        <!--footer adapted from https://getbootstrap.com/docs/5.3/examples/footers/-->
        
        <?php include("includes/footer.php");?>
        


        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"></script>

    </body>
</html>