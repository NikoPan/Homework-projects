
<form method="post">
    <label for="string"></label>
    <input name="string" type="text" id="string"/>
    <input name="radio" value="palindrome" type="radio" id="palindrome">
    <label for="palindrome">Check Palindrome</label>
    <input name="radio" type="radio" value="reverse" id="rev">
    <label for="rev">Reverse String</label>
    <input name="radio" value="split" type="radio" id="split">
    <label for="split">Split</label>
    <input name="radio" value="hash" type="radio" id="hash">
    <label for="hash">Hash String</label>
    <input name="radio" value="shuffle" type="radio" id="shuffle">
    <label for="shuffle">Shuffle String</label>
    <input type="submit" value="Submit"/>
</form>

<?php
$result = '';


if (empty($_POST["string"])) {
    echo "String is required";
}
if (isset($_POST['string']) && isset($_POST['radio'])) {
    $string = htmlentities($_POST['string']);
    $modifier = $_POST['radio'];

//    echo $modifier;
    switch ($modifier) {
        case "palindrome":
            $isPalindrome = is_palindrome($string);
            if ($isPalindrome) {
                echo $string . " is a palindrome.";
            } else {
                echo $string . " is not a palindrome!";
            }
        break;
        case "reverse":
            $result = strrev($string);
            break;
        case "split":
            $result = split_letters($string);
            break;
        case "hash":
            $result = password_hash($string, PASSWORD_DEFAULT);
            break;
        case "shuffle":
            $result = str_shuffle($string);break;
        default:
            break;

    }
}
function is_palindrome($string)
{
    $a = strtolower(preg_replace("/[^A-Za-z0-9]/", "", $string));
    return $a == strrev($a);
}
function split_letters($string) {
    $split = str_split(preg_replace("/[^A-Za-z]/", "", $string));

    return htmlentities(implode(" ", $split));
}
?>
<p>
    <?= $result ?>
</p>