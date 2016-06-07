package nega;

public abstract class Group {
	String debut;
	String album;
	String career;
	public Group(String debut, String album, String career){
		this.debut=debut;
		this.album=album;
		this.career=career;
	}
	public abstract void group();
}
