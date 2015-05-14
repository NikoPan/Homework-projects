<form method="get">
    Text:<br />
    <textarea name="input"></textarea>
    <br />
    Word:<br />
    <input name="word" type="text" />
    <br />
    <input type="submit" value="Submit" />
</form>

<?php
function matchChecker($arr) {
    $w = $_GET['word'];
    $match = "/ ".$w."[\s\.\!\?]/i";
    $matches = array();
    foreach ($arr as $key => $value) {
        if (preg_match($match, $value) == 1) {
            array_push($matches, $value);
        }
    }
    return $matches;
}

if (isset($_GET['input'])):
    $pattern = "/([^\.\!\?]+[\!\.\?]\s*)/";
    preg_match_all($pattern, $_GET['input'], $temp);
    $arr = $temp[0];

    $output = matchChecker($arr);

    foreach ($output as $key => $value):
        ?>

        <p><?= htmlentities($value) ?></p>

    <?php
    endforeach;
endif;
?>