import java.util.ArrayList;

// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

/**
* @author Tyler McAnally, Jeff Olson, Kevin Mathes
*/

public class HashStringSimilarity
{
	private ArrayList<String> S = new ArrayList<String>();
	private ArrayList<String> T = new ArrayList<String>();
	
	/*
	 * HashStringSimilarity(String s1, String s2, int sLength). sLength is the shingle length
	 * that should be used to compute the similarity between strings s1 and s2. You may assume 
	 * that the strings are pre-processed. I.e, all punctuation symbols, white spaces are 
	 * removed and all letters are in lowercase.
	 */
	public HashStringSimilarity(String s1, String s2, int sLength)
	{
		S = Helpers.getHashShingles(s1,sLength);
		T = Helpers.getHashShingles(s2,sLength);
		
	}

	/*
	 * lengthOfS1() This method returns the V ectorLength of S. Type of this method must be float.
	 */
	public float lengthOfS1()
	{
		return Helpers.getVectorLength(S);
	}

	/*
	 * lengthOfS2() This method returns the V ectorLength of T. Type of this method must be float.
	 */
	public float lengthOfS2()
	{
		return Helpers.getVectorLength(T);
	}

	/*
	 * similarity() This method returns Similarity(S, T). Type of this method must be float.
	 */
	public float similarity()
	{
		return Helpers.getSimilarity(S, T, lengthOfS1(), lengthOfS2());
	}
	
}