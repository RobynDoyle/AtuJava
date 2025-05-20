<!-- Robyn Doyle L00188328 -->
<!DOCTYPE HTML>
<html lang="en">
    <head>
        <title>About Us</title>
        <meta charset="utf-8">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Link to your custom css -->
        <link rel="stylesheet" href="css/styles.css">
        <meta name="description" content="ROYLE Properties offers properties for sale in the greater LA Area in California.">
        <meta name="keywords" content="About Us, ROYLE Properties, Los Angeles, House, Residential, Commercial, Sites.">

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

          <!-- Company introduction section - Simple 2 column 1 row setup-->
          <section class="py-5">
            <div class="container">
              <div class="row align-items-center">
                <div class="col-md-6">
                  <h2>Welcome to ROYLE Properties</h2>
                  <p>ROYLE Properties was established in 2022, specialising in residential and commercial properties as well as sites for development. The business is growing fast and has recently moved to a new office, beside Apple's HQ building in California. With a strong focus on quality service and attention to detail, ROYLE Properties is the right partner for you to find the property you are looking for.</p>
                </div>
                <div class="col-md-6">
                  <img src="Assets/Office.jpg" alt="Company HQ" class="img-fluid rounded">
                </div>
              </div>
            </div>
          </section>



          <!-- Carosel of services from https://getbootstrap.com/docs/5.0/components/carousel/ i right clicked the page, selected inspect and chose the code that I needed from there. made some adjustments to suit my website. -->
          <section class="py-5 bg-dark"> 
            <!-- set it (background) to dark to provide contrast and repetition, matching my header and overall aesthethic of the website -->
            <div class="container">
              <h3 class="text-center mb-4 text-warning">Our Services</h3>
              
              <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">

                <div class="carousel-inner">
          
                  <!-- First set of services slide -->
                  <div class="carousel-item active"> <!-- this active tag means this is the first slide shown in me carousel-->
                    <div class="row">
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-key-fill fs-1 text-warning"></i>
                            <h5 class="card-title">Buying a property</h5>
                            <p class="card-text">Get all the assistance you need for buying residential properties.</p>
                          </div>
                        </div>
                      </div>
          
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-house fs-1 text-warning"></i>
                            <h5 class="card-title">Selling a property</h5>
                            <p class="card-text">Get all the assistance you need for buying residential properties.</p>
                          </div>
                        </div>
                      </div>
          
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-calculator fs-1 text-warning"></i>
                            <h5 class="card-title">First time buyers calculator</h5>
                            <p class="card-text">Our online calculator shows all first time buyers their potential state supports.</p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
          
                  <!-- Second  set of services slide -->
                  <div class="carousel-item">
                    <div class="row">
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-sun fs-1 text-warning"></i>
                            <h5 class="card-title">Holiday Homes Buyers support</h5>
                            <p class="card-text">We specialise in finding the most scenic holiday homes in the market.</p>
                          </div>
                        </div>
                      </div>
          
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-currency-dollar fs-1 text-warning"></i>
                            <h5 class="card-title">Investment opportunites</h5>
                            <p class="card-text">We are the best partner for identifying top property investment options in todays market.</p>
                          </div>
                        </div>
                      </div>
          
                      <div class="col-md-4">
                        <div class="card h-100 text-center">
                          <div class="card-body">
                            <i class="bi bi-bar-chart-line-fill fs-1 text-warning"></i>
                            <h5 class="card-title">Start-Up Property Hub</h5>
                            <p class="card-text"> We facilitate the commercial needs of local companies looking for commercial premises. </p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
          
                </div>
          
                <!-- Controls for the carousel sectoin also taken from  https://getbootstrap.com/docs/5.0/components/carousel/ -->

                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                  </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>   
              </div>
            </div>
          </section>
          
      


        



                    

       
        <!-- our team  cards adapted from https://getbootstrap.com/docs/5.3/examples/features/ -->
        <section>
            <h3 class="text-center mb-2 mt-5 text-warning fw-bold">Meet the Team</h3>
        <!-- This container will store info on your staff. The team should have at least 4 members. I used and adapted Bootstrap Brain Component - see notes-->
        <div class="row row-cols-1 row-cols-lg-3 align-items-stretch g-4 py-5">
            
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff1.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">Rob Jones</h3>
                  <ul class="d-flex list-unstyled mt-auto bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning p-3"></i>                    </li>
                    <li class="d-flex align-items-center me-3">
                        <small> CEO</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <small>Joined in 2022</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
      
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff3.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">Su Row</h3>
                  <ul class="d-flex list-unstyled mt-auto bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning"></i>                     </li>
                    <li class="d-flex align-items-center me-3">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Location"><use xlink:href="#geo-fill"></use></svg>
                      <small>COO</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Duration"><use xlink:href="#calendar3"></use></svg>
                      <small>Joined in 2023</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
      
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff5.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">Sam Smith</h3>
                  <ul class="d-flex list-unstyled mt-auto  bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning"></i>                     </li>
                    <li class="d-flex align-items-center me-3">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Location"><use xlink:href="#geo-fill"></use></svg>
                      <small>Manager</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Duration"><use xlink:href="#calendar3"></use></svg>
                      <small>Joined in 2023</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
       
          <div class="row row-cols-1 row-cols-lg-3 align-items-stretch g-4 py-5">
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff6.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">Greg Towns</h3>
                  <ul class="d-flex list-unstyled mt-auto bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning p-3"></i>                    </li>
                    <li class="d-flex align-items-center me-3">
                        <small>Agent</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <small>Joined in 2022</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
      
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff8.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">John Doyle</h3>
                  <ul class="d-flex list-unstyled mt-auto bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning p-3"></i>                     </li>
                    <li class="d-flex align-items-center me-3">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Location"><use xlink:href="#geo-fill"></use></svg>
                      <small>Agent</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Duration"><use xlink:href="#calendar3"></use></svg>
                      <small>Joined in 2025</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
      
            <div class="col">
              <div class="card card-cover h-100 overflow-hidden text-bg-dark rounded-4 shadow-lg" style="background-image: url('Assets/staff9.jpg');">
                <div class="d-flex flex-column h-100 p-5 pb-3 text-warning text-shadow-1">
                  <h3 class="pt-2 mt-5 mb-4 display-6 lh-1 fw-bold">Nico Rosberg</h3>
                  <ul class="d-flex list-unstyled mt-auto  bg-dark bg-opacity-50 p-1 rounded w-45 mx-auto">
                    <li class="me-auto">
                        <i class="bi bi-house fs-1 text-warning"></i>                     </li>
                    <li class="d-flex align-items-center me-3">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Location"><use xlink:href="#geo-fill"></use></svg>
                      <small>Agent</small>
                    </li>
                    <li class="d-flex align-items-center">
                      <svg class="bi me-2" width="1em" height="1em" role="img" aria-label="Duration"><use xlink:href="#calendar3"></use></svg>
                      <small>Joined in 2023</small>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

          
          
    </section>

    

        <!-- contact form -->
        <section>
        <!--This container should house a contact form. You can adapt sample forms from Bootsrap documentation or use the simple form provided as a starting point. You need to add Bootstrap icons to the form fields (see slide 45) and a select element dropdown (see slide 39) relating to each of your services outlined in the services section -->
            <section>
                <!--form code adapted from https://mdbootstrap.com/docs/standard/forms/overview/ i moved the labels above the input boxes and added placeholder text -->
            <div class="text-center">
            <h3>Get in Touch</h3>
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