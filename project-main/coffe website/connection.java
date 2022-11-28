package project;
import java.sql.*;

public class connection {
	public static Connection getCon(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:/localhost:3306/watch","root","Mfpicik18!");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from watch");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			return con;
		}
	catch(Exception e)
		{
		System.out.println(e);
		return null;
		}
	}

}
