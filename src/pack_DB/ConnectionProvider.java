package pack_DB;

import java.sql.*;

public class ConnectionProvider {

	public static Connection getConncetion() {
		
		Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/movie";
            con = DriverManager.getConnection(path,"root","1234");
            System.out.println("Connection successfull");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
	}	 
}
/*
 CREATE TABLE `MovieDetails` (
	`name` VARCHAR(100) NOT NULL,
	`lead_actor` VARCHAR(50) NULL DEFAULT NULL,
	`lead_actress` VARCHAR(50) NULL,
	`year` YEAR NULL,
	`dirname` VARCHAR(50) NULL DEFAULT NULL
)
*/
