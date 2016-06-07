package nega;
import java.util.Scanner;
public class memberintro {
	public void Intro_2(){
		
		Irene irene = new Irene(26, 161, "SM", "leader, main rapper, sub vocal, lead dancer");
		Seulgi seulgi = new Seulgi(23, 0, "SM", "Lead vocal, Main dancer");
		Wendy wendy = new Wendy(23, 0, "SM", "Main vocal");
		Joy joy = new Joy(21, 0, "SM", "Lead Rapper, sub vocal");
		Yeri yeri = new Yeri(18, 0, "SM", "sub vocal");
		
		Scanner buf = new Scanner(System.in);
		int a = buf.nextInt();
		switch(a){
		
		case 1: irene.girl_intro(); break;
		case 2: seulgi.girl_intro(); break;
		case 3: wendy.girl_intro(); break;
		case 4: joy.girl_intro(); break;
		case 5: yeri.girl_intro(); break;
		default: System.out.println("잘못 입력하셨습니다.");
		
		}
	}
}
