package 实验一;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class main1Test {

	
	@Test
	public void testRandomWalk0() {
		main1 m0=new main1();
		m0.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\图.txt");
		m0.randomWalk(m0.graph);
		int result=m0.flag;
		if(result == 0){

            System.out.println("第一分支正确");

        }
		
	}
	/*@Test
	public void testRandomWalk1() {
		main1 m1=new main1();
		m1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\图.txt");
		m1.randomWalk(m1.graph);
		int result=m1.flag;
		if(result == 1){

            System.out.println("第二分支正确");

        }
	}*/
	/*@Test
	public void testRandomWalk2() {
		main1 m2=new main1();
		m2.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\图.txt");
		m2.randomWalk(m2.graph);
		int result=m2.flag;
		if(result == 2){

            System.out.println("第三分支正确");

        }
	}*/

}
