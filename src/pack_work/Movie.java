package pack_work;

public class Movie {

	String movieName;
	String leadActor;
	String leadActress;
	String yearString;
	String dirName;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getYearString() {
		return yearString;
	}
	public void setYearString(String yearString) {
		this.yearString = yearString;
	}
	public String getDirName() {
		return dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", yearString=" + yearString + ", dirName=" + dirName + "]";
	}	
}
