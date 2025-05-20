<?php
require 'connect.php';

if (isset($_POST['submit'])) {
    $name = mysqli_real_escape_string($link, $_POST['name']);
    $email = mysqli_real_escape_string($link, $_POST['email']);
    $service = mysqli_real_escape_string($link, $_POST['service']);
    $message = mysqli_real_escape_string($link, $_POST['message']);
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Invalid email format.";
        exit;
    }
    // send data into the Message table.
    $sql = "INSERT INTO Message (Name, Email, Service, Message) 
            VALUES ('$name', '$email', '$service', '$message')";

    if (mysqli_query($link, $sql)) {
        header("Location: Message.php");
        exit;
    } else {
        echo "Error: " . mysqli_error($link);
    }
}
mysqli_close($link);
?>
