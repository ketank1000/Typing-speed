<%-- 
    Document   : optionpg
    Created on : Mar 27, 2013, 6:32:59 PM
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
      

        <p><a href="easyt.jsp"><img src="images\easysmall.jpg" id="easysmall" name="imggg" width="200" height="100" onMouseOver="mklargee()" onmouseout="mksmalle()" ></a></p>
        <p><a href="hardt.jsp"><img src="images\hardsmall.jpg" id="hardsmall" name="imggg" width="200" height="100" onMouseOver="mklargeh()" onmouseout="mksmallh()" ></a></p>
        

</div>
         <script>
function mklargee()
{
     document.getElementById("easysmall").src='images/easybig.jpg';
}

function mksmalle()
{
     document.getElementById("easysmall").src='images/easysmall.jpg';
}

function mklargeh()
{
     document.getElementById("hardsmall").src='images/hardbig.jpg';
}

function mksmallh()
{
     document.getElementById("hardsmall").src='images/hardsmall.jpg';
}

         </script>
    </body>
</html>




