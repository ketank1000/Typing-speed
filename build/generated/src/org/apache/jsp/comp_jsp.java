package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('s');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"style.css\" />\r\n");
      out.write("        <title>comp</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div id=\"container1\">\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("div.ex\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#FFF;\r\n");
      out.write("\tmargin-left:120px;\r\n");
      out.write("        width:560px;\r\n");
      out.write("\tborder:5px solid #800000;\r\n");
      out.write("        height:300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button{\r\n");
      out.write("\tmargin-left:500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form  method=\"get\" action=\"NewServlet\">\r\n");
      out.write("<div class=\"ex\" id=\"txt\">\r\n");
      out.write("<p1 id=\"txt1\">WELCOME</p1>\r\n");
      out.write("<p2 id=\"txt2\">TO</p2>\r\n");
      out.write("<p3 id=\"txt3\">TYPE-X</p3>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Char: <input type=\"text\" id=\"char\" size=\"15\" onkeypress=\"ck()\" />\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("NO Wrong :<input type=\"text\" id=\"w_word\" size=\"15\" />\r\n");
      out.write("<br>\r\n");
      out.write("NO Right :<input type=\"text\" id=\"r_word\" size=\"15\" name=\"r_words\" />\r\n");
      out.write("<br>\r\n");
      out.write("key Hits :<input type=\"text\" id=\"key_hits\" size=\"15\" />\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("         \r\n");
      out.write("            <input type=\"Submit\" value=\"SUBMIT\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ck()\r\n");
      out.write("{\r\n");
      out.write("if ( typeof ck.counter == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        strt();\r\n");
      out.write("        ck.flag=0;\r\n");
      out.write("        ck.counter = 0;\r\n");
      out.write("    }\r\n");
      out.write("if ( typeof ck.counter1 == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        ck.counter1 = 0;\r\n");
      out.write("    }\r\n");
      out.write("if ( typeof ck.rcnt == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        ck.rcnt = 0;\r\n");
      out.write("    }\r\n");
      out.write("if ( typeof ck.wcnt == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        ck.wcnt = 0;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("if ( typeof ck.kcnt == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        ck.kcnt = 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("if ( typeof ck.flg == 'undefined' ) {\r\n");
      out.write("\r\n");
      out.write("        ck.flg = 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("ck.kcnt++;\r\n");
      out.write("\r\n");
      out.write("var let;\r\n");
      out.write("var str=\"The picture above is 250px wide The total width of this element is also 250px.\";\r\n");
      out.write("var n=str.split(\" \");\r\n");
      out.write("let=n[ck.counter];\r\n");
      out.write("var i=0\r\n");
      out.write("document.getElementById(\"key_hits\").value=ck.kcnt;\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"txt2\").textContent=let\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var charfield=document.getElementById(\"char\")\r\n");
      out.write("charfield.onkeydown=function(e){\r\n");
      out.write("var e=window.event\r\n");
      out.write("if(e.keyCode == 32)\r\n");
      out.write("{\r\n");
      out.write("ck.flag=0;\r\n");
      out.write("ck.counter1=0\r\n");
      out.write("ck.counter++\r\n");
      out.write("document.getElementById(\"char\").value=\"\"\r\n");
      out.write("document.getElementById(\"txt1\").textContent=document.getElementById(\"txt1\").textContent+let+\" \"\r\n");
      out.write("document.getElementById(\"txt3\").textContent=\"\"\r\n");
      out.write("for(i=ck.counter+1;i<15;i++)\r\n");
      out.write("{\r\n");
      out.write("      document.getElementById(\"txt3\").textContent=document.getElementById(\"txt3\").textContent+n[i]+\" \"\r\n");
      out.write("}\r\n");
      out.write("document.getElementById(\"txt2\").style.background = color=\"#C0C0C0\";\r\n");
      out.write("if(ck.flg==0)\r\n");
      out.write("    {\r\n");
      out.write("        ck.rcnt++;\r\n");
      out.write("        document.getElementById(\"r_word\").value=ck.rcnt;\r\n");
      out.write("    }\r\n");
      out.write("else\r\n");
      out.write("    {\r\n");
      out.write("        ck.wcnt++;\r\n");
      out.write("        document.getElementById(\"w_word\").value=ck.wcnt;\r\n");
      out.write("    }\r\n");
      out.write("ck.flg=0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(e.keyCode == 8)\r\n");
      out.write("{\r\n");
      out.write("ck.counter1--\r\n");
      out.write("ck.flg--;\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("var a=String.fromCharCode(e.keyCode)\r\n");
      out.write("var b=let.charAt(ck.counter1)\r\n");
      out.write("if(e.keyCode!=32)\r\n");
      out.write("{\r\n");
      out.write("if( a.toLowerCase() == b.toLowerCase())\r\n");
      out.write("{\r\n");
      out.write("if(ck.flg==0)\r\n");
      out.write("    {\r\n");
      out.write("document.getElementById(\"txt2\").style.background = color=\"#C0C0C0\";\r\n");
      out.write("    }\r\n");
      out.write("ck.counter1++\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"txt2\").style.background = color=\"#ff0000\";\r\n");
      out.write("ck.counter1++\r\n");
      out.write("ck.flg++;\r\n");
      out.write("ck.flag=1;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("elseif(ck.counter1<let.length())\r\n");
      out.write("{\r\n");
      out.write("document.getElementById(\"txt2\").style.background = color=\"#ff0000\";\r\n");
      out.write("ck.counter1++\r\n");
      out.write("ck.flg++;\r\n");
      out.write("ck.flag=1;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("function strt()\r\n");
      out.write("{\r\n");
      out.write("document.getElementById(\"txt1\").textContent=\"\"\r\n");
      out.write("document.getElementById(\"txt2\").textContent=\"The\"\r\n");
      out.write("document.getElementById(\"txt3\").textContent=\" picture above is 250px wide The total width of this element is also 250px.\"\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"txt2\").style.background = color=\"#C0C0C0\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
