package 实验一;

import static org.junit.Assert.*;

import org.junit.Test;
import  实验一.main1;

public class main1Test2 {
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String[] expectation=new String[100];
		String[] result=new String[100];
		expectation[0]="explore";
		expectation[1]="seek";
		qiaojie qj=new qiaojie();
		String resul=qj.queryBridgeWords(graph,"to", "strange");
		result=qiaojie.we;
		assertEquals(expectation, result);
		//fail("Not yet implemented");
	}
	@Test   
	public void test1() {
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String expectation="strange";
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"explore", "new");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test2() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String expectation="explore";
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"to", "explore");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test3() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String expectation="explore";
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"then", "explore");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test4() {
			
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
			String expectation="explor";
			qiaojie qj=new qiaojie();
			String result=qj.queryBridgeWords(graph,"then", "explor");
			assertEquals(expectation, result);
			//fail("Not yet implemented");
			}
	@SuppressWarnings("deprecation")
	
	@Test

public void test5() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String expectation;
		expectation ="new";
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"to", "new");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
	}
	@Test

	public void test6() {
			
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
			String expectation;
			expectation ="ne";
			qiaojie qj=new qiaojie();
			String result=qj.queryBridgeWords(graph,"to", "ne");
			assertEquals(expectation, result);
			//fail("Not yet implemented");
		}
	@Test
	public void test7() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String[] expectation=new String[100];
		expectation[0]="explore";
		expectation[1]="seek";
		expectation[2]="sss";
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"to", "strang");
		assertEquals(expectation, qiaojie.we);
		//fail("Not yet implemented");
	}
	@Test
	public void test8() {
		
		create cr=new create();
		Graph graph=new Graph();
		cr.graph=graph;
		cr.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\2.txt");
		graph=cr.graph;
		String expectation="to";
		
		qiaojie qj=new qiaojie();
		String result=qj.queryBridgeWords(graph,"to", "to");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
	}

}

