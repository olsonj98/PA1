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

public class HashTable
{
	private HashFunction hashFunction;
	private ArrayList<Tuple>[] hashTable;
	private int distinctElements = 0;

	/*
	 * HashTable(int size) Finds the smallest prime integer p whose value is at least size. 
	 * Creates a hash table of size p where each cell initially is NULL. It will determine
	 * the hash function to be used in the hash table by creating the object new HashFunction(p).
	 */
	public HashTable(int size)
	{
		int p = findPrime(size);
		hashFunction = new HashFunction(p);
		hashTable = new ArrayList[p];
//		for(int i=0; i<hashTable.length; i++)
//		{
//			hashTable[i] = new ArrayList<Tuple>();
//			hashTable[i].add(null);
//		}	
	}

	/*
	 * maxLoad() Returns the maximum load of the hash table. Return type is int.
	 */
	public int maxLoad()
	{
		ArrayList<Tuple> maxLoad = hashTable[0];
		for(int i=1; i<hashTable.length; i++)
		{
			if(hashTable[i] != null && hashTable[i].size() >= maxLoad.size() || maxLoad == null)
			{
				maxLoad = hashTable[i];
			}
		}
		return maxLoad.size();
	}

	/*
	 * averageLoad() Returns the average load of the hash table. Return type is float.
	 */
	public float averageLoad()
	{
		// average size of chain/list (again, distinct elements) which equals total number of distinct tuple/number of non-empty lists.
		int avgLoad = 0;
		for(int i=1; i<hashTable.length; i++)// might need to be i=0
		{
			if(hashTable[i] != null)
			{
				avgLoad += hashTable[i].size();
			}
		}
		return avgLoad/hashTable.length;
	}

	/*
	 * size() returns the current size of the hash table. Return type is int.
	 */
	public int size()
	{
		return hashTable.length;
	}
	
	/*
	 * numElements() returns the number of distinct Tuples that are currently stored 
	 * in the hash table. Return type is int.
	 */
	public int numElements()
	{
		return distinctElements;
	}
	
	/*
	 * loadFactor() return the load factor which is numElements()/size(). Return type is float.
	 */
	public float loadFactor()
	{
		return numElements()/size();
	}

	/*
	 * add(Tuple t) Adds the tuple t to the hash table; places t in the list pointed by the 
	 * cell hash(t.getKey()) where hash is the hash function method from the class HashFunction.
	 * When the load factors becomes bigger than 0.7, then it (approximately) doubles the 
	 * size of the hash table and rehashes all the elements (tuples) to the new hash table.
	 * The size of the new hash table must be: Smallest prime integer whose value is at 
	 * least twice the current size. Return type is void.
	 */
	public void add(Tuple t)
	{
		int pos = hashFunction.hash(t.getKey());
		for(int i=0; i<hashTable.length; i++)
		{
			if(hashTable[i] != null)
			{
				int temp = hashFunction.hash(hashTable[i].get(0).getKey());
				if(temp == pos)
				{
					hashTable[i].add(t);
					break;
				}
			}
			else
			{
				hashTable[i] = new ArrayList<Tuple>();
				t.
				hashTable[i].add(t);
				break;
			}
		}
	}

	/*
	 * search(int k) returns an array list of Tuples (in the hash table) whose key equals k. 
	 * If no such Tuples exist, returns an empty list. Note that the type of this method
	 * must be ArrayList<Tuple>
	 */
	public ArrayList<Tuple> search(int k)
	{
		ArrayList<Tuple> result = new ArrayList<Tuple>();
		for(int i=0; i<hashTable.length; i++)
		{
			for(int j=0; j<hashTable[i].size(); j++)
			{
				if(k == hashTable[i].get(j).getKey())
				{
					result.add(hashTable[i].get(j));
				}
			}
		}
		return result;
	}

	/*
	 * search(Tuple t) returns the number of times Tuple t appears in the hash table. 
	 * Return type is int.
	 */
	public int search(Tuple t)
	{
		int result = 0;
		for(int i=0; i<hashTable.length; i++)
		{
			for(int j=0; j<hashTable[i].size(); j++)
			{
				if(hashTable[i].get(j) == t)//might need to compare key and value
				{
					result++;
				}
			}
		}
		return result;
	}

	/*
	 * remove(Tuple t) Removes one occurrence Tuple t from the hash table. 
	 * Return type is void.
	 */
	public void remove(Tuple t)
	{
//		for(int i=0; i<hashTable.length; i++)
//		{
//			for(int j=0;j<hashTable[i].size(); j++)
//			{
//				
//			}
//		}
	}
	
	/*
	 * Finds the first prime number greater than what is passed in.
	 * Copied over from HashFunction.
	 */
	private int findPrime(int n) 
	{
		boolean found = false;
		int num = n;
		while(!found) 
		{
			if (isPrime(num))
			{
				return num;
			}
			num++;
		}
		return -1;
		
	}
	
	/*
	 * Checks to see if the number is passed in.
	 * Copied over from HashFunction.
	 */
	private boolean isPrime(int n) 
	{
		for(int i= 2; i<=Math.sqrt(n); i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	/*
	 * prints out the contents of the table when called
	 */
	public void printTable()
	{
		for(int i=0; i<hashTable.length; i++)
		{
			for(int j=0; j<hashTable[i].size(); j++)
			{
				System.out.println("Table spot: " + i + " Tuple: " + hashTable[i].get(j));
			}
		}
	}
}