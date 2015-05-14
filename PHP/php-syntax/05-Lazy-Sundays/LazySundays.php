<?php

$startdate = strtotime("first Sunday of this month");
$enddate=strtotime("+4 weeks",$startdate);

while ($startdate <  $enddate) {
    echo date("dS F, Y", $startdate). "\n";

    $startdate = strtotime("+1 week", $startdate);
}
?>