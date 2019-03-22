<?php
$frameworks = array("siva","ben","someone","other");
$name=$_GET["name"];
if(strlen($name)>0)
{
$match="";
for ($i= 0; $i < count($frameworks) ; $i++) {
  // c de...
  if (strtolower($name) === strtolower(substr($frameworks[$i],0,strlen($name)))) {
    $match=$match . "\n" . $frameworks[$i];
  }
    else {

    }
}
echo $match;
}
 ?>
