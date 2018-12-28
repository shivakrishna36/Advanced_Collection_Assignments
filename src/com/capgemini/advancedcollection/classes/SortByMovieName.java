package com.capgemini.advancedcollection.classes;

import java.util.Comparator;

public class SortByMovieName implements Comparator<MovieDetails>
{
	
	@Override
	public int compare(MovieDetails first, MovieDetails second) 
	{
		
		return first.getMovieName().compareToIgnoreCase(second.getMovieName());
	}
	
}
