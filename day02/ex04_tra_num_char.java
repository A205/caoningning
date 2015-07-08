package demo;

import java.util.Scanner;

public class ex04_tra_num_char {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入2-100之间的整数表示行数");
		int num=scanner.nextInt();
		int j,i=1;
		char ch='A';
		if(num>100||num<2)i=0;
		while(i==0){
			System.out.println("重新输入2-100之间的整数");
			i=1;
		    num=scanner.nextInt();
			if(num>100||num<2)i=0;
			}
		for(i=1;i<=num;i++){
			for(j=1;j<=num-i;j++){
				System.out.print(" ");
				}
			for(j=1;j<=i*2-1;j++){
				if(i<=9)
				System.out.print(i);
				else {System.out.print((char)(ch+i-10));}
				}
			System.out.print("\n");
			}
		}
	}
