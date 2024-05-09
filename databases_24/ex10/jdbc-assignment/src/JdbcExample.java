
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class JdbcExample {
    public static void main(String[] args) {

        // just check if we can load the JDBC driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new Error("Cannot find JDBC Driver", e);
        }

        // establish connection and fetch and print some data
        try (Connection conn =
                     DriverManager.getConnection(
                             "jdbc:sqlite:../../../data/university.db")) {
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from instructor");
                while (rs.next()) {
                    String name = rs.getString("name");
                    System.out.println(name);
                }
            } catch (SQLException e) {
                throw new Error("Problem executing query", e);
            }

        } catch (SQLException e) {
            throw new Error("Cannot establish database connection", e);
        }
    }
}
