package com.capgemini.airlinereservationsystem.dao;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

import com.capgemini.airlinereservationsystem.dto.TicketController;
import com.mysql.jdbc.Driver;
import java.sql.Statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class TicketConnection implements ITicketConnection {
	
	static Logger log = LogManager.getLogger("user");
	 
	public void view( TicketController tc) {

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

				log.info("ticketid");
				log.info("flighttype");
				log.info("tickettype");
				log.info("age");
				log.info("from");
				log.info("to");
				log.info("departuredate");
				log.info("returndate");
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


