package my.runmovies;

import my.movies.BollyWoodMovie;
import my.movies.HollyWoodMovie;
import my.movies.Movie;
import my.movies.TollyWoodMovie;

public class MainClass {

	public static void main(String[] args) 
	{
		Movie m=new Movie("Movie Name","Date of Release", "Duration of movie", "Action", "language of movie",args);
		m.cast_crew=new String[] {" Director of moive "," Hero of the movie "," Actress of the movie"};
		m.display();
		
		System.out.println();
		
		TollyWoodMovie t=new TollyWoodMovie("Manam", "23-9-2015", "3 hours", "FamilyEntertainer", "Telugu", args);
		t.cast_crew=new String[] {" Director 	:Mani"," Hero 		:Nagarjuna"," Actress 	:Shreya"};
		t.display();
		
		System.out.println();
		
		BollyWoodMovie b=new BollyWoodMovie("Krish", "23-9-2013", "2 and half hours", "FamilyEntertainer", "Hindi", args);
		b.cast_crew=new String[] {" Director 	:Manish"," Hero 		:Roshan"," Actress 	:Priyanka"};
		b.display();
		
		System.out.println();
		
		HollyWoodMovie h=new HollyWoodMovie("Rambo", "23-9-2013", "2 and half hours", "Action", "English", args);
		h.cast_crew=new String[] {" Director 	:Kevin"," Hero 		:Kristalker"," Actress 	:NA"};
		h.display();
		
		
		
	}

	
}
