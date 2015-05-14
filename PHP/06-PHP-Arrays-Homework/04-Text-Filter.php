<form method="get">
    Text:<br />
    <textarea name="input"></textarea>
    <br />
    Forbidden words:<br />
    <input name="words" type="text" />
    <br />
    <input type="submit" value="Submit" />
</form>
<?php
function createReplacements($arr) {
    $replacements = array();

    foreach ($arr as $key => $value) {
        $pattern = str_split($value);
        $asterix = str_replace($pattern, "*", $value);
        array_push($replacements, $asterix);
    }

    return $replacements;
}
function createPattern($arr) {
    $matchers = array();
    foreach ($arr as $key => $value) {
        $matcher = "/".$value."/";
        array_push($matchers, $matcher);
    }

    return $matchers;
}
if (isset($_GET['input']) && isset($_GET['words'])):
    $words = preg_split("/, /", $_GET['words']);
    $pattern = createPattern($words);
    $replacements = createReplacements($words);
    $text = $_GET['input'];

    $output = preg_replace($pattern, $replacements, $text);
    ?>

    <?= htmlentities($output) ?>

<?php
endif;
?>