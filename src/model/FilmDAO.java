package model;

import java.util.*;
import java.sql.*;

public class FilmDAO {
	
	Film oneFilm = null;
	Connection conn = null;
	Statement stmt = null;
	
	public FilmDAO() {}
	
	private void openConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		} catch (Exception e) { System.out.println(e); }
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://filmdatabase.cgcfajsaodzq.eu-west-2.rds.amazonaws.com:3306/jhealy?user=jhealy&password=filmdata");
			stmt = conn.createStatement();
			
		} catch(SQLException se) { System.out.println(se); }
	}
	
	private void closeConnection() {
		
		try {
			
			conn.close();
			
		}catch(SQLException se) { System.out.println(se); }
		
	}
	
	private Film getNextFilm(ResultSet rs) {
		
		Film thisFilm = null;
		
		try {
			thisFilm = new Film(
					rs.getInt("film_id"),
					rs.getString("film_name"),
					rs.getInt("film_year"),
					rs.getString("film_director"),
					rs.getBigDecimal("film_boxoffice"),
					rs.getString("film_duration"),
					rs.getInt("film_review"));
		}catch(SQLException se) { System.out.println(se); }
		
		return thisFilm;
		
	}
	
	public ArrayList<Film> getAllFilms(){
		
		ArrayList<Film> allFilms = new ArrayList<Film>();
		openConnection();
		
		try {
			String selectSQL = "SELECT * FROM films;";
			ResultSet rs1 = stmt.executeQuery(selectSQL);
			
			while(rs1.next()) {
				oneFilm = getNextFilm(rs1);
				allFilms.add(oneFilm);
			}
			
			stmt.close();
			closeConnection();
	
		}catch(SQLException se) { System.out.println(se); }
		
		return allFilms;
		
	}

}
