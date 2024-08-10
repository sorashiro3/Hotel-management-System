package Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoubleroomDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/for_java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mysql01$";

    // Method to add a new double room record to the database
    public void addDoubleRoom(Doubleroom room) {
        String sql = "INSERT INTO doublerooms (name, contact, gender, name2, contact2, gender2) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, room.getName());
            statement.setString(2, room.getContact());
            statement.setString(3, room.getGender());
            statement.setString(4, room.getName2());
            statement.setString(5, room.getContact2());
            statement.setString(6, room.getGender2());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods for updating, deleting, and retrieving double room records...
}
