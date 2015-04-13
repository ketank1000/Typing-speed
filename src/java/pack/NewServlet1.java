/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ketan_000
 */
public class NewServlet1 extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {


                response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

            try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           }
        catch(ClassNotFoundException ce)
        {
    	System.out.println(ce);
    	}
    	try
        {
  	String url = "jdbc:odbc:project";
        int i;
      	Connection con = null;
            try {
                con = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(NewServlet1.class.getName()).log(Level.SEVERE, null, ex);
            }
      	    java.sql.Statement s =  con.createStatement();
//        String roll11 = request.getParameter("roll1");
//        String name11  =request.getParameter("name1");

      	ResultSet rs = s.executeQuery("select username,words_per_min,accuracy,right_words,wrong_words,key_hits from Table1");
 out.println("<html>");
 out.println("<body background=\"body.jpg\"/>");
 out.println("<head>");
 out.println("<link rel='stylesheet' type='text/css' href='css/style.css' />");
  out.println("<title></title> ");
   out.println("</head>");



        out.println("<div class=\"container\"> <center>");
        out.println("<h1><font color='Brown'>Easy Level High Scores</font></h1>");
        out.println("<table border =2>");
        out.println("<colgroup span=7 width= 150>");
        out.println(" <th> ");
        out.println("USER NAME");
        out.println(" </th> ");
        out.println(" <th> ");
        out.println("WORDS PER MIN");
        out.println(" </th> ");
out.println(" <th> ");
        out.println("ACCURACY");
        out.println(" </th> ");
        out.println(" <th> ");
        out.println("RIGHT WORDS");
        out.println(" </th> ");
        out.println(" <th> ");
        out.println("WRONG WORDS");
        out.println(" </th> ");
out.println(" <th> ");
        out.println("KEY BOARD HITS");
       

        while(rs.next())
        {
                     out.println(" <tr> ");
                     out.println(" <td align= center > ");
                     out.println( "\t"+rs.getString(1));
                     out.println("</td>");
                     out.println("<td align = center >");
        	     out.println("\t"+rs.getString(2));
                     out.println("</td>");
                     out.println("<td align = center >");
        	     out.println("\t"+rs.getString(3));
                     out.println("</td>");
                     out.println(" <td align= center > ");
                     out.println( "\t"+rs.getString(4));
                     out.println("</td>");
                     out.println("<td align = center >");
        	     out.println("\t"+rs.getString(5));
                     out.println("</td>");
                     out.println("<td align = center >");
        	     out.println("\t"+rs.getString(6));
                     out.println("</td>");
                    
              out.println("</tr>");
        }
        out.println("</table>");
        out.println("</div></body>");
        out.println("</html>");
    	}
        catch(SQLException ce)
        {
    	    out.println(ce);

        }

       // processRequest(request, response);
    } 

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
