
<form method="get">
<label for='cars'>Enter cars:</label>
    <input type="text" name="cars" id="cars"/>
    <input type="submit" value='Show result'/>
</form>
<?php
if (isset($_GET["cars"])) {
    $array = explode(", ", htmlentities($_GET["cars"]));
    $color = ['red', 'black', 'white', 'blue', 'green'];
    echo "<table border='1'>";
    foreach ($array as $key => $car) {
        $colorVar = rand(0, 4);
        $quantityVar = rand(1, 5);
        echo "<tr><td>$car</td><td>$color[$colorVar]</td><td>$quantityVar</td><tr/>";
    }
    echo "</table>";
}
?>
