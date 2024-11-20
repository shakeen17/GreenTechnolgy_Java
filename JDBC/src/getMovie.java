import java.sql.*;

public class getMovie {
	public static void get() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String pwd = "Shakeen@20";
		String query = "select * from newarrivals";
		Connection con = DriverManager.getConnection(url, username, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println("Movie ID:" + rs.getInt(1));
			System.out.println("Movie Name:" + rs.getString(2));
			System.out.println("Movie Year:" + rs.getInt(3));
			System.out.println("Production House:" + rs.getString(4));
			System.out.println(); 
		}
		con.close();
	}
	public static void main(String[] args) throws Exception {
		get();
	}
}
