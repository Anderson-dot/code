<?php
    $pi = 3.14159;
    $raio = readline();

    $area = ($raio * $raio) * $pi;
    echo "A=" . number_format($area, 4, '.', '') . "\n";
?>
