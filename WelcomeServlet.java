import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user object from the session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        // Check if the user is logged in
        if (user == null) {
            response.sendRedirect("login");
            return;
        }

        // Display the welcome page
        request.getRequestDispatcher("welcome.html").forward(request, response);
    }
}
