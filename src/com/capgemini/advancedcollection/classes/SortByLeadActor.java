package com.capgemini.advancedcollection.classes;

import java.util.Comparator;

public class SortByLeadActor implements Comparator<MovieDetails>
{

	@Override
	public int compare(MovieDetails first, MovieDetails second) 
	{
		
		return first.getLeadActor().compareToIgnoreCase(second.getLeadActor());
	}
}
