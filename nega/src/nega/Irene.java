package nega;

public class Irene extends Girl{
	
	public Irene(int age, int physical, String company, String position) {
		super(age, physical, company, position);
	}

	public void girl_intro(){
		System.out.println("����: "+age);
		System.out.println("��ü: "+physical);
		System.out.println("�Ҽӻ�: "+company);
		System.out.println("������: "+position);
		System.out.println();
	}
	
}
