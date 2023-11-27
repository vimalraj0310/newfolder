package sqlOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDataInDB {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp", "postgres",
						"0310");
				PreparedStatement ps1 = con.prepareStatement("insert into emp_info values(2,'Qwerty')");
				ps1.executeUpdate();
				System.out.println("success");
				PreparedStatement ps = con.prepareStatement("select * from emp_info");
				ResultSet rst = ps.executeQuery();
				System.out.println("id\t\tname");
				while (rst.next()) {

					System.out.print(rst.getInt(1));
					System.out.print("\t\t" + rst.getString(2));

					System.out.println();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
