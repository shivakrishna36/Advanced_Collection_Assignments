package com.capgemini.advancedcollection.classes;

import java.util.Comparator;

public class SortByGenreName implements Comparator<MovieDetails>
{
	@Override
	public int compare(MovieDetails first, MovieDetails second) 
	{
		
		return first.getGenre().compareToIgnoreCase(second.getGenre());
	}
}
