<table border="1px">
    <tr>
        <th>Number</th>
        <th>Square</th>
    </tr>
    <?php
    $number = 0;
    $sqrt = 0;
    $sum = 0;

    while ($number <= 100) {
        echo "<tr><td>$number</td><td>" . round($sqrt, 2) . "</td></tr>";
        $number += 2;
        $sum = ($sum) + $sqrt;

        $sqrt = round(sqrt($number), 2);
    }

    echo "<tr><td>Total:</td><td>$sum</td></tr>"
    ?>
</table>