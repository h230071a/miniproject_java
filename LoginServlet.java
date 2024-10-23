import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        if (userService.loginUser(username, password)) {
            //login successful, redirect to welcome page
            resp.sendRedirect("resources/welcome.html");
        } else {
            //login failed, display error message
            req.setAttribute("Error !", "Invalid Username or Password");
            req.getRequestDispatcher("resources/index.html").forward(req, resp);
        }
    }
}
