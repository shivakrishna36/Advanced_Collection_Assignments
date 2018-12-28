package com.capgemini.advancedcollection.classes;

import java.util.Comparator;

public class SortByLeadActress implements Comparator<MovieDetails>
{
	@Override
	public int compare(MovieDetails first, MovieDetails second) 
	{
		
		return first.getLeadActress().compareToIgnoreCase(second.getLeadActress());
	}
}
