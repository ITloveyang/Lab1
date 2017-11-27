package 实验一;

import java.io.FileReader;
import java.io.IOException;

public class create {
	static Graph graph;
	
	public static int isinlist(String thisword,Graph graph)
	{
		int i=1;
		while(i<=graph.getNode()&&!graph.getList()[i].getData().equalsIgnoreCase(thisword)){
			i++;
		}
		
		if(i<=graph.getNode())return i;
		else return 0;
	}
	
	public static void createDirectedGraph(String file){
		try{
				Bigpoint []llist=new Bigpoint[50];
			   FileReader fr = new FileReader(file);
	            
	           int ch = 0;int biao=1;int prebiao=0;int nbiao=1;
	           char word;
	           String thisword="";
	           llist[0]=new Bigpoint();
	           graph.setList(llist);
	            while((ch=fr.read())!=-1){//fr.read()读取一个字节，判断此字节的值为-1表示读到文件末尾了。
	            	word=(char)ch;
	                
	                if((('a'<=word) &&(word<='z') )||(('A'<=word) && (word<='Z'))){
	                	//System.out.println(word);
	                	thisword+=word;
	                }
	                else{
	                	if(thisword!=""){
	                		thisword=thisword.toLowerCase();
	                		if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ies"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-3)+"y";
	                		}
	                		else if(thisword.length()>3&&thisword.substring(thisword.length()-2,thisword.length()).equalsIgnoreCase("es"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-2);
	                		}
	                		else if(thisword.length()>3&&thisword.substring(thisword.length()-1,thisword.length()).equalsIgnoreCase("s"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-1);
	                		}
	                		else if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ied"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-3)+"y";
	                		}
	                		else if(thisword.length()>3&&thisword.substring(thisword.length()-2,thisword.length()).equalsIgnoreCase("ed"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-2);
	                		}
	                		else if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ing"))
	                		{
	                			thisword=thisword.substring(0,thisword.length()-3);
	                		}
			                		if(isinlist(thisword,graph)==0){
			                			graph.setNode(graph.getNode()+1);
			                			
			                			//System.out.println(graph.node);
			                			 nbiao=biao;
			                			 
						                	llist[nbiao]=new Bigpoint();
						                	
						                	llist[nbiao].setData(thisword);
						                	graph.setList(llist);
						                	Point p=new Point();
						                	p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
						                	//p.adj=nbiao;p.cost++;graph.edg++;
						                	
						                	
						                	if(graph.getList()[prebiao].getFirst()!=null){
						                		Point sons=graph.getList()[prebiao].getFirst();
						                		while(sons.getNext()!=null){sons=sons.getNext();}
						                		sons.setNext(p);//graph.list[prebiao].sonnumber++;
						                		llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
						                		graph.setList(llist);
						                	}
						                	else{
						                		llist[prebiao].setFirst(p);
						                		llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
//						                		graph.list[prebiao].first=p;
//						                		graph.list[prebiao].sonnumber++;
						                		graph.setList(llist);
						                	}
						                	thisword="";
						                	prebiao=nbiao;
						                	biao++;
			                		}
			                		else
			                		{
				                			nbiao=isinlist(thisword,graph);
				                			if(graph.getList()[prebiao].getFirst()==null){
				                				Point p=new Point();
					                			p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
					                			//p.cost++;graph.edg++;
					                			llist[prebiao].setFirst(p);
					                			llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
//						                		graph.list[prebiao].first=p;
//						                		graph.list[prebiao].sonnumber++;
					                			graph.setList(llist);
						                	}
						                	else{
						                		
						                		Point sons=graph.getList()[prebiao].getFirst();
						                		Point presons=graph.getList()[prebiao].getFirst();
						                		do{
						                			if(sons.getAdj()==nbiao){Point p=sons;p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);break;}
						                			else{presons=sons;sons=sons.getNext();}
						                			}while(sons!=null);
						                		if(sons==null){
						                			Point p=new Point();
						                			p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
						                			//p.adj=nbiao;p.cost++;graph.edg++;
						                			//presons.next=p;graph.list[prebiao].sonnumber++;
						                			presons.setNext(p);llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
						                			graph.setList(llist);
						                		}
						                	}
				                			thisword="";
				                			prebiao=nbiao;
				                			}
			                		}
	                	else{continue;}
	                }
	           }
	            fr.close();
	            thisword=thisword.toLowerCase();
	            if(thisword!=""){
	            	if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ies"))
            		{
            			thisword=thisword.substring(0,thisword.length()-3)+"y";
            		}
            		else if(thisword.length()>3&&thisword.substring(thisword.length()-2,thisword.length()).equalsIgnoreCase("es"))
            		{
            			thisword=thisword.substring(0,thisword.length()-2);
            		}
            		else if(thisword.length()>3&&thisword.substring(thisword.length()-1,thisword.length()).equalsIgnoreCase("s"))
            		{
            			thisword=thisword.substring(0,thisword.length()-1);
            		}
            		else if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ied"))
            		{
            			thisword=thisword.substring(0,thisword.length()-3)+"y";
            		}
            		else if(thisword.length()>3&&thisword.substring(thisword.length()-2,thisword.length()).equalsIgnoreCase("ed"))
            		{
            			thisword=thisword.substring(0,thisword.length()-2);
            		}
            		else if(thisword.length()>3&&thisword.substring(thisword.length()-3,thisword.length()).equalsIgnoreCase("ing"))
            		{
            			thisword=thisword.substring(0,thisword.length()-3);
            		}
	            	
            		if(isinlist(thisword,graph)==0){
            			graph.setNode(graph.getNode()+1);
            			//System.out.println(graph.node);
            			 nbiao=biao;
            			 llist[nbiao]=new Bigpoint();
		                	
		                	llist[nbiao].setData(thisword);
		                	graph.setList(llist);
//		                	graph.list[nbiao]=new Bigpoint();
//		                	graph.list[nbiao].data=thisword;
		                	Point p=new Point();
		                	p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
		                	//p.adj=nbiao;p.cost++;graph.edg++;
		                	
		                	
		                	if(graph.getList()[prebiao].getFirst()!=null){
		                		Point sons=graph.getList()[prebiao].getFirst();
		                		while(sons.getNext()!=null){sons=sons.getNext();}
		                		sons.setNext(p);//graph.list[prebiao].sonnumber++;
		                		llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
		                		graph.setList(llist);
		                		
		                		/*Point sons=graph.list[prebiao].first;
		                		while(sons.next!=null){sons=sons.next;}
		                		sons.next=p;graph.list[prebiao].sonnumber++;*/
		                	}
		                	else{
		                		llist[prebiao].setFirst(p);
		                		llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
//		                		graph.list[prebiao].first=p;
//		                		graph.list[prebiao].sonnumber++;
		                		graph.setList(llist);
		                		
		                		
		                	}
		                	thisword="";
		                	prebiao=nbiao;
		                	biao++;
            		}
            		else
            		{
                			nbiao=isinlist(thisword,graph);
                			if(graph.getList()[prebiao].getFirst()==null){
                				Point p=new Point();
                				p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
	                			//p.adj=nbiao;p.cost++;graph.edg++;
                				llist[prebiao].setFirst(p);
	                			llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
//		                		graph.list[prebiao].first=p;
//		                		graph.list[prebiao].sonnumber++;
	                			graph.setList(llist);
		                		
		                	}
		                	else{
		                		Point sons=graph.getList()[prebiao].getFirst();
		                		Point presons=graph.getList()[prebiao].getFirst();
//		                		Point sons=graph.list[prebiao].first;
//		                		Point presons=graph.list[prebiao].first;
		                		do{
		                			if(sons.getAdj()==nbiao){Point p=sons;p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);break;}
		                			else{presons=sons;sons=sons.getNext();}
		                			}while(sons!=null);
		                		if(sons==null){
		                			Point p=new Point();
		                			p.setAdj(nbiao);p.setCost(p.getCost()+1);graph.setEdg(graph.getEdg()+1);
		                			//p.adj=nbiao;p.cost++;graph.edg++;
		                			//presons.next=p;graph.list[prebiao].sonnumber++;
		                			presons.setNext(p);llist[prebiao].setSonnumber(llist[prebiao].getSonnumber()+1);
		                			graph.setList(llist);
		                		}
		                	}
                			thisword="";
                			prebiao=nbiao;
                			}
            		}
	        }catch(IOException e){
	           e.printStackTrace();
	       }

	}
}
