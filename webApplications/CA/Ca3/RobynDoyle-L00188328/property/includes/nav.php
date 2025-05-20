<!-- this sets up a var set to current page. this is needed to set the active tag in the nav menu items. -->
<?php
$current_page = basename($_SERVER['PHP_SELF']);
?>

<nav class="navbar navbar-expand-md navbar-dark bg-dark" aria-label="Fourth navbar example">
  <div class="container-fluid">
    <a class="bi bi-house fs-1 text-warning me-2" href="Home.php"></a>
    <a class="navbar-brand text-warning" href="Home.php">ROYLE Properties</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample04">
      <ul class="navbar-nav me-auto mb-2 mb-md-0">
        <li class="nav-item">
          <a class="nav-link <?php if($current_page == 'Home.php') echo 'active'; ?>" href="Home.php">Home</a>
        </li>
        <li class="nav-item dropdown">
            <!-- the line below dynamically sets the active tag -->
            <a class="nav-link dropdown-toggle <?php 
                if ($current_page == 'displayallproductscards.php' || ($current_page == 'displayproductsbycat.php' && isset($_GET['categoryid']) && in_array($_GET['categoryid'], ['1','2','3']))) echo 'active'; ?>"href="#" id="dropdown04" data-bs-toggle="dropdown" aria-expanded="false">Listings</a>
          <ul class="dropdown-menu" aria-labelledby="dropdown04">
            <li><a class="dropdown-item" href="displayallproductscards.php">All Properties</a></li>
            <li><a class="dropdown-item" href="displayproductsbycat.php?categoryid=1">Residential</a></li>
            <li><a class="dropdown-item" href="displayproductsbycat.php?categoryid=2">Commercial</a></li>
            <li><a class="dropdown-item" href="displayproductsbycat.php?categoryid=3">Sites</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link <?php if($current_page == 'getcomments.php') echo 'active'; ?>" href="getcomments.php">Testimonials</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <?php if($current_page == 'AboutUs.php') echo 'active'; ?>" href="AboutUs.php">About Us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <?php if($current_page == 'Contact.php') echo 'active'; ?>" href="Contact.php">Contact</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <?php if($current_page == 'search.php') echo 'active'; ?>" href="search.php">Search</a>
        </li>
      </ul>

      <div class="d-flex flex-column flex-md-row gap-2 ms-ms-3">
        <button type="button" class="btn btn-outline-light">Login</button>
        <button type="button" class="btn btn-warning">Sign-up</button>
      </div>
    </div>
  </div>
</nav>
