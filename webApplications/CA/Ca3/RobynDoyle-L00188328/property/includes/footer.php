<!--declare a footer (code adapted from Bootstrap Example Files)-->
<!--footer adapted from https://getbootstrap.com/docs/5.3/examples/footers/-->
<div class="container">
<footer class="py-5 ">
  <div class="row">
    <div class="col-6 col-md-2 mb-3">
        <h5 class="text-warning">Residential</h5>
      <ul class="nav flex-column">
        <li class="nav-item mb-2"><a href="displayproductsbycat.php?categoryid=1" class="nav-link p-0 text-body-secondary">Top picks</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=7" class="nav-link p-0 text-body-secondary">Pick of the month</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=11" class="nav-link p-0 text-body-secondary">Pick of the week</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=10" class="nav-link p-0 text-body-secondary">Pick of the year</a></li>
        <li class="nav-item mb-2"><a href="adminlogin.php" class="nav-link p-0 text-white">Admin</a></li>
      </ul>
    </div>

    <div class="col-6 col-md-2 mb-3">
        <h5 class="text-warning">Commercial</h5>
      <ul class="nav flex-column">
        <li class="nav-item mb-2"><a href="displayproductsbycat.php?categoryid=2" class="nav-link p-0 text-body-secondary">Top picks</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=13" class="nav-link p-0 text-body-secondary">Pick of the month</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=12" class="nav-link p-0 text-body-secondary">Pick of the week</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=14" class="nav-link p-0 text-body-secondary">Pick of the year</a></li>
      </ul>
    </div>

    <div class="col-6 col-md-2 mb-3">
        <h5 class="text-warning">Sites</h5>
      <ul class="nav flex-column">
        <li class="nav-item mb-2"><a href="displayproductsbycat.php?categoryid=3" class="nav-link p-0 text-body-secondary">Top Picks</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=17" class="nav-link p-0 text-body-secondary">Pick of the week</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=16" class="nav-link p-0 text-body-secondary">Pick of the month</a></li>
        <li class="nav-item mb-2"><a href="moredetails.php?propertyid=18" class="nav-link p-0 text-body-secondary">Pick of the year</a></li>
      </ul>
    </div>

    <div class="col-md-5 offset-md-1 mb-3">
    <form action="subscribers.php" method="post">
    <h5 class="text-warning">Subscribe to our newsletter</h5>
    <p>Monthly catalogue of the newest properties. Get tips for your property search from our experts.</p>
    <div class="d-flex flex-column flex-sm-row w-100 gap-2">
      <label for="newsletterEmail" class="visually-hidden">Email address</label>
      <input id="newsletterEmail" name="email" type="email" class="form-control" placeholder="Email address" required>

      <label for="newsletterName" class="visually-hidden">Name</label>
      <input id="newsletterName" name="name" type="text" class="form-control" placeholder="Your name" required>

      <button class="btn btn-warning" type="submit" name="submit">Subscribe</button>
    </div>
  </form>
    </div>
  </div>

  <div class="d-flex flex-column flex-sm-row justify-content-between align-items-center py-4 my-4 border-top">
    <p class="mb-0">© 2025 ROYLE Properties Inc. All rights reserved.</p>
    <ul class="list-unstyled d-flex mb-0">
      <li>
        <a class="text-dark fs-4 mx-2" href="#" aria-label="Instagram">
          <i class="bi bi-instagram"></i>
        </a>
      </li>
      <li>
        <a class="text-dark fs-4 mx-2" href="#" aria-label="Twitter">
          <i class="bi bi-twitter"></i>
        </a>
      </li>
    </ul>
  </div>
</footer>
</div>
