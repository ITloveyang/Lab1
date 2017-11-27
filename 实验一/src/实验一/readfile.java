package 实验一;

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
			while((ch=ff.read())!=-1){//fr.read()读取一个字节，判断此字节的值为-1表示读到文件末尾了。
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
