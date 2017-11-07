package 实验一;

import static org.junit.Assert.*;

import org.junit.Test;
import  实验一.main1;

public class main1Test2 {
	@Test   
	public void test1() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String expectation="strange";
		String result=main1.queryBridgeWords(main1.graph,"explore", "new");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test2() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String expectation="explore";
		String result=main1.queryBridgeWords(main1.graph,"to", "explore");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test3() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String expectation="explore";
		String result=main1.queryBridgeWords(main1.graph,"then", "explore");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
		}
	@Test
	public void test4() {
			
			main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
			String expectation="explor";
			String result=main1.queryBridgeWords(main1.graph,"then", "explor");
			assertEquals(expectation, result);
			//fail("Not yet implemented");
			}
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String[] expectation=new String[100];
		expectation[0]="explore";
		expectation[1]="seek";
		String result=main1.queryBridgeWords(main1.graph,"to", "strange");
		assertEquals(expectation, main1.we);
		//fail("Not yet implemented");
	}
	@Test

public void test5() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String expectation;
		expectation ="new";
		String result=main1.queryBridgeWords(main1.graph,"to", "new");
		assertEquals(expectation, result);
		//fail("Not yet implemented");
	}
	@Test

	public void test6() {
			
			main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
			String expectation;
			expectation ="ne";
			String result=main1.queryBridgeWords(main1.graph,"to", "ne");
			assertEquals(expectation, result);
			//fail("Not yet implemented");
		}
	@Test
	public void test7() {
		
		main1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\tu.txt");
		String[] expectation=new String[100];
		expectation[0]="explore";
		expectation[1]="seek";
		expectation[2]="sss";
		String result=main1.queryBridgeWords(main1.graph,"to", "strang");
		assertEquals(expectation, main1.we);
		//fail("Not yet implemented");
	}

}

