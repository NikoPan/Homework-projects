<?php
session_start();
if (!isset($_SESSION['score'])) {
    $_SESSION['score'] = 0;
}
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HTML Tags Counter</title>
    <style>
        form input {
            margin: 10px 0 10px 0;
        }
        #result{
            font-size: x-large;
        }
    </style>
</head>
<body>
<form action="04-HTML-Tags-Counter.php" method="post">
    <label for="tag">Enter HTML tag:</label><br/>
    <input type="text" name="tag" id="tag">
    <input type="submit" name="submit" value="Submit"><br/>
</form>
<br/>
<?php
if (isset($_POST['submit'])) {
    $tagsString = 'html head body div span DOCTYPE title link meta style p h1 h2 h3 h4 h5 and h6 strong em abbr acronym'.
        'address bdo blockquote cite q code ins del dfn kbd pre samp var br a base img area map object param ul ol li dl dt dd'.
        'table tr td th tbody thead tfoot col colgroup caption form input textarea select option optgroup button label fieldset'.
        'legend script noscript bi tt sub sup big small hr b i';
    $tags = explode(' ', $tagsString);
    if(array_search($_POST['tag'], $tags)){
        $isValidTag = 'Valid';
        $_SESSION['score']++;
    } else {
        $isValidTag = 'Invalid';
    }
    echo "<div id='result'>{$isValidTag} HTML tag! </br>Score: {$_SESSION['score']}</div>";
}
?>
</body>
</html>