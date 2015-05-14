<!DOCTYPE html>
<html>
<head>
    <title>Coloring Texts</title>
    <style>
        .red {
            color: #ff0000;
        }

        .blue {
            color: #0000ff;
        }
    </style>
</head>
<body>
<div id="container">
    <form action="" method="post">
        <textarea name="text" id="text" required></textarea>
        <input type="submit" id="submit" value="Color text" />
    </form>
</div>
</body>
</html>
<?php
if (isset($_POST['text'])):
    $string = preg_replace('/\s/', '', $_POST['text']);
    $chars = str_split($string);
    foreach ($chars as $char):
        $color = ord($char) % 2 == 0 ? "red" : "blue"; ?>
        <span class="<?= $color ?>"> <?= $char ?> </span>
    <?php endforeach;
endif; ?>