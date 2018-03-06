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

public class HashCodeSimilarity
{
	private HashTable S;
	private HashTable T;

	public HashCodeSimilarity(String s1, String s2, int sLength)
	{
		S = getShingles(s1, sLength);
		T = getShingles(s2, sLength);
	}

	public float lengthOfS1()
	{
		return getVectorLength(S);
	}

	public float lengthOfS2()
	{
		return getVectorLength(T);
	}

	public float similarity()
	{
		return -1;
	}
	
	public static HashTable getShingles(String s, int shinLength) {
		HashTable shingles = new HashTable(5);	// will eventually change the size of hashtable
		for (int i = 0; i <= s.length() - shinLength; i++){
			int hashVal = 5;	// not sure which hash function to call
			Tuple t = new Tuple(hashVal, s.substring(i, i + shinLength));
			shingles.add(t);
		}
		return shingles;
	}
	
	public static float getVectorLength(HashTable l) {
		ArrayList<String> checked = new ArrayList<String>();
		int sum = 0;
		int f = 0;
		for (int i = 0; i < l.size(); i++) {
//			f = function(l, checked, l.get(i));
//			sum += f * f;
		}
		return (float) Math.sqrt(sum);
	}
	
	public static int function(ArrayList<String> list, ArrayList<String> checked, String elt) {
		int f = 0;
		for (int j = 0; j < list.size(); j++) {
			String a = elt;
			String b = list.get(j);
			if (!checked.contains(elt) && a.equals(b))
				f += 1;
		}
		if (!checked.contains(elt)) 
			checked.add(elt);
		return f;
	}
}