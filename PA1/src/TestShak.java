import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestShak 
{
	public static void main(String[] args) throws IOException 
	{
		int size = 8;
		long hRuntime;
		HashCodeSimilarity hash = new HashCodeSimilarity(shak1(), shak2(), size);
		System.out.println("HashCodeSimilarity:");
		System.out.println("VectorLength(S) = " + hash.lengthOfS1());
		System.out.println("VectorLength(T) = " + hash.lengthOfS2());
		System.out.println("Similarity: " + hash.similarity());
		hRuntime = hash.runtime();
		System.out.println("Hash Code Runtime: ~" + hRuntime + " nanoseconds");
		System.out.println();
		
		
	}
	
	public static String shak1() throws IOException
	{
		String shak1 = null;
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader("C://311/PA1/PA1/PA1/src/shak1.txt"));
			StringBuffer stringBuffer = new StringBuffer();
			String line = null;
			char c; 

			while((line=bufferedReader.readLine())!=null)
			{
				line =line.toLowerCase();
				for(int i=0;i<line.length();i++)
				{
					c = line.charAt(i);
					if(Character.isLetterOrDigit(c)) 
					{
						stringBuffer.append(c);
					}
				}

			}
			shak1 = stringBuffer.toString();
			bufferedReader.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return shak1;
	}
	
	public static String shak2() throws IOException
	{
		String shak2 = null;
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader("C://311/PA1/PA1/PA1/src/shak2.txt"));
			StringBuffer stringBuffer = new StringBuffer();
			String line = null;
			char c; 

			while((line=bufferedReader.readLine())!=null)
			{
				line =line.toLowerCase();
				for(int i=0;i<line.length();i++)
				{
					c = line.charAt(i);
					if(Character.isLetterOrDigit(c)) 
					{
						stringBuffer.append(c);
					}
				}

			}
			shak2 = stringBuffer.toString();
			bufferedReader.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return shak2;
	}
}
