<form action="" method="post">
    <textarea name="text" id="text" required></textarea>
    <input type="submit" id="submit" value="Count words"/>
</form>
<?php
if(isset($_POST["text"])){
    $string = $_POST["text"];

    $array = [];
    var_dump($array);
}