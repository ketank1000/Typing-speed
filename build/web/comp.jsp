s<%-- 
    Document   : comp
    Created on : Mar 18, 2013, 6:13:29 PM
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
    <body>
       <div id="container1">
<p>
<p>



<style>
div.ex
{
	background-color:#FFF;
	margin-left:120px;
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
<br>
Char: <input type="text" id="char" size="15" onkeypress="ck()" />

<br>
NO Wrong :<input type="text" id="w_word" size="15" />
<br>
NO Right :<input type="text" id="r_word" size="15" name="r_words" />
<br>
key Hits :<input type="text" id="key_hits" size="15" />

         

 
         
            <input type="Submit" value="SUBMIT"/>
        </form>


<script type="text/javascript">
function ck()
{
if ( typeof ck.counter == 'undefined' ) {

        strt();
        ck.flag=0;
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
var str="The picture above is 250px wide The total width of this element is also 250px.";
var n=str.split(" ");
let=n[ck.counter];
var i=0
document.getElementById("key_hits").value=ck.kcnt;

document.getElementById("txt2").textContent=let


var charfield=document.getElementById("char")
charfield.onkeydown=function(e){
var e=window.event
if(e.keyCode == 32)
{
ck.flag=0;
ck.counter1=0
ck.counter++
document.getElementById("char").value=""
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
if(ck.flg==0)
    {
document.getElementById("txt2").style.background = color="#C0C0C0";
    }
ck.counter1++
}
else
{

document.getElementById("txt2").style.background = color="#ff0000";
ck.counter1++
ck.flg++;
ck.flag=1;
}
}
elseif(ck.counter1<let.length())
{
document.getElementById("txt2").style.background = color="#ff0000";
ck.counter1++
ck.flg++;
ck.flag=1;
}
}
}
}
function strt()
{
document.getElementById("txt1").textContent=""
document.getElementById("txt2").textContent="The"
document.getElementById("txt3").textContent=" picture above is 250px wide The total width of this element is also 250px."

document.getElementById("txt2").style.background = color="#C0C0C0";
}

</script>

  </div>
 
    </body>
</html>
