<?php
if($SERVER["REQUEST_METHOD"] == "POST"){
    $fname = htmlspecialchars($_POST['fname']);
    $lname = htmlspecialchars($_POST['lname']);

    echo "<h2>입력한 이름과 성:<h2>";
    echo "이름: ". $fname . "<br>";
    echo "성: ". $lname . "<br>";
}
?>