<?php
require 'connect.php';
$propertyid= $_GET["propertyid"];
$sql= "DELETE FROM property WHERE propertyid=$propertyid";
if (mysqli_query( $link, $sql))
{
header("Location: http://localhost/property/manageproducts.php");
  exit;
}
else
{
  echo "Could not delete property";
  echo "<pre>".mysqli_error($link)."</pre>";
}
mysqli_close($link);
?>
