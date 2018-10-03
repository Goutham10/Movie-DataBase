package my.movies;

public class TollyWoodMovie extends Movie
{
	int m_Id;

	
	
	public TollyWoodMovie(String mName, String mReleaseDate, String duration, String typeOfMovie, String mLanguage,
			String[] cast_crew) {
		super(mName, mReleaseDate, duration, typeOfMovie, mLanguage, cast_crew);
		// TODO Auto-generated constructor stub
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
