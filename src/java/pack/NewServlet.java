/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ketan_000
 */
public class NewServlet extends HttpServlet {
   
   
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {


       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    	} catch(ClassNotFoundException ce) {
    	System.out.println(ce);
    	}
        String n1=request.getParameter("urname");
        String n2=request.getParameter("wpr");
        String n3=request.getParameter("acc");
        String n4=request.getParameter("rwd");
        String n5=request.getParameter("wwd");
        String n6=request.getParameter("kh");
      //  String n7=request.getParameter("ctoc");
//        String n8=request.getParameter("cnoc");

      // out.println("name      " +  n1+ "   rollno    " +n2+ "   marks       " +n6);
       // out.println();

    	try  {
                  ResultSet rs1;
                 String url = "jdbc:odbc:project";
        	 Connection con = DriverManager.getConnection(url);
            try {
                con = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
                 String str="INSERT INTO Table1 (username,words_per_min,accuracy,right_words,wrong_words,key_hits)" + "Values(?,?,?,?,?,?)";
                 PreparedStatement s = con.prepareStatement(str);

		       s.setString(1,n1);
                       s.setString(2,n2);
                      s.setString(3,n3);
                      s.setString(4,n4);
                      s.setString(5,n5);
                      s.setString(6,n6);
             s.executeUpdate();
               con.commit();
                
            ServletContext context= getServletContext();
            RequestDispatcher rd= request.getRequestDispatcher("/homepg.jsp");

            rd.include(request, response);
             s.close();
           
            //processRequest(request, response);
                      // out.println("<h1>INSERT Sucessful</h1>");
//                        s.executeUpdate();
//                       s.close();
//                 con.commit();
                    	}
        catch(SQLException ce)
        {
    	    System.out.println(ce);
    	}
        finally {
            out.close();
        }




//ServletContext context= getServletContext();
////RequestDispatcher rd= request.getRequestDispatcher("/result.jsp");

//out.println("<font color=red>The final result is as follows </font>");
//
//out.println("Wrong words are "+wrong);
//
//                out.println("The right words are "+right_words);
//
//                  out.println("Accuracy is  "+accuracy);

     
//rd.include(request, response);


        //processRequest(request, response);
    } 

   

}
