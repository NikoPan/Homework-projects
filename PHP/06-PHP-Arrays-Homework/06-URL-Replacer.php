<form method="get">
    <textarea name="text" type="text"/></textarea>
    <br />
    <input type="submit" value="Submit" />

    <?php
    if (isset($_GET['text'])):
        $text = $_GET['text'];

        $patterns = array();
        $patterns[0] = '/<a href=\"/';
        $patterns[1] = '/\">/';
        $patterns[2] = '/<\/a>/';

        $replacers = array();
        $replacers[1] = '[URL=';
        $replacers[2] = ']';
        $replacers[3] = '[/url]';

        $output = preg_replace($patterns, $replacers, $text);

        ?>
        <br />
        <br />
        <?= htmlentities($output) ?>

    <?php
    endif;
    ?>

</form>