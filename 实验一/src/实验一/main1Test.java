package ʵ��һ;

import static org.junit.Assert.*;
//import ʵ��һ.create;
import org.junit.Before;
import org.junit.Test;

public class main1Test {
	
	
	@Test
	public void testRandomWalk0() {
		Graph graph=new Graph();
		create m0=new create();
		m0.graph=graph;
		m0.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\ͼ.txt");
		graph=m0.graph;
		randomWalk ra=new randomWalk();
		ra.randomWalk(graph);
		int result=ra.flag;
		if(result == 0){

            System.out.println("��һ��֧��ȷ");

        }
		
	}
	@Test
	public void testRandomWalk1() {
		Graph graph=new Graph();
		create m1=new create();
		m1.graph=graph;
		m1.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\ͼ.txt");
		graph=m1.graph;
		randomWalk ra=new randomWalk();
		ra.randomWalk(graph);
		int result=ra.flag;
		if(result == 1){

            System.out.println("�ڶ���֧��ȷ");

        }
		
	}
	@Test
	public void testRandomWalk2() {
		Graph graph=new Graph();
		create m2=new create();
		m2.graph=graph;
		m2.createDirectedGraph("C:\\Users\\lenovo\\Desktop\\ͼ.txt");
		graph=m2.graph;
		randomWalk ra=new randomWalk();
		ra.randomWalk(graph);
		int result=ra.flag;
		if(result == 2){

            System.out.println("������֧��ȷ");

        }
	}

}
