package Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FoodDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/for_java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mysql01$";

    // Method to add a new food item record to the database
    public void addFoodItem(Food food) {
        String sql = "INSERT INTO food_items (item_no, quantity, price) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, food.getItem_no());
            statement.setInt(2, food.getQuantity());
            statement.setFloat(3, food.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods for updating, deleting, and retrieving food item records...
}

