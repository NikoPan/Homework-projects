<form method="get">
    <label for="years"> Enter number of years:</label>
    <input name="years" type="number" id="years"/>
    <input type="submit" value="Show costs"/>
</form>
<br/>
<?php
if (isset($_GET['years'])) {
    $years = $_GET['years'];
    $total = 0;
    $year = 2015;
    echo "<table border='1'>
        <thead>
        <th>Year</th>
        <th>January</th>
        <th>February</th>
        <th>March</th>
        <th>April</th>
        <th>May</th>
        <th>Jun</th>
        <th>July</th>
        <th>August</th>
        <th>September</th>
        <th>October</th>
        <th>November</th>
        <th>December</th>
        <th>Total:</th>
        </thead>
        <tbody>";

    for ($i = $years; $years > 0; $years--, $year--) {
        echo "<td>" . $year . "</td>";

        for ($i = 1; $i <= 12; $i++) {
            $expenses = rand(0, 999);
            $total += $expenses;
            echo "<td>" . $expenses . "</td>";
        }
        echo "<td>" . $total . "</td></tr>";
        $total = 0;

    }
    echo "</tbody></table>";
}

?>


