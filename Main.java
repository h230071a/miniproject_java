public class Main {
    public static void main(String[] args) {
        // Create a new instance of the UserService class
        UserService userService = new UserService();

        // Create a new instance of the SecurityConfig class
        SecurityConfig securityConfig = new SecurityConfig();

        // Create a new instance of the LoginServlet class
        LoginServlet loginServlet = new LoginServlet(UserService, SecurityConfig);

        // Create a new instance of the RegisterServlet class
        RegisterServlet registerServlet = new RegisterServlet(UserService, SecurityConfig);

        // Map the servlets to the corresponding HTML files
        // This is typically done in a web.xml file or using annotations
        // For simplicity, we'll assume you're using annotations
        LoginServlet.mapping("/login", "index.html");
        RegisterServlet.mapping("/register", "registration.html");
        // Add a mapping for the welcome page
        // welcomeServlet.mapping("/welcome", "welcome.html");
    }
}