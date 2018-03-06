import java.util.ArrayList;

// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

/**
* @author Hugh Potter
*/

public class HashStringSimilarity
{
	private HashTable T;
	private HashTable S;
	

	public HashStringSimilarity(String s1, String s2, int sLength)
	{
		T = getShingles(s1,sLength);
		S = getShingles(s2,sLength);
		
	}

	public float lengthOfS1()
	{
		return -1;
	}

	public float lengthOfS2()
	{
		return -1;
	}

	public float similarity()
	{
		return -1;
	}
	
	public static HashTable getShingles(String s, int shinLength) 
	{
		ArrayList<String> shingles = new ArrayList<String>();
		for(int i=0; i<=s.length()-shinLength; i++)
		{
			shingles.add(s.substring(i, i + shinLength));
		}
		return addToTable(shingles);
	}
	
	public static HashTable addToTable(ArrayList<String> s)
	{
		HashTable shingles = new HashTable(s.size());
		Tuple t;
		//for each element in the array list, make a tuple out of it, 
		//then add it to the hash table
		//I think it has to be done this way but I am not sure
		return shingles;
	}
}