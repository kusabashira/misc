<?php
fscanf(STDIN, "%d %d", $a, $b);

$area = $a * $b;
$perimeter = 2*$a + 2*$b;

echo "$area $perimeter\n";
