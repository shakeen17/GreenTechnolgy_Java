import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deleteMovie {
	public void delete() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String pwd = "Shakeen@20";
		String query = "delete from newarrivals  where newId = 105";
		Connection con = DriverManager.getConnection(url, username, pwd);
		PreparedStatement pst =con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
		System.out.println("data deleted....");
	}
	public static void main(String[] args) throws Exception {
		deleteMovie dm = new deleteMovie();
		dm.delete();
	}
}
