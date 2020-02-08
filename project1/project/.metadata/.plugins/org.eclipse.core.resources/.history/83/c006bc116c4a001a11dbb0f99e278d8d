package com.capgemini.airlinereservationsystem.dao;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.Statement;


public class TicketConnection {
	public static void main(String[] args) {

		Statement stmt= null;
		Connection conn=null;
		ResultSet res=null;


		try{
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);


			String dburl="jdbc:mysql://localhost:3306/airline_reservation_system?user=root&password=root";


			String query="select * from ticket_details";

			stmt = conn.createStatement();
			res=stmt.executeQuery(query);
			while(res.next()){
				int ticketid = res.getInt("ticketid");
				String flighttype = res.getString("flighttype");
				String tickettype = res.getString("tickettype");
				int age = res.getInt("age");
				String from=res.getString("from");
				String to = res.getString("to");
				Date departuredate=res.getDate("departuredate");
				Date returndate=res.getDate("returndate");

				System.out.println("ticketid");
				System.out.println("flighttype");
				System.out.println("tickettype");
				System.out.println("age");
				System.out.println("from");
				System.out.println("to");
				System.out.println("departuredate");
				System.out.println("returndate");



			}


		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(res!=null){
					res.close();
				}



			}catch(Exception e1){
				e1.printStackTrace();
			}
		}

	}	
}	


