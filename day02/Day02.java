package homework;

public class Day02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("the core is coreC++,coreJava,Servlet,JSP,EJB one by one.");
		int score[][]=new int[20][5];
		int total[]=new int[20];
		int average[]=new int[5];
		int i,j,temp;
		for(i=0;i<20;i++){
			for(j=0;j<5;j++){
				score[i][j]=(int)(Math.random()*100);
				System.out.print(score[i][j]+"\t");
				if(j==4)System.out.print("\n");
			}
		}
		System.out.println("total:");
		for(i=0;i<20;i++){
			for(j=0;j<5;j++){
				total[i]=total[i]+score[i][j];
				if(j==4)System.out.print(total[i]+"\t");
				if(i==19&&j==4)System.out.print("\n");
			}
		}
		System.out.println("average:");
		for(j=0;j<5;j++){
			temp=0;
			for(i=0;i<20;i++){
				temp=temp+score[i][j];
				if(i==19){average[j]=temp/20;System.out.print(average[j]+"\t");}
				if(i==19&&j==4)System.out.print("\n");
			}
		}
	}

}
