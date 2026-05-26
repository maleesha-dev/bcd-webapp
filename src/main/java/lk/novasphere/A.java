package lk.novasphere;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.novasphere.ejb.remote.UserDetails;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/a")
public class A extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            InitialContext ic = new InitialContext();
            UserDetails userDetails = (UserDetails) ic.lookup("java:global/ejb-module/UserDetailsImpl");

            resp.getWriter().println(userDetails.getUsername() +" : "+ userDetails.getEmail());

        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
