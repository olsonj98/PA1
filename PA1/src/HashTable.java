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

public class HashTable
{
	// member fields and other member methods
	private HashFunction hashFunction;

	public HashTable(int size)
	{
		hashFunction = new HashFunction(size);
	}

	public int maxLoad()
	{
		return -1;
	}

	public float averageLoad()
	{
		return -1;
	}

	public int size()
	{
		return -1;
	}

	public int numElements()
	{
		return -1;
	}

	public float loadFactor()
	{
		return -1;
	}

	public void add(Tuple t)
	{
		// implementation
	}

	public ArrayList<Tuple> search(int k)
	{
		return null;
	}

	public int search(Tuple t)
	{
		return -1;
	}

	public void remove(Tuple t)
	{
		// implementation		
	}
}