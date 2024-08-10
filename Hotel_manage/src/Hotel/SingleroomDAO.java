package Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class SingleroomDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/for_java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mysql01$";

    // Method to insert a new single room record into the database
    public void addSingleRoom(Singleroom room) {
        String sql = "INSERT INTO singlerooms (name, contact, gender) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, room.getName());
            statement.setString(2, room.getContact());
            statement.setString(3, room.getGender());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods for updating, deleting, and retrieving single room records...
}

