package 实验一;
// the second change

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Stack;
/*
class Point {

	private int adj,cost,biaoji;
	private Point next;
}
class Bigpoint{
	private String data;
	private Point first;
	private int sonnumber;
}
class Graph{
	private Bigpoint []list=new Bigpoint[50];
	private int node ,edg=-1;
}
class lianbiao{
	private String ad;
	private lianbiao next;
}*/

public class main1 {
	public static String[] we=new String[100];
	static Graph graph=new Graph();
	
	public static void main(String[] args) {
		String file,bridge;
		
		
		Scanner in=new Scanner(System.in);
		file=in.nextLine();
		//生成有向图
		create cr=new create();
		cr.graph=graph;
		cr.createDirectedGraph(file);
		graph=cr.graph;
		
		int i=1;
		//System.out.println(graph.node);
		//System.out.println(graph.edg);
//		while(graph.list[i]!=null)
//		{
//			System.out.println(graph.list[i].data);
//			i++;
//		}
		//随机游走
		randomWalk rd= new randomWalk();
		rd.randomWalk( graph);
		
	
		in.close();
		GraphVizTest gt=new GraphVizTest();
		gt.showDirectedGraph(graph);
		//桥接词两个
		qiaojie qj=new qiaojie();
		bridge=qj.queryBridgeWords(graph,"to","out");
		String[] wenben=new String[100];
		readfile rdf=new readfile();
		wenben=rdf.readfile1("C:\\Users\\lenovo\\Desktop\\读取文件2.txt",wenben);
		qj.generateNewText(graph,wenben);
		
		//最短路径
		shortpath st=new shortpath();
		String[]ss=st.CalcShortestPath( graph,"new","strange");
		
		
		String[]s=st.CalcShortestPath( graph,"new");
		
		gt.showDirectedGraph(graph, ss);
	}
}
	
	
	

	
	

	
	
	

