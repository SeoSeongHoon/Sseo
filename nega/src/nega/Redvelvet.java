package nega;

public class Redvelvet extends Group{

	public Redvelvet(String debut, String album, String career) {
		super(debut, album, career);
	}

	public void group() {
		System.out.println("µ¥ºß: "+debut);
		System.out.println("¾Ù¹ü: "+album);
		System.out.println("¼ö»ó: "+career);
	}
}
