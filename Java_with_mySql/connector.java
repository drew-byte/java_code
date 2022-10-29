import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// Jar file
		// XAMPP connecting
		// local host
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","");
		
		System.out.println("Database is Connected");

	}

}
