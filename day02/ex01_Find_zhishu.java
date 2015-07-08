package demo;

public class ex01_Find_zhishu {
	public static void main(String[] args){
		int j,n=0;int i=2;
		while(i<101)
		{
			j=1;
			while(j<=i/2)
				{
				j=j+1;
				if(i%j==0)break;
				else continue;
				}
			if(j>i/2){n=n+1;System.out.println(i+"is zhishu");}
		i++;
		}
		System.out.println("There are "+n+" zhishu");
	}
}
