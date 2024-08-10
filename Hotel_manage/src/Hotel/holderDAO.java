package Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class holderDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/for_java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mysql01$";

    // Method to add a holder record to the database
    public void addHolder(holder holder) {
        String sql = "INSERT INTO holders (luxury_double_room_count, deluxe_double_room_count, luxury_single_room_count, deluxe_single_room_count) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, holder.getLuxury_double_room_count());
            statement.setInt(2, holder.getDeluxe_double_room_count());
            statement.setInt(3, holder.getLuxury_single_room_count());
            statement.setInt(4, holder.getDeluxe_single_room_count());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods for updating, deleting, and retrieving holder records...
}

