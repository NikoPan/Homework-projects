<form method="post">
    <label for="start">Starting index: </label>
    <input name="start" type="number" id="start"/>
    <label for="end">End: </label>
    <input name="end" type="number" id="end"/>
    <input type="submit" value="Submit"/>
</form>
<br/>
<?php
    if (isset($_POST['start'], $_POST['end'])) {
        $start = htmlentities($_POST['start']);
        $end = htmlentities($_POST['end']);
        $isNum = is_numeric($start) && is_numeric($end);

        if (!$isNum) {
            die('Please enter valid nums!');
        }

    for ($i = intval($start); $i <= intval($end); $i++) {
        if ($i == $end) {
            if (isPrime($i)) {
                echo "<b>$i</b>";
            } else {
                echo $i;
            }
        } else {
            if (isPrime($i)) {
                echo "<b>$i</b>" . ", ";
            } else {
                echo $i . ", ";
            }
        }
    }
}
function isPrime($num)
{
    if ($num == 1) {
        return false;
    }
    if ($num == 2) {
        return true;
    }
    if ($num % 2 == 0) {
        return false;
    }

    for ($i = 3; $i <= ceil(sqrt($num)); $i = $i + 2) {
        if ($num % $i == 0) {
            return false;
        }
    }
    return true;

}

?>