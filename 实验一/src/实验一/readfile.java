package ʵ��һ;

import java.io.FileReader;
import java.io.IOException;

public class readfile {
	public static String[] readfile1(String file,String wenjian[])
	{
		try{
			FileReader ff=new FileReader(file);
			
			int ch,i=0;
			char word;
			String thisword="";
			while((ch=ff.read())!=-1){//fr.read()��ȡһ���ֽڣ��жϴ��ֽڵ�ֵΪ-1��ʾ�����ļ�ĩβ�ˡ�
            	word=(char)ch;
            	
            	 if((('a'<=word) &&(word<='z') )||(('A'<=word) && (word<='Z'))){
	                	//System.out.println(word);
	                	thisword+=word;
            	 }
            	 else{
            		 if(thisword!="")
            		 {            			
						wenjian[i]=thisword;i++;thisword="";
            		 }
            		 else{continue;}
            	 }
				}
			if(thisword!="")
   		 {            			
				wenjian[i]=thisword;i++;thisword="";
   		 }
			
			ff.close();
			}catch(IOException e){
	           e.printStackTrace();
		}
	
		
		return wenjian;
	}
}
