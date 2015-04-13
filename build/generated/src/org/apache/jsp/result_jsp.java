package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("       <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"style.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"strt()\">\n");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("    \t<div id=\"header\"></div>\n");
      out.write("        <form  method=\"get\" action=\"NewServlet\">\n");
      out.write("                <p>\n");
      out.write("                <center><title>RESULT</title></center>\n");
      out.write("        <p></p>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <p>\n");
      out.write("        <P>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("     &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("Enter name &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <input type=\"text\" id=\"urname\" size=\"15\" name=\"urname\"/>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("     &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("Words per min &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type=\"text\" id=\"wpr\" size=\"15\" name=\"wpr\" />\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("     &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("Accuracy &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <input type=\"text\" id=\"acc\" size=\"15\" name=\"acc\"/>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp \n");
      out.write("Right words &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type=\"text\" id=\"rwd\" size=\"15\" name=\"rwd\"/>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp \n");
      out.write("Wrong Words &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  <input type=\"text\" id=\"wwd\" size=\"15\" name=\"wwd\"/>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp \n");
      out.write("Key hits &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <input type=\"text\" id=\"kh\" size=\"15\" name=\"kh\"/>\n");
      out.write("<br>\n");
      out.write("<p>\n");
      out.write("    <br>\n");
      out.write("    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("        \n");
      out.write("    <input type=\"Submit\" value=\"SUBMIT\"/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function strt()\n");
      out.write("    {\n");
      out.write("        ");

            String rwords = request.getParameter("r_words");
            String wwords = request.getParameter("w_words");
            String khits = request.getParameter("key_hits");
        
      out.write("\n");
      out.write("        var str1=");
      out.print(rwords);
      out.write(";\n");
      out.write("        var str2=");
      out.print(wwords);
      out.write(";\n");
      out.write("        var str3=");
      out.print(khits);
      out.write(";\n");
      out.write("        \n");
      out.write("        document.getElementById(\"rwd\").value=str1;\n");
      out.write("        document.getElementById(\"wwd\").value=str2;\n");
      out.write("        document.getElementById(\"kh\").value=str3;\n");
      out.write("\n");
      out.write("\n");
      out.write("        var n1=parseInt(str1);\n");
      out.write("        var n2=parseInt(str2);\n");
      out.write("        var n3=n1+n2;\n");
      out.write("\n");
      out.write("        document.getElementById(\"wpr\").value=n3;\n");
      out.write("\n");
      out.write("        var n4=(n1*100);\n");
      out.write("        var n5=n4/n3;\n");
      out.write("\n");
      out.write("        document.getElementById(\"acc\").value=n5+\"%\";\n");
      out.write("\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
