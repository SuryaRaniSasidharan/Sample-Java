package throwsexception;

import java.sql.SQLException;

public class Main2 {
	
	public static void get() throws SQLException
	{
		throw new SQLException("Excepton found");
	}

	public static void main(String[] args) {
		
try {
	get();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
