package สตั้าป;


public class qiaojie {
	
		
	
	public static String[] we=new String[100];
	static String queryBridgeWords(Graph graph,String word1,String word2)
	{
		String bridge = null;int i=1,k=0,j,jihao=0,a=0;
		for(j=1;j<=graph.getNode();j++)
		{
			if(word2.equalsIgnoreCase(graph.getList()[j].getData()))
			{
				k=1;
				break;
			}
		}
		for(j=1;j<=graph.getNode();j++)
		{
			if(word1.equalsIgnoreCase(graph.getList()[j].getData()))
			{
				
				jihao=1;break;
			}
		}
		if(k!=1&&jihao!=1)
		{
			System.out.println("No "+ word1+ " and " +word2+" in the graph!");
			return word2;
		}
		else if(k!=1&&jihao==1)
		{
			System.out.println("No "+ word2+" in the graph!"); return word2;
		}
		else if(k==1&&jihao!=1)
		{
			System.out.println("No "+ word1+" in the graph!"); return word2;
		}
		while(i<=graph.getNode()&&k==1&&jihao==1)
		{
			if (word1.equalsIgnoreCase(graph.getList()[i].getData()))
			{
				
				Point sons=graph.getList()[i].getFirst();
				Point child=graph.getList()[i].getFirst();
				while(child!=null)
				{
					if(word2.equalsIgnoreCase(graph.getList()[child.getAdj()].getData())){System.out.println("No bridge words from "+word1+ " to "+word2+"!");return word2;}
					child=child.getNext();
				}
				while(sons!=null){
        			
        				Point person=graph.getList()[sons.getAdj()].getFirst();
        				while(person!=null)
        				{
	        				if(word2.equalsIgnoreCase(graph.getList()[person.getAdj()].getData()))
	        				{
	        					bridge=graph.getList()[sons.getAdj()].getData();
	        					
	        					//System.out.println("The bridge from "+word1 +" to "+ word2 +" is :"+bridge);
								we[a]=bridge;
								a++;
	        					person=person.getNext();
	        					break;
	        				}
	        				else 
	        				{
	        					person=person.getNext();
	        				}
        				}
        		
        			sons=sons.getNext();
        		}
				if(bridge==null){System.out.println("No bridge words from "+word1+ " to "+ word2+"!");return word2;}
				else {					
					if(a!=1){										
						System.out.print("The bridge from "+word1 +" to "+ word2 +" are :"+we[0] );
					for(i=1;i<a-1;i++)
					{
						System.out.print(","+we[i]);
					}
					System.out.println(" and "+we[i]+".");
				}
					else{
						System.out.println("The bridge from "+word1 +" to "+ word2 +" is :"+we[0] +".");
					}
				}	
				return bridge;
				}
			else{i++;}
		}
		return bridge;
	}
	static void Insert(lianbiao head,String data1,String data2)
	 {
		
		
		 lianbiao node=head;	
		 lianbiao swap;
		 while(node.getAd() !=data1)
		 {
			 
			 node=node.getNext();
		 }
		 lianbiao pnew=new lianbiao();
		 pnew.setAd(data2);;
		 swap=node.getNext();
		 node.setNext(pnew);;
		 pnew.setNext(swap);;
	 }
	static String generateNewText(Graph graph,String inputText[])
	 {
		
		
		 int i=0,a=0;
		 lianbiao head=new lianbiao();
		 lianbiao tail=head;
		 tail.setNext(null);
		 while(inputText[i]!=null)
		 {
			lianbiao p=new lianbiao();
			p.setAd(inputText[i]);
			tail.setNext(p);
			p.setNext(null);
			tail=p;i++;
		 }
		
		 while(inputText[a+1]!=null)
		 {
			 String xin=queryBridgeWords(graph,inputText[a],inputText[a+1]);
			 
				 if(xin!=inputText[a+1])
				 {
					 Insert(head,inputText[a],xin);
				 }
				 a++;
		 }
		 
		 head=head.getNext();
		 while(head!=null)
		 {
			 System.out.print(head.getAd()+" ");
			 head=head.getNext();
		 }
		 System.out.println();
		return null;
		
			 
	 }

	
	
	
}
