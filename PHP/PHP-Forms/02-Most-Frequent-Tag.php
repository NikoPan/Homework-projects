<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Print Tags</title>
</head>
<body>

<?php
echo "<form method=\"get\">
Enter Tags:<br/><br/><input type=\"text\" name=\"tags\" />
    <input type=\"submit\" />
    </form><br/>";

if (isset($_GET["tags"])) {
    $array = explode(", ", htmlentities($_GET["tags"]));
    $count = array_count_values($array);//Counts the values in the array, returns associatve array
    arsort($count);//Sort it from highest to lowest
    $most = $count;
    foreach($count as $key => $value){
        echo $key." : ".$value. " times </br>";
    }
    reset($count);
    echo "<br/>Most Frequent Tag is: ". key($count);

}
?>
</body>
</html>