package homework;

import java.util.Scanner;

public class Day01_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Scanner inputN=new Scanner(System.in);
		System.out.println("|1.Add a student|");
		System.out.println("|2.Show all the students|");
		System.out.println("|3.Exit|");
		String str[]=new String[7];
		int j=0;
		for(int i=1;i<=1;){
		//	if(num==1){System.out.println("|1.name?|");str[i]=inputN.next();}
			System.out.println("|Only "+(7-j) +" members can join this.Please chose a num between 1 and 3:");
			int num=input.nextInt();
		    switch(num){
		    case 1: System.out.println("|1.name?|");str[j]=inputN.next();j=j+1;break;
		    case 2:for(int m=0;m<=j-1;m++){System.out.println(str[m]);};break;
		    case 3:System.out.println("Bye");i=4;
		}
		}
	}

}
