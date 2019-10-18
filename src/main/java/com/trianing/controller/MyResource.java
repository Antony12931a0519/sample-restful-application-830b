package com.trianing.controller;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	@Path("/1")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() throws ClassNotFoundException, SQLException {

		return "Got it!";
	}

	/*
	 * public void readDataFromDb() throws SQLException, ClassNotFoundException{
	 * 
	 * Class.forName("org.h2.Driver");
	 * 
	 * //STEP 2: Open a connection
	 * System.out.println("Connecting to database..."); Connection conn =
	 * DriverManager.
	 * getConnection("jdbc:h2:tcp://localhost:9090/server~/customdb"
	 * ,"root","root");
	 * 
	 * //STEP 3: Execute a query
	 * System.out.println("Creating table in given database..."); Statement stmt
	 * = conn.createStatement(); String sql = "select * from student"; ResultSet
	 * rs = stmt.executeQuery(sql); if(rs.next()){
	 * System.out.println(rs.getInt(1)); }
	 */

	@Path("/show/welcome/message")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWelcomeMessage() {

		return "Hello ! Welocme to App";
	}

}
