import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateMovie {
	public void update() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String pwd = "Shakeen@20";
		String query = "update newarrivals set year = 2018 where newId = 102";
		Connection con = DriverManager.getConnection(url, username, pwd);
		PreparedStatement pst =con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
		System.out.println("data updated....");
	}
	
	public static void main(String[] args) throws Exception {
		updateMovie um = new updateMovie();
		um.update();
	}
}
