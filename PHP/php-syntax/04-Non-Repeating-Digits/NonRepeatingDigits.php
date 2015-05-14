<?php

$num = 1234;
//$num = 145;
//$num = 15;
//$num = 247;

if ($num < 102) {
    echo "no";
} else if ($num > 999) {
    $num = 999;
}

for ($i = 100; $num >= $i; $i++) {
    $str = (string)$i;
    if ($str[0] != $str[1] && $str[1] != $str[2] && $str[0] != $str[2]) {
        echo $str . ", ";
    }
}

