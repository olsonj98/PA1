import java.util.ArrayList;
import java.util.LinkedList;

/**
* @author Tyler McAnally, Jeff Olson, Kevin Mathes
*/

/*
 * Class of static helper methods
 */
public class Helpers {

	/*
	 * calculates the union between two arrays
	 */
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
	
	/*
	 * Function f in project description
	 * Number of times string elt appears in multi-set list
	 */
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
	
	/*
	 * calculates the vector length of an array
	 */
	public static float getVectorLength(ArrayList<String> l) {
		ArrayList<String> checked = new ArrayList<String>();
		int sum = 0;
		int f = 0;
		for (int i = 0; i < l.size(); i++) {
			f = Helpers.function(l, checked, l.get(i));
			sum += f * f;
		}
		return (float) Math.sqrt(sum);
	}
	
	/*
	 * prints out the array for testing
	 */
	public static void printArrayList(ArrayList<String> arr) {
		System.out.print("{");
		for (int j = 0; j < arr.size(); j++)
			if (j != arr.size() - 1)
				System.out.print(arr.get(j) + ", ");
			else
				System.out.println(arr.get(j) + "}");
	}
	
	/*
	 * seperates the shingles and returns them
	 */
	public static ArrayList<String> getShingles(String s, int shinLength) {
		ArrayList<String> shingles = new ArrayList<String>();
		for (int i = 0; i <= s.length() - shinLength; i++)
			shingles.add(s.substring(i, i + shinLength));
		return shingles;
	}
	
	/*
	 * Used by remove to delete first instance 
	 * of Tuple t.
	 */
	public static LinkedList<Tuple> removeTuple(LinkedList<Tuple> list, Tuple t) {
		if (list == null || list.size() < 1)
			return null;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).hashCode() == t.hashCode()) {
				list.remove(i);
				break;
			}
		return list;
	}
	
	/*
	 * Finds the first prime number greater than what is passed in.
	 * Copied over from HashFunction since it isn't public.
	 */
	public static int findPrime(int n) {
		boolean found = false;
		int num = n;
		while(!found) {
			if (isPrime(num))
				return num;
			num++;
		}
		return -1;
	}
	
	/*
	 * Checks to see if the number is passed in.
	 * Copied over from HashFunction since it isn't public.
	 */
	public static boolean isPrime(int n) {
		for(int i= 2; i<=Math.sqrt(n); i++)
			if (n%i==0)
				return false;
		return true;
	}
	
	/*
	 * returns true if ArrayList of ints contains Tuple t
	 * used by
	 */
	public static boolean containsTuple(ArrayList<Tuple> arr, Tuple t) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).hashCode() == t.hashCode())
				return true;
		}
		return false;
	}
	
	/*
	 * prints out the contents of the table when called
	 */
	public static void printTable(HashTable hashTable) {
		for (int i = 0; i < hashTable.table.length; i++) {
			System.out.print("List " + i + ": ");
			LinkedList<Tuple> list = hashTable.table[i];
			for (int j = 0; j < list.size(); j++)
				if (list.get(j) != null) 
					System.out.print(list.get(j).toString() + " ");
			System.out.println();
		}
		
	}
	
}
