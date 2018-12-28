package com.capgemini.advancedcollection.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.advancedcollection.classes.MovieDetails;
import com.capgemini.advancedcollection.classes.MovieDetailsList;
import com.capgemini.advancedcollection.classes.SortByGenreName;
import com.capgemini.advancedcollection.classes.SortByLeadActor;
import com.capgemini.advancedcollection.classes.SortByLeadActress;
import com.capgemini.advancedcollection.classes.SortByMovieName;

public class MoviesTest 
{

	private MovieDetails first,second,third;
	private MovieDetailsList detailsList = new MovieDetailsList();
	
	
	@Before
	public void setUp()
	{
		first = new MovieDetails("Adhurs", "NTR", "Nayantara", "Comedy");
		second = new MovieDetails("GabbarSingh", "PawanKalyan", "SruthiHasan", "Action");
		third = new MovieDetails("ChandraMukhi", "RajiniKanth", "nayanatra", "Horror");
		
	}
	
	@Test
	public void testForAddMovie() 
	{
		detailsList.addMovie(first);
		detailsList.addMovie(second);
		detailsList.addMovie(third);
	}
	
	@Test
	public void testForRemoveMovie() 
	{
		detailsList.addMovie(first);
		detailsList.addMovie(second);
		detailsList.addMovie(third);
		boolean result = detailsList.removeMovie(third);
		assertTrue(result);
	}
	
	@Test
	public void testForRemoveAllMovies()
	{
		detailsList.addMovie(first);
		detailsList.addMovie(second);
		detailsList.addMovie(third);
		boolean result = detailsList.removeAllMovies();
		assertTrue(result);
	}
	
	@Test
	public void testForFindMovieByMovieName()
	{
		detailsList.addMovie(first);
		detailsList.addMovie(second);
		detailsList.addMovie(third);
		assertEquals(second.toString(),detailsList.findMovieByMovieName("GabbarSingh"));
	}
	
	@Test
	public void testForFindMovieByGenreName()
	{
		detailsList.addMovie(first);
		detailsList.addMovie(second);
		detailsList.addMovie(third);
		assertEquals(third.toString(),detailsList.findMovieByGenreName("Horror"));
	}
	
	@Test
	public void testForSortingListByMovieName()
	{
		ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
		list.add(first);
		list.add(second);
		list.add(third);
		ArrayList<MovieDetails> list2 = new ArrayList<MovieDetails>();
		list2.add(first);
		list2.add(third);
		list2.add(second);
		Collections.sort(list,new SortByMovieName());
		assertEquals(list2,list);
		
		
	}
	
	@Test
	public void testForSortingListByLeadActorName()
	{
		ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
		list.add(first);
		list.add(second);
		list.add(third);
		ArrayList<MovieDetails> list2 = new ArrayList<MovieDetails>();
		list2.add(first);
		list2.add(second);
		list2.add(third);
		Collections.sort(list,new SortByLeadActor());
		assertEquals(list2,list);
		
		
	}
	
	@Test
	public void testForSortingListByLeadActressName()
	{
		ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
		list.add(first);
		list.add(second);
		list.add(third);
		ArrayList<MovieDetails> list2 = new ArrayList<MovieDetails>();
		list2.add(third);
		list2.add(first);
		list2.add(second);
		Collections.sort(list,new SortByLeadActress());
		assertEquals(list2,list);
	}
	
	@Test
	public void testForSortingListByGenreName()
	{
		ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
		list.add(first);
		list.add(second);
		list.add(third);
		ArrayList<MovieDetails> list2 = new ArrayList<MovieDetails>();
		list2.add(second);
		list2.add(first);
		list2.add(third);
		Collections.sort(list,new SortByGenreName());
		assertEquals(list2,list);
	}

}
