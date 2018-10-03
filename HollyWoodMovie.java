package my.movies;

public class HollyWoodMovie extends Movie
{
	int h_Id;

	public HollyWoodMovie(String mName, String mReleaseDate, String duration, String typeOfMovie, String mLanguage,
			String[] cast_crew)
	{
		super(mName, mReleaseDate, duration, typeOfMovie, mLanguage, cast_crew);
	}

	public void display() {
		System.out.println(" Name 		:"+mName);
		System.out.println(" ReleaseDate    :"+mReleaseDate);
		System.out.println(" Duration 	:"+duration);
		System.out.println(" TypeOfMovie 	:"+typeOfMovie);
		System.out.println(" Movie Language :"+mLanguage);
		for(int i=0;i<cast_crew.length;i++)
		{
			System.out.println(cast_crew[i]);
		}
	}
	
	
}
