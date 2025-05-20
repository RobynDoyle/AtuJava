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
        <meta name="description" content="ROYLE Properties offers properties for sale in the greater LA Area in California.">
        <meta name="keywords" content="ROYLE Properties, Los Angeles, House, Residential, Commercial, Sites.">

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
        <h1 class="d-flex flex-column flex-md-row p-4 gap-4 py-md-5 align-items-center justify-content-center">Contact</h1>
          <!-- CONTACT details list adapted from https://getbootstrap.com/docs/5.3/examples/list-groups/ -->
          <div class="d-flex flex-column flex-md-row p-4 gap-4 py-md-5 align-items-center justify-content-center">
            
          <div class="list-group">
              <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                <i class="bi bi-clock-fill text-warning fs-4"></i>
                <div class="d-flex gap-2 w-100 justify-content-between">
                  <div>
                    <h6 class="mb-0">Office Opening Hours</h6>
                    <p class="mb-0 opacity-75">Visit us at 22 Longdown Road, Los Angeles — weekdays 9:00 AM to 5:00 PM</p>
                  </div>
                </div>
              </a>
              <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                <i class="bi bi-telephone-fill text-warning fs-4"></i>
                <div class="d-flex gap-2 w-100 justify-content-between">
                  <div>
                    <h6 class="mb-0">Phone</h6>
                    <p class="mb-0 opacity-75">(555) 123-4567</p>
                  </div>
                </div>
              </a>
              <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                <i class="bi bi-envelope-fill text-warning fs-4"></i>                
                <div class="d-flex gap-2 w-100 justify-content-between">
                  <div>
                    <h6 class="mb-0">Email</h6>
                    <p class="mb-0 opacity-75">Office@RoyleProperties.com</p>
                  </div>
                </div>
              </a>
            </div>
          </div>


          <hr>


          <section class="p-4 d-flex justify-content-center mb-4 w-100">
            <div class="ratio ratio-16x9">
              <iframe 
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3303.6720876821157!2d-118.4147338847828!3d34.044548824233616!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80c2bb784b964cd7%3A0xf0175a2e9e7f304b!2s22%20Longdown%20Rd%2C%20Los%20Angeles%2C%20CA%2090049%2C%20USA!5e0!3m2!1sen!2sus!4v1713459876543!5m2!1sen!2sus" >
                
              </iframe>
            </div>
          </section>
          

        <!-- contact form -->
        <section>
        <!--This container should house a contact form. You can adapt sample forms from Bootsrap documentation or use the simple form provided as a starting point. You need to add Bootstrap icons to the form fields (see slide 45) and a select element dropdown (see slide 39) relating to each of your services outlined in the services section -->
            <section>
                <!--form code adapted from https://mdbootstrap.com/docs/standard/forms/overview/ i moved the labels above the input boxes and added placeholder text -->
            <div class="text-center">
            <h3>Send a Query</h3>
            <p class="lead text-muted">Any questions? Fill out the form to get in touch</p>
            </div>
            <div class="container-lg">
                <div class="row justify-content-center">
                <?php include("includes/form.php");?>
            </div>
            </div>
        </section>
        </section>

        <hr>

        


        <!--footer adapted from https://getbootstrap.com/docs/5.3/examples/footers/-->
        
        <?php include("includes/footer.php");?>
        


        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"></script>

    </body>
</html>