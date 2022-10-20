package arraylist;

import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import Array.Arrays;

public class File_reader {
	private static Object szInput;

	public static void main(String sri[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\sairamjava\\fruites.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		
		
		File file = new File("C:\\sairamjava\\fruites.txt");
		File rename = new File("C:\\sairamjava\\FRUITES.txt");
		boolean flag = file.renameTo(rename);
		if(flag==true)
		{
			System.out.println("successfully rename of the file");
		}
		else
		{
			System.out.println("does not update");
		}
		
		
		
		
	}

}
