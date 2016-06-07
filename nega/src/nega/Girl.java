package nega;

public abstract class Girl {
	int age;
	int physical;
	String company;
	String position;
	public Girl(int age, int physical, String company, String position){
		this.age = age;
		this.physical=physical;
		this.company=company;
		this.position=position;
	}
	public abstract void girl_intro();
}
