package controller;

import java.util.ArrayList;

import model.Film;
import model.FilmDAO;

import com.google.gson.Gson;

public class Main {
	
	public static void main(String args[]) {
		
		FilmDAO dao = new FilmDAO();
		
		ArrayList<Film> films = dao.getAllFilms();
		
		for(int i = 0; i<films.size(); i++) {
			
			Film oneFilm = films.get(i);
			
		}
		
		Gson gson = new Gson();
		String allFilmsJson = gson.toJson(films);
		

	}

}
