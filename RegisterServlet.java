import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        String regNumber = req.getParameter("RegNumber");
        String name = req.getParameter("Name");
        User user = new User(username, password, regNumber, name);
        userService. registerUser(user);
        //login successful, redirect to welcome page
        resp.sendRedirect("resources/index.html");
    }
}


