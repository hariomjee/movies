package pack_work;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pack_DB.ConnectionProvider;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		Connection con = ConnectionProvider.getConncetion();
		
		System.out.println("Press 1 to print the movie details here: ");
		System.out.println("Press 2 to Exit.");
		int ch = sc.nextInt();
		
		String showAll = "",moviename = "",leadActor = "",leadActress = "",dirName = "";
		int year = 0;
		if(ch == 1) {
			showAll = "select * from moviedetails";
			System.out.println("MovieName\t\tLead Actor\t\tLead Actress\t\tYear\t\tDirector Name");
			System.out.println();
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(showAll);
				while(rs.next()) {
					moviename = rs.getString("name");
					leadActor = rs.getString("lead_actor");
					leadActress = rs.getString("lead_actress");
					year = rs.getInt("year");
					dirName = rs.getString("dirname");
					
					
					System.out.print(moviename+"\t\t");
					System.out.print(leadActor+"\t\t");
					System.out.print(leadActress+"\t\t");
					System.out.print(year+"\t\t");
					System.out.print(dirName+"\t\t");
					System.out.println();
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ch == 2) {
			System.out.println("Thank you.");
			return;
		}
		else {
			System.out.println("Wrong Input");
			return;
		}	
		
	}

}
