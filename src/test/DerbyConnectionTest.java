import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/tpchdb";
        String user = "app";
        String pass = "app";
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT P_PARTKEY, P_NAME FROM PART FETCH FIRST 5 ROWS ONLY");
            while (rs.next()) {
                System.out.println(rs.getInt("P_PARTKEY") + " | " + rs.getString("P_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

