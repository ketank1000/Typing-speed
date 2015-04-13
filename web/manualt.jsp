<%-- 
    Document   : manualt
    Created on : Mar 27, 2013, 6:43:25 PM
    Author     : ketan_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" type="text/css" media="screen" href="style.css" />
        <title>comp</title>
    </head>
    <body onload="sp(),handleFileSelect()">
       <div id="container1">
<p>
<p>



<style>
div.ex
{
	background-color:#FFF;
	margin-left:120px;
	font-size:24px;
        width:560px;
	border:5px solid #800000;
        height:300px;
}

button{
	margin-left:500px;
}
</style>

<form  method="get" action="NewServlet">
<div class="ex" id="txt">
<p1 id="txt1">WELCOME</p1>
<p2 id="txt2">TO</p2>
<p3 id="txt3">TYPE-X</p3>
</div>
<br>

<br>

&nbsp 
<input type="text" id="car" size="15" onkeypress="ck()" />
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

<!--input type="file" id="files" name="files[]" multiple />
<output id="list"></output-->
<p>
<p>
 &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
  &nbsp &nbsp &nbsp &nbsp &nbsp 
Wrong &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
Right &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
Key hits &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
Timer
<br>
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
&nbsp &nbsp &nbsp &nbsp &nbsp
<input type="text" id="w_word" size="15" />
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
<input type="text" id="r_word" size="15" name="r_words" />
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
<input type="text" id="key_hits" size="15" />
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

<input type="text" id="Timer" size="15" />
<br>
<br>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

    <input type="Submit" value="SUBMIT"/>
</form>

<script type="text/javascript">
function ck()
{
if ( typeof ck.counter == 'undefined' ) {

        
        ck.flag=0;
        countdown();
        ck.counter = 0;
    }
if ( typeof ck.counter1 == 'undefined' ) {

        ck.counter1 = 0;
    }
if ( typeof ck.rcnt == 'undefined' ) {

        ck.rcnt = 0;
    }
if ( typeof ck.wcnt == 'undefined' ) {

        ck.wcnt = 0;

    }
if ( typeof ck.kcnt == 'undefined' ) {

        ck.kcnt = 0;
    }

if ( typeof ck.flg == 'undefined' ) {

        ck.flg = 0;
    }

ck.kcnt++;

var let;
var str=document.getElementById("txt3").textContent
var n=str.split(" ");
let=n[0];
var i=0;
document.getElementById("key_hits").value=n[0];

document.getElementById("txt2").textContent=let


var charfield=document.getElementById("car")
charfield.onkeydown=function(e){
var e=window.event
if(e.keyCode == 32)
{
    flag=0
ck.counter1=0
ck.counter++
document.getElementById("car").value=""
document.getElementById("txt1").textContent=document.getElementById("txt1").textContent+let+" "
document.getElementById("txt3").textContent=""
for(i=ck.counter+1;i<15;i++)
{
      document.getElementById("txt3").textContent=document.getElementById("txt3").textContent+n[i]+" "
}
document.getElementById("txt2").style.background = color="#C0C0C0";
if(ck.flg==0)
    {
        ck.rcnt++;
        document.getElementById("r_word").value=ck.rcnt;
    }
else
    {
        ck.wcnt++;
        document.getElementById("w_word").value=ck.wcnt;
    }
ck.flg=0;
}

if(e.keyCode == 8)
{
ck.counter1--
ck.flg--;
}
else
{
var a=String.fromCharCode(e.keyCode)
var b=let.charAt(ck.counter1)
if(e.keyCode!=32)
{
if( a.toLowerCase() == b.toLowerCase())
{
if(ck.flag==0)
    {
document.getElementById("txt2").style.background = color="#C0C0C0";
    }
ck.counter1++
}
else
{
ck.flag=1;
document.getElementById("txt2").style.background = color="#ff0000";
ck.counter1++
ck.flg++;
}
}
elseif(ck.counter1<let.length())
{
ck.flag=1;
document.getElementById("txt2").style.background = color="#ff0000";
ck.counter1++
ck.flg++;
}
}
}
}
function strt()
{
    str1=document.getElementById("txt1").textContent
    var n=str1.split(" ");
document.getElementById("txt1").textContent=""
document.getElementById("txt2").textContent="asdasd";
document.getElementById("txt3").textContent=""

document.getElementById("txt2").style.background = color="#C0C0C0";
}

var CCOUNT = 60;

    var t, count;




     function cddisplay() {
        // displays time in span
        //document.getElementById('timespan').innerHTML = count;
        document.getElementById("Timer").value = cddisplay.count;
    };

    function countdown() {
        // starts countdown


    var t, count=60;


    if ( typeof countdown.count == 'undefined' ) {

        countdown.count = 60;
    }


      if(countdown.count!=70)
          {
        if (countdown.count == 0) {
            alert("TIME OUT");
            document.getElementById("Timer").value = "0";
        } else {
            countdown.count--;
            t = setTimeout("countdown()", 1000);
            document.getElementById("Timer").value = countdown.count;
        }
          }
    };


function sp()
{
    alert("Press SPACE to Start");
}


function handleFileSelect() {


    var file = fopen(getScriptPath("Desktop/a.txt"), 0);
    var file_length = flength(file);
    var content = fread(file, file_length);
    document.getElementById("r_words").value = content;
    
//    var files = evt.target.files; // FileList object
//
//    // Loop through the FileList
//    for (var i = 0, f; f = files[i]; i++) {
//
//      var reader = new FileReader();
//
//      // Closure to capture the file information.
//      reader.onload = (function(theFile) {
//        return function(e) {
//          // Print the contents of the file
//          var span = document.createElement('span');
//          span.innerHTML = ['<p>',e.target.result,'</p>'].join('');
//          document.getElementById('list').insertBefore(span, null);
//        };
//      })(f);
//
//      // Read in the file
//      reader.readAsText(f);
//      // reader.readAsDataURL(f);
//    }
//    //document.getElementById("txt1").textContent
//    strt();
  }

//  document.getElementById('files').addEventListener('change', handleFileSelect, false);
</script>


  </div>

    </body>
</html>
