<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Print Tags</title>
</head>
<body>
<?php
echo "Enter Tags:<br/><form method=\"get\">
<input type=\"text\" name=\"tags\" />
    <input type=\"submit\" />
    </form>";
if (isset($_GET["tags"])) {
    $array = explode(", ", htmlentities($_GET["tags"]));

    foreach ($array as $key => $value) {
        echo $key . " : " . $value . "<br/>";
    }
}
?>
</body>
</html>

