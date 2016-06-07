package nega;
import java.util.Scanner;

public class julchat extends memberintro{
	
	public void jul_chat(){
		
		Girl member[] = new Girl[5];
		
		Scanner buf = new Scanner(System.in);
		int[] arr = new int[5];
		int i;
		int j=0;
		int a;
		int p=0;
		System.out.println("please press best3 member number");
		for(i=0;i<3;i++){
			a= buf.nextInt();
			arr[i]=a;
		}
		for(j=0;j<3;j++){
			switch(arr[j]){
			case 1: member[j]= new Irene(26, 161, "SM", "leader, main rapper, sub vocal, lead dancer");
			break;
			case 2: member[j]= new Seulgi(23, 0, "SM", "Lead vocal, Main dancer");
			break;
			case 3: member[j]= new Wendy(23, 0, "SM", "Main vocal");
			break;
			case 4: member[j]= new Joy(21, 0, "SM", "Lead Rapper, sub vocal");
			break;
			case 5: member[j]= new Yeri(18, 0, "SM", "sub vocal"); 
			break;
			default: System.out.println("잘못 입력");
			}
		}
		
		System.out.println("목록확인하기-1 거절-2");
		int b = buf.nextInt();
		if(b==1){
			for(i=0;i<3;i++){
				member[i].girl_intro();
			}
		}
		else{
			revelintro rv = new revelintro();
			rv.groupintro();
		}
		}
	}