package com.capgemini.advancedcollection.classes;

public class MovieDetails 
{
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	
	public MovieDetails(String movieName, String leadActor, String leadActress,String genre) 
	{
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the leadActor
	 */
	public String getLeadActor() {
		return leadActor;
	}
	/**
	 * @param leadActor the leadActor to set
	 */
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @return the leadActress
	 */
	public String getLeadActress() {
		return leadActress;
	}
	/**
	 * @param leadActress the leadActress to set
	 */
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}
}
