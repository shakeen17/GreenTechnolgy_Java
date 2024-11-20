import java.sql.*;
public class insetMovie {

	public static  void insert() throws Exception {
		//string url, username, password
		String url ="jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String pwd = "Shakeen@20";
		String query = "insert into newarrivals values(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, pwd);
		PreparedStatement pst =con.prepareStatement(query);
		pst.setInt(1, 106);
		pst.setString(2, "Harry Potter");
		pst.setInt(3, 2000);
		pst.setString(4, "WB");
		pst.executeUpdate();
		con.close();
		System.out.println("data inserted....");
		
	}
	
	public static void main(String[] args) throws Exception {
		//InsertMovie im = new InsertMovie();
		insert();
	}
}

//db name,pass,url,query to connect the db
//to establish the connection the driver manager is used
//ternary operator used to set the values for dummy
//preparedstatement, the query given by us in the java
//after connecting i need to set the values using pst.

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.Scanner;
//
//public class insetMovie {
//    public static void insert(int id, String name, int price, String date) throws Exception {
//        String url = "jdbc:mysql://127.0.0.1:3306/movie";
//        String username = "root";
//        String password = "Shakeen@20";
//        String query = "INSERT INTO movie (id, name, m_price, m_date) VALUES (?, ?, ?, ?)";
//        
//        Connection con = DriverManager.getConnection(url, username, password);
//        PreparedStatement pst = con.prepareStatement(query);
//        
//        pst.setInt(1, id);
//        pst.setString(2, name);
//        pst.setInt(3, price);
//        pst.setDate(4, java.sql.Date.valueOf(date));  // Corrected to set date
//        
//        pst.executeUpdate();
//        con.close();
//        
//        System.out.println("Data inserted");
//    }
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Enter m_id:");
//        int id = sc.nextInt();
//        sc.nextLine(); // Consume the newline left-over
//
//        System.out.println("Enter m_name:");
//        String name = sc.nextLine();
//
//        System.out.println("Enter m_price:");
//        int price = sc.nextInt();
//        sc.nextLine(); // Consume the newline left-over
//
//        System.out.println("Enter m_date (YYYY-MM-DD):");
//        String date = sc.nextLine();
//
//        insert(id, name, price, date);
//        sc.close();
//    }
//}

