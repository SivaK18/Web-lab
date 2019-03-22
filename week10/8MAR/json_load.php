<!DOCTYPE html>
<html>
<body>

<h2>Getting JSON data from PHP server.</h2>

<p id="demo"></p>

<script>
var xmlhttp = new XMLHttpRequest();

xmlhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    myObj = JSON.parse(this.responseText);
    document.getElementById("demo").innerHTML = myObj.name;
  }
};
xmlhttp.open("GET", "json.php", true);
xmlhttp.send();
</script>

</body>
</html>