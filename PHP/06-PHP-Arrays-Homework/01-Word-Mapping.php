<form action="" method="post">
    <textarea name="text" id="text" required></textarea>
    <input type="submit" id="submit" value="Count words"/>
</form>
<?php
if(isset($_POST['text'])){
    $string = strtolower($_POST['text']);
    $array = array_filter(preg_split('/\W/', $string));
    rsort($array,null);
    $result = array_count_values($array);

    echo "<table border='1' bgcolor='#d3d3d3'>";
    foreach($result as $word=>$count){
        echo "<tr><td>$word</td><td>$count</td></tr>";
    }
    echo "</table>";

}
?>

