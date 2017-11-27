package 实验一;

public class shortpath {
	static String[] CalcShortestPath(Graph graph,String word1,String word2)
	{
		int m,n;
		int[][] jz=new int [graph.getNode()+1][graph.getNode()+1];int[][] p=new int [graph.getNode()+1][graph.getNode()+1];
		int[][] di=new int [graph.getNode()+1][graph.getNode()+1];int i,j,k;
		for(i=1;i<=graph.getNode();i++)
		{
			for(j=1;j<=graph.getNode();j++)
			{
				if(j!=i)
				{jz[i][j]=100;}
				else{
					jz[i][j]=100;
				}
			}
		}
		int a=1;		
		while(!word1.equalsIgnoreCase(graph.getList()[a].getData()))
		{
			if(a==graph.getNode())
			{
				System.out.println("无路径");
				return null;
			}
			a++;
		}	
		int b=1;
		while(!word2.equalsIgnoreCase(graph.getList()[b].getData()))
		{
			if(b==graph.getNode())
			{
				System.out.println("无路径");
				return null;
			}
			b++;
		}
		for(i=1;i<=graph.getNode();i++)
		{
			Point sons=graph.getList()[i].getFirst();
			while(sons!=null)
			{
				jz[i][sons.getAdj()]=sons.getCost();
				sons=sons.getNext();
			}
		}
		for(i=1;i<=graph.getNode();i++)
		{
			for(j=1;j<=graph.getNode();j++)
			{	
					p[i][j]=j;
			}
		}

		for(k=1;k<=graph.getNode();k++)
		{
			for(i=1;i<=graph.getNode();i++)
			{
				for(j=1;j<=graph.getNode();j++)
				{
					if(jz[i][k]+jz[k][j]<jz[i][j])
					{					
						jz[i][j]=jz[i][k]+jz[k][j];
						p[i][j]=p[i][k];
					}
				}
			}
		}	
	
		if(jz[a][b]==100){
			System.out.println("无路径 ");
			return null;
		}
		else{
			String[] ss=new String[100];int count=0;
			System.out.print(word1+" -> ");ss[count]=word1;count++;
			i=p[a][b];
			while(i!=b)
			{
				System.out.print(graph.getList()[i].getData()+" -> ");
				ss[count]=graph.getList()[i].getData();count++;
				i=p[i][b];
				
			}
			System.out.println(word2);ss[count]=graph.getList()[i].getData();
			System.out.println("长度为 "+jz[a][b]);
				return ss;
		}
	}

	static String[] CalcShortestPath(Graph graph,String word1)
	{
		String[] ss=new String[100];
		int a=1;		
		while(!word1.equalsIgnoreCase(graph.getList()[a].getData()))
		{
			if(a==graph.getNode())
			{
				System.out.println("无路径");
				return null;
			}
			a++;
		}	
		for(int i=1;i<=graph.getNode();i++)
		{
			if(i!=a)
				{CalcShortestPath(graph,graph.getList()[a].getData(),graph.getList()[i].getData());
		}
	}return ss;
	}

}
