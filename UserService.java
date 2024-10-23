
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void registerUser( User user) {
        // hash and store password securely using bcrypt
        String hashedPassword = hashPassword(user.getPassword());
        user.setPassword(hashedPassword);
        users.put(user.getUsername(), user);
    }
    public boolean loginUser(String username, String password) {
        User user = users.get(username);
        if (user != null) {
            //verify password using bcrypt
            return verifyPassword(password, user.getPassword());
        }
        return false;
    }
    private String hashPassword(String password) {
        //implement password hashing using bcrypt
    }
    private boolean verifyPassword(String input, String stored) {
        //implement password verification using bcrypt
    }
}
