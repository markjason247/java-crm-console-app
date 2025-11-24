import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:crm.db");
            System.out.println("Database connected successfully!");

            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS leads (name TEXT, email TEXT, status TEXT)");
            stmt.execute("INSERT INTO leads (name, email, status) VALUES ('John Doe', 'john@example.com', 'New')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM leads");
            while (rs.next()) {
                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getString("email") + " | " +
                    rs.getString("status")
                );
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
