package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class optionpg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"style.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"container\">\n");
      out.write("    \t<div id=\"header\"></div>\n");
      out.write("          <p>\n");
      out.write("        <p></p>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                        <a href=\"homepg.jsp\"><img src=\"images\\homesmall.jpg\" id=\"homesmall\" name=\"imggg\" width=\"100\" height=\"50\" onMouseOver=\"mklargeh()\" onmouseout=\"mksmallh()\"></a>\n");
      out.write("                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                    <a href=\"aboutpg.jsp\"><img src=\"images\\aboutsmall.jpg\" id=\"aboutsmall\" name=\"imggg\" width=\"100\" height=\"50\" onMouseOver=\"mklargea()\" onmouseout=\"mksmalla()\"></a>\n");
      out.write("                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp\n");
      out.write("                    <a href=\"contactpg.jsp\"><img src=\"images\\contactsmall.jpg\" id=\"contactsmall\" name=\"imggg\" width=\"100\" height=\"50\" onMouseOver=\"mklargec()\" onmouseout=\"mksmallc()\"></a></p>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <p><a href=\"easyt.jsp\"><img src=\"images\\easysmall.jpg\" id=\"easysmall\" name=\"imggg\" width=\"200\" height=\"100\" onMouseOver=\"mklargee()\" onmouseout=\"mksmalle()\" ></a></p>\n");
      out.write("        <p><a href=\"hardt.jsp\"><img src=\"images\\hardsmall.jpg\" id=\"hardsmall\" name=\"imggg\" width=\"200\" height=\"100\" onMouseOver=\"mklargeh()\" onmouseout=\"mksmallh()\" ></a></p>\n");
      out.write("        \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("         <script>\n");
      out.write("function mklargee()\n");
      out.write("{\n");
      out.write("     document.getElementById(\"easysmall\").src='images/easybig.jpg';\n");
      out.write("}\n");
      out.write("\n");
      out.write("function mksmalle()\n");
      out.write("{\n");
      out.write("     document.getElementById(\"easysmall\").src='images/easysmall.jpg';\n");
      out.write("}\n");
      out.write("\n");
      out.write("function mklargeh()\n");
      out.write("{\n");
      out.write("     document.getElementById(\"hardsmall\").src='images/hardbig.jpg';\n");
      out.write("}\n");
      out.write("\n");
      out.write("function mksmallh()\n");
      out.write("{\n");
      out.write("     document.getElementById(\"hardsmall\").src='images/hardsmall.jpg';\n");
      out.write("}\n");
      out.write("\n");
      out.write("         </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
