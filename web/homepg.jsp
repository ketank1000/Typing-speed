<%-- 
    Document   : homepg
    Created on : Mar 27, 2013, 6:48:41 PM
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
        <title>JSP Page</title>
    </head>
    <body>
       <div id="container">
    	<div id="header"></div>


        <p>
        <p></p>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>


        <p>
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        <a href="homepg.jsp"><img src="images\homesmall.jpg" id="homesmall" name="imggg" width="100" height="50" onMouseOver="mklargeh()" onmouseout="mksmallh()"></a>
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                    <a href="aboutpg.jsp"><img src="images\aboutsmall.jpg" id="aboutsmall" name="imggg" width="100" height="50" onMouseOver="mklargea()" onmouseout="mksmalla()"></a>
                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                    <a href="contactpg.jsp"><img src="images\contactsmall.jpg" id="contactsmall" name="imggg" width="100" height="50" onMouseOver="mklargec()" onmouseout="mksmallc()"></a></p>
                
                      <p><a href="optionpg.jsp"><img src="images\startsmall.jpg" id="startsmall" name="imggg" width="150" height="70" onMouseOver="mklarges()" onmouseout="mksmalls()" ></a></p>
                       &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

<p><img src="images\hssmall.jpg" id="hs" name="imggg" width="150" height="70" onMouseOver="mklargehs()" onmouseout="mksmallhs()" ></p>

<p>
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                        
                        <a href="NewServlet1"><img src="images\easysmall.jpg" id="easysmall1" name="imggg" width="100" height="50" onMouseOver="mklargee()" onmouseout="mksmalle()"></a>
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
                        
                        <a href="NewServlet1"><img src="images\hardsmall.jpg" id="hardsmall1" name="imggg" width="100" height="50" onMouseOver="mklargeha()" onmouseout="mksmallha()"></a></p>


</div>
        
        <script>
            $(document).ready(function(){
  $("#hs").click(function(){
    $("#easysmall1").slideDown("slow");
    $("#hardsmall1").slideDown("slow");
  });
});
function mklargeh()
{
     document.getElementById("homesmall").src='images/homebig.jpg';
}

function mksmallh()
{
     document.getElementById("homesmall").src='images/homesmall.jpg';
}

function mklargea()
{
     document.getElementById("aboutsmall").src='images/aboutbig.jpg';
}

function mksmalla()
{
     document.getElementById("aboutsmall").src='images/aboutsmall.jpg';
}
function mklargec()
{
     document.getElementById("contactsmall").src='images/contactbig.jpg';
}

function mksmallc()
{
     document.getElementById("contactsmall").src='images/contactsmall.jpg';
}
function mklarges()
{
     document.getElementById("startsmall").src='images/startbig.jpg';
}

function mksmalls()
{
     document.getElementById("startsmall").src='images/startsmall.jpg';
}

function mklargehs()
{
     document.getElementById("hs").src='images/hsbig.jpg';
}

function mksmallhs()
{
     document.getElementById("hs").src='images/hssmall.jpg';
}

function mklargee()
{
     document.getElementById("easysmall1").src='images/easybig.jpg';
}

function mksmalle()
{
     document.getElementById("easysmall1").src='images/easysmall.jpg';
}

function mklargeha()
{
     document.getElementById("hardsmall1").src='images/hardbig.jpg';
}

function mksmallha()
{
     document.getElementById("hardsmall1").src='images/hardsmall.jpg';
}

</script>
    </body>
</html>
