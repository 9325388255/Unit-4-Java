package E3Que3;

//1. Create a Java class Song with the following members:
//movieName: String
//songName: String
//Inside this class define another method as :
//play():void
//This play() method should print:
//songName+" of "+movieName+" is playing...!"


public class Song {
	
	String movieName;
	String songName;
	
	public Song(){
		
	};
	
	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

	void play() {
		
		System.out.println(songName+" of "+movieName+" is playing...!");
    }
	
	
}
