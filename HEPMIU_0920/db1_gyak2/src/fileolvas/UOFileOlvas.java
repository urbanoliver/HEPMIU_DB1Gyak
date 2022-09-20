package fileolvas;

import java.io.*;
import java.util.*;
import java.util.Scanner;


public class UOFileOlvas {

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int db;
		 File file = new File("urban.txt");
		 FileReader in = new FileReader(file); 
		 
		 db = beolvasInt(in);
		 System.out.println("Adatok száma: " + db);
		 
		 int[] x = new int[db];
		 for(int i = 0; i < db; i++){
			 x[i] = beolvasInt(in);
			 System.out.println(i + ".adat = " + x[i]);
		 }
		 
		 in.close();
		 
		 int osszeg = 0;
		 for(int i = 0; i <db ; i++){
			 osszeg += x[i];
		 }
		 System.out.println(osszeg);
		 
		 

	}
	public static int beolvasInt(FileReader in) throws IOException{
		
		StringBuffer sb = new StringBuffer(12);
		int b;
		
		do{
			b = in.read();
			if((char)b != ','){
				sb.append(b);
			}
			else{
				break;
			}
		}while(true);
		
		return Integer.parseInt(sb.toString());
	}
	

}
