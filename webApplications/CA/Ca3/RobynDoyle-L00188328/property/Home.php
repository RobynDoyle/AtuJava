<!-- Robyn Doyle L00188328 -->

<!DOCTYPE HTML>
<html lang="en">
    <head>
        <title>Home</title>
        <meta charset="utf-8">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Link to your custom css -->
        <link rel="stylesheet" href="css/styles.css">
        <meta name="description" content="ROYLE Properties offers properties for sale in the greater LA Area in California.">
        <meta name="keywords" content="Home Page, ROYLE Properties, Los Angeles, House, Residential, Commercial, Sites.">

        <!-- set the viewport element to give the browser instructions on how to control the page's dimensions and scaling-->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap Icons CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Font Awesome Icons CDN -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <div class="container-fluid p-0">

        <!--menu-->
       
        <!--create a menu (code should be adapted from Bootstrap example files)-->
        <!-- https://getbootstrap.com/docs/5.0/examples/navbars/ -->
        <?php include("includes/nav.php");?>
      


        

      

        
        <!-- This section is adapted from https://getbootstrap.com/docs/5.3/examples/carousel/ -->
        <div id="myCarousel" class="carousel slide mb-6" data-bs-ride="carousel">
            <div class="carousel-indicators">
                
              <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active" aria-label="Slide 1" aria-current="true"></button>
              <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2" class=""></button>
              <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3" class=""></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="Assets/mansion2.jpg" class="d-block w-100 h-100 object-fit-cover" alt="Mansion">
                <div class="container">
                  <div class="carousel-caption text-start bg-dark bg-opacity-50 p-4 rounded w-45 mx-auto">
                                        <!-- i added a dark background on the caption box here to make the text more readable. -->

                    <h1>Sea Side Holiday Home</h1>
                    <p>Boasting beach front access and fantastic features this newly listed property is the holiday home of dreams. Now available for viewing.</p>
                    <p><a class="btn btn-lg btn-warning" href="moredetails.php?propertyid=11">View property</a></p>
                  </div>
                </div>
              </div>
              <div class="carousel-item">
                <img src="Assets/sky.jpg" class="d-block w-100 h-100 object-fit-cover" alt="Skyline">
                <div class="container">
                  <div class="carousel-caption bg-dark bg-opacity-50 p-4 rounded w-45 mx-auto">
                                                            <!-- i added a dark background on the caption box here to make the text more readable. -->

                    <h1>New Commercial Offices</h1>
                    <p>Your start up needs an office? These state of the art offices in downtown LA have just come to market and are the perfect setting to do business. Demand is high, first come, first served.</p>
                    <p><a class="btn btn-lg btn-warning" href="moredetails.php?propertyid=15">Learn more</a></p>
                  </div>
                </div>
              </div>
              <div class="carousel-item">
                <img src="Assets/site.jpg" class="d-block w-100 h-100 object-fit-cover" alt="Site">
                <div class="container">
                  <div class="carousel-caption text-end bg-dark bg-opacity-50 p-4 rounded w-45 mx-auto">
                    <!-- i added a dark background here to make the text more readable. -->
                    <h1>Zoned Site ready for development</h1>
                    <p>Looking for a top investment opportunity? This new 10 acre Site on California Street LA fits the bill. With full planning permission and easy utility connections it is a prime investment in todays market.</p>
                    <p><a class="btn btn-lg btn-warning" href="moredetails.php?propertyid=16">View online</a></p>
                  </div>
                </div>
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>


        <!-- This section is adapted from https://getbootstrap.com/docs/5.3/examples/carousel/ even though it is called carousel there are many features to be adpated from this page. -->
        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
              <div class="col-lg-4">
                <img src="Assets/residential.png" alt="Residential" class="rounded-circle" style="width: 160px; height: 160px; object-fit: cover;">
                  <h2 class="fw-normal">Residential</h2>
                <p>Explore all of our listings in the Residential property sector. From Houses to Apartments, Condos to Holiday Homes, we got your next residential property listed here.</p>
                <p><a class="btn btn-warning" href="displayproductsbycat.php?categoryid=1">Explore »</a></p>
              </div><!-- /.col-lg-4 -->
              <div class="col-lg-4">
                <img src="Assets/commercial.jpg" alt="Commercial" class="rounded-circle" style="width: 160px; height: 160px; object-fit: cover;">
                <h2 class="fw-normal">Commercial</h2>
                <p>All commerical properties viewable with a single click. From Offices and Warehouses, to Shops and Stores, take a browse through our wide range of offerings.</p>
                <p><a class="btn btn-warning" href="displayproductsbycat.php?categoryid=2">Explore »</a></p>
              </div><!-- /.col-lg-4 -->
              <div class="col-lg-4">
                <img src="Assets/site3.jpg" alt="Sites" class="rounded-circle" style="width: 160px; height: 160px; object-fit: cover;">
                <h2 class="fw-normal">Sites</h2>
                <p>We have an extensive set of Sites listed in this section. Whether you are looking to build a Home, Skyscraper, Amusement Park or Stadium, we have the site for you!</p>
                <p><a class="btn btn-warning" href="displayproductsbycat.php?categoryid=3">Explore »</a></p>
              </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->
        
        
            <!-- START THE FEATURETTES -->
        
            <hr class="featurette-divider">
        
            <div class="row featurette">
              <div class="col-md-7">
                <h2 class="featurette-heading fw-normal lh-1">First time buyer? <span class="text-body-secondary">Check out this home!</span></h2>
                <p class="lead">This stunning 1960's house on the edge of LA is the perfect place to call your first home. With a lovely back garden and generous facilites, it is truly a gem of a home. The local area has a school, hospital and shopping mall within walking distance. </p>
                <div class="d-flex align-items-center mb-3">
                    <a class="btn btn-warning me-3" href="moredetails.php?propertyid=8">View this property »</a>
                    <h5 class="mb-0 fw-bold">Asking Price: $395,000</h5>
                  </div>
                <p><a class="btn btn-warning me-3" href="displayproductsbycat.php?categoryid=1">Browse for similiar »</a></p>
              </div>
              <div class="col-md-5">
                <img src="Assets/firstTimeBuyer.jpg" class="d-block w-100 h-100 object-fit-cover" alt="First time buyer home">
              </div>
            </div>
        
            <hr class="featurette-divider">
        
            <div class="row featurette">
              <div class="col-md-7 order-md-2">
                <h2 class="featurette-heading fw-normal lh-1">Thinking of down sizing? <span class="text-body-secondary">Look no further!</span></h2>
                <p class="lead">Is it time to move into a more comfortable and easy to maintain home? Then this may be the home you were looking for. Situated in the heart of LA's natural beauty this modern and sleek property provides all the benefits of modern living and more!</p>
                <div class="d-flex align-items-center mb-3">
                    <a class="btn btn-warning me-3" href="moredetails.php?propertyid=9">View this property »</a>
                    <h5 class="mb-0 fw-bold">Asking Price: $290,000</h5>
                  </div>
                <p><a class="btn btn-warning" href="displayproductsbycat.php?categoryid=1">Browse for similiar »</a></p>
              </div>
              <div class="col-md-5 order-md-1">
                <img src="Assets/downsize.jpg" class="d-block w-100 h-100 object-fit-cover" alt="Down sizing home">
              </div>
            </div>
        
            <hr class="featurette-divider">
        
            <div class="row featurette">
              <div class="col-md-7">
                <h2 class="featurette-heading fw-normal lh-1">Your next home?<span class="text-body-secondary"> Explore this property! </span></h2>
                <p class="lead">Modern and sleek home in the heart of the hills. This amazing property has everything you need to enjoy peaceful weekneds and short commuting times into work.</p>
                <div class="d-flex align-items-center mb-3">
                    <a class="btn btn-warning me-3" href="moredetails.php?propertyid=10">View this property »</a>
                    <h5 class="mb-0 fw-bold">Asking Price: $579,000</h5>
                  </div>                <p><a class="btn btn-warning" href="displayproductsbycat.php?categoryid=1">Browse for similiar »</a></p>
              </div>
              <div class="col-md-5">
                <img src="Assets/firstTIme2.jpg" class="d-block w-100 h-100 object-fit-cover" alt="Down sizing home">
              </div>
            </div>
        
            <hr class="featurette-divider">
        
            <!-- /END THE FEATURETTES -->
        
          </div>
                    

        <!--services offered-->
        <section> 
        <!-- This container should outline the services that your company offers (6 services), you should use cards set out in columns, a grid or a carousel - see notes -->
        </section>

        <!-- our team -->
        <section>
        <!-- This container will store info on your staff. The team should have at least 4 members. I used and adapted Bootstrap Brain Component - see notes-->
        </section>

       


        <!--footer adapted from https://getbootstrap.com/docs/5.3/examples/footers/-->
        
        <?php include("includes/footer.php");?>
        

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>