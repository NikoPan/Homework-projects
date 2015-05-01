<form method="post">
    <label for="string">Input string: </label>
    <input name="string" type="text" id="string"/>
    <input type="submit" value="Submit"/>
</form>
<?php
if (isset($_POST['string'])) {
    $string = htmlentities($_POST['string']);
    $array = preg_split("/[,\s]+/", $string);
    echo "<table border='1px'>";
    foreach ($array as $key => $value) {
        echo "<tr><td>$value</td>";
        $isNum = is_numeric($value);
            if (!$isNum) {
            echo "<td>I cannot sum that</td></tr>";
        } else {
            $digits = intval($value);
            $sum = 0;
            do {
                $sum += $digits % 10;
            } while ($digits = (int)$digits / 10);
            echo "<td>$sum</td></tr>";
        }
    }
}
?>