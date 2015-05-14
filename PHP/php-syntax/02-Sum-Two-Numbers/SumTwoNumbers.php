<?php
$firstNumber = 1234.5678;
$secondNumber = 333;
$sum = round(($firstNumber + $secondNumber),2);

echo "\$firstNumber + \$secondNumber = " . $firstNumber . " + " . $secondNumber . " = " . number_format($sum, 2, ",", "");

?>
