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

public class BruteForceSimilarity
{
	private ArrayList<String> S = new ArrayList<String>();
	private ArrayList<String> T = new ArrayList<String>();

	public BruteForceSimilarity(String s1, String s2, int sLength)
	{
		S = getShingles(s1, sLength);
		T = getShingles(s2, sLength);
		printArrayList(S);
		printArrayList(T);
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
		ArrayList<String> union = union(S, T);
		ArrayList<String> checked1 = new ArrayList<String>();
		ArrayList<String> checked2 = new ArrayList<String>();
		float similarity;
		int sum = 0;
		int f1 = 0, f2 = 0;
		for (int i = 0; i < union.size(); i++) {
			f1 = function(S, checked1, union.get(i));
			f2 = function(T, checked2, union.get(i));
			sum += f1 * f2;
		}
		similarity = sum / (lengthOfS1() * lengthOfS2());
		return similarity;
	}
	
	public static ArrayList<String> getShingles(String s, int shinLength) {
		ArrayList<String> shingles = new ArrayList<String>();
		for (int i = 0; i <= s.length() - shinLength; i++)
			shingles.add(s.substring(i, i + shinLength));
		return shingles;
	}
	
	public static void printArrayList(ArrayList<String> arr) {
		System.out.print("{");
		for (int j = 0; j < arr.size(); j++)
			if (j != arr.size() - 1)
				System.out.print(arr.get(j) + ", ");
			else
				System.out.println(arr.get(j) + "}");
	}
	
	public static float getVectorLength(ArrayList<String> l) {
		ArrayList<String> checked = new ArrayList<String>();
		int sum = 0;
		int f = 0;
		for (int i = 0; i < l.size(); i++) {
			f = function(l, checked, l.get(i));
			sum += f * f;
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
	
	public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> union = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++)
			if (!union.contains(list1.get(i)))
				union.add(list1.get(i));
		for (int i = 0; i < list2.size(); i++)
			if (!union.contains(list2.get(i)))
				union.add(list2.get(i));
		return union;
	}
	
}