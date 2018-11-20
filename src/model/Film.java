package model;

import java.math.BigDecimal;

/**
 * Information for a particular Film
 * @author James
 *
 */
public class Film {
	
	private int film_id;
	private String film_name;
	private int film_year;
	private String film_director; //Swapped from FilmCredits
	private BigDecimal film_boxoffice;
	private String film_duration;
	private int film_review; //e.g. 89 = 89%
	
	
	/**
	 * @return the film_id
	 */
	public int getFilm_id() {
		return film_id;
	}
	/**
	 * @param film_id the film_id to set
	 */
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	
	
	/**
	 * @return the film_name
	 */
	public String getFilm_name() {
		return film_name;
	}
	/**
	 * @param film_name the film_name to set
	 */
	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}
	
	
	/**
	 * @return the film_year
	 */
	public int getFilm_year() {
		return film_year;
	}
	/**
	 * @param film_year the film_year to set
	 */
	public void setFilm_year(int film_year) {
		this.film_year = film_year;
	}
	
	
	/**
	 * @return the film_director
	 */
	public String getFilm_director() {
		return film_director;
	}
	/**
	 * @param film_director the film_director to set
	 */
	public void setFilm_director(String film_director) {
		this.film_director = film_director;
	}
	
	
	/**
	 * @return the film_boxoffice
	 */
	public BigDecimal getFilm_boxoffice() {
		return film_boxoffice;
	}
	/**
	 * @param film_boxoffice the film_boxoffice to set
	 */
	public void setFilm_boxoffice(BigDecimal film_boxoffice) {
		this.film_boxoffice = film_boxoffice;
	}
	
	
	/**
	 * @return the film_duration
	 */
	public String getFilm_duration() {
		return film_duration;
	}
	/**
	 * @param film_duration the film_duration to set
	 */
	public void setFilm_duration(String film_duration) {
		this.film_duration = film_duration;
	}
	
	
	/**
	 * @return the film_review
	 */
	public int getFilm_review() {
		return film_review;
	}
	/**
	 * @param film_review the film_review to set
	 */
	public void setFilm_review(int film_review) {
		this.film_review = film_review;
	}
	
	
	
	public Film(int film_id, String film_name, int film_year, String film_director, BigDecimal film_boxoffice, String film_duration, int film_review) {
		
		super();
		
		this.film_id = film_id;
		this.film_name = film_name;
		this.film_year = film_year;
		this.film_director = film_director;
		this.film_boxoffice = film_boxoffice;
		this.film_duration = film_duration;
		this.film_review = film_review;
		
	}
	
	
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", film_name=" + film_name + ", film_year="
				+ film_year + ", film_director=" + film_director + ", film_boxoffice=" + film_boxoffice +
				", film_duration=" + film_duration + ", film_review=" + film_review + "]";
	}
	
	
}
