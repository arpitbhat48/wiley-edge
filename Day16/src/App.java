import java.sql.*;


public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = SQLConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("show tables");
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
	}

}
