package nega;

public class Wendy extends Girl{

	public Wendy(int age, int physical, String company, String position) {
		super(age, physical, company, position);
	}
	public void girl_intro(){
		System.out.println("나이: "+age);
		System.out.println("신체: "+physical);
		System.out.println("소속사: "+company);
		System.out.println("포지션: "+position);
		System.out.println();
	}
}
