import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SignUp extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Get username and password from request parameters
      String username = request.getParameter("username");
      String password = request.getParameter("password");

      // Validate username and password
      if(username.equals("admin") && password.equals("password")) {
         // If username and password are valid, redirect to home page
         response.sendRedirect("home.html");
      } else {
         // If username and password are invalid, show error message
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         out.println("<h3>Invalid username or password. Please try again.</h3>");
      }
   }
}
