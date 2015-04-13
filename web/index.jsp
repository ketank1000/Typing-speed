<%-- 
    Document   : index
    Created on : Mar 18, 2013, 6:07:21 PM
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
                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
                    <video id="video" width="420" height="320" controls autoplay >

                       <source src="video\typevideo.mp4" type="video/mp4">

                    </video>
     
</div>

        <script>
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

</script>
    </body>
</html>
