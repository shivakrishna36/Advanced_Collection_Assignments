package com.capgemini.advancedcollection.classes;

import java.util.ArrayList;

public class MovieDetailsList
{
	
	ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
	public void addMovie(MovieDetails name)
	{
		list.add(name);
	}
	
	public boolean removeMovie(MovieDetails name)
	{
		list.remove(name);
		System.out.println(list.toString());
		return true;
	}
	
	public boolean removeAllMovies()
	{
		System.out.println(list.toString());
		list.removeAll(list);
		System.out.println(list.toString());
		return true;
		
	}
	
	public String findMovieByMovieName(String name)
	{
		int count;
		for(count =0;count<list.size();count++)
		{
			if(list.get(count).getMovieName().equalsIgnoreCase(name))
			{
				return list.get(count).toString();
			}
		}
		return null;
	}
	
	public String findMovieByGenreName(String name)
	{
		int count;
		for(count =0;count<list.size();count++)
		{
			if(list.get(count).getGenre().equalsIgnoreCase(name))
			{
				return list.get(count).toString();
			}
		}
		return null;
	}
	

	
	
}
