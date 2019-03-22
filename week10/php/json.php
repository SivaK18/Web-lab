
<html>
<head>
<title>SK</title>
<script>
function getWelcome()
{
var ajaxRequest=new XMLHttpRequest();
ajaxRequest.onreadystatechange=function(){
if(ajaxRequest.readyState==4 && ajaxRequest.status==200)
{
var jsonObj=JSON.parse(ajaxRequest.responseText);
var randomArray=jsonObj.randomMessages;
var randomIndex=Math.floor(Math.random()*randomArray.length);
var messageObj=randomArray[randomIndex];
document.getElementById("welcome").innerHTML=messageObj.message;
document.getElementById("welcome").style.color=messageObj.color;
}
};
ajaxRequest.open("GET",'random.json',true);
ajaxRequest.send();
}
</script>
</head>
<body onload="getWelcome()">
<div id="welcome"></div>
<p>This is the webpage</p>
</body>
</html>
