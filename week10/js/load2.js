function loadDoc3(url)
      {
        var xhttp= new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
          if (this.readyState===4 && this.status===200) {
                document.getElementById("txt").innerHTML="hello";
          }
        };
        //document.getElementById("txt").innerHTML="hello";
        xhttp.open("GET",url,true);
        xhttp.send();
      }
