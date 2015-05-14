<form method="get">
    <label for="categories">Categories:</label>
    <input type="text" name="categories" id="categories" />
    <br />
    <label for="tags">Tags:</label>
    <input type="text" name="tags" id="tags" />
    <br />
    <label for="months">Months:</label>
    <input type="text" name="months" id="months" />
    <br />
    <input type="submit" value="Generate" />
</form>

<?php
function generateSidebar($cat, $items) {
    $output = "<aside><header><h3>$cat</h3></header><body><ul>";
    foreach ($items as $item) {
        $output .= "<li><a href='#'>$item</a></li>";
    }
    $output .= "</ul></body></aside>";

    return $output;
}
if (isset($_GET['categories'])):
    $categories = preg_split("/, /", $_GET['categories']);
    $tags = preg_split("/, /", $_GET['tags']);
    $months = preg_split("/, /", $_GET['months']);

    $cat = "Categories";
    $tag = "Tags";
    $month = "Months";

    ?>

    <?= generateSidebar($cat, $categories) ?>
    <br />
    <?= generateSidebar($tag, $tags) ?>
    <br />
    <?= generateSidebar($month, $months) ?>

<?php endif ?>