package my.movies;

public class Movie 
{
	String mName;
	String mReleaseDate;
	String duration;
	String typeOfMovie;
	String mLanguage; 
	public String [] cast_crew;
	
	public void start()
	{
		
	}
	
	public void stop()
	{
		
	}

	
	public Movie(String mName, String mReleaseDate, String duration, String typeOfMovie, String mLanguage,
			String[] cast_crew) {
		super();
		this.mName = mName;
		this.mReleaseDate = mReleaseDate;
		this.duration = duration;
		this.typeOfMovie = typeOfMovie;
		this.mLanguage = mLanguage;
		this.cast_crew = cast_crew;	}

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




























