<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Print Tags</title>
</head>
<body>
<?php

echo "<form method='get'>
Enter Amount <input type='number' name='amount'/><br/>
<input type='radio' name='currency' value='$'>USD
<input type='radio' name='currency' value='&#8364;'>EUR
<input type='radio' name='currency' value='лв'>BGN<br/>
Compound Interest Amount <input type='text' name='interest'/><br/>
<select name='period'>
  <option value='6'>6 Months</option>
  <option value='12''>1 Year</option>
  <option value='24'>2 Years</option>
  <option value='60'>5 Years</option>
</select>
    <input type='submit' name='submit' value='Calculate'/>
    </form>";

if (isset($_GET['amount']) && isset($_GET['currency']) && isset($_GET['interest']) && isset($_GET['period'])) {
    $amount = $_GET['amount'];
    $currency = $_GET['currency'];
    $interest = $_GET['interest'];
    $period = $_GET['period'];

    $result = round($amount * pow(1 + (($interest / 100) / 12), $period / 12 * 12), 2);

    if ($currency == 'лв') {
        echo $result . ' ' . $currency;
    } else {
        echo $currency . ' ' . $result;
    }
} else {
    echo "Required field is empty.";
}
?>
</body>
</html>