package 实验一;

import java.util.Scanner;

public class randomWalk {

	static public int flag=0;
	public static void randomWalk(Graph graph)
	{
		int biao,shifoujixu=1,son;
		Bigpoint b;Point p;
		biao=(int)(1+Math.random()*(graph.getNode()-1+1));
		
		b=graph.getList()[biao];
		p=b.getFirst();
		System.out.println(b.getData());
		Scanner in1=new Scanner(System.in);
		System.out.print("是否继续？");
		shifoujixu=in1.nextInt();
		System.out.println();
		while(shifoujixu!=0&&b.getFirst()!=null){
			
			son=(int)(1+Math.random()*(b.getSonnumber()-1+1));
			for(int i=1;i<son;i++){
				p=p.getNext();
			}
			if(p.getBiaoji()==0){
				flag=1;
				p.setBiaoji(1);
				biao=p.getAdj();b=graph.getList()[biao];p=b.getFirst();System.out.println(b.getData());
			}
			else{
				flag=2;
				biao=p.getAdj();b=graph.getList()[biao];p=b.getFirst();System.out.println(b.getData());
				break;
			}
			System.out.print("是否继续？");
			shifoujixu=in1.nextInt();
			System.out.println();
		}
		System.out.println("已结束");
		
		in1.close();
		
	}
}
