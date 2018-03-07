// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

/**
* @author Hugh Potter
*/

public class Tuple
{
	// member fields and other member methods
	private int key;
	private String value;

	public Tuple(int keyP, String valueP)
	{
		key = keyP;
		value = valueP;
	}

	public int getKey()
	{
		return key;
	}

	public String getValue()
	{
		return value;
	}

	public boolean equals(Tuple t)
	{
		if (this.getKey() == t.getKey() && this.getValue() == t.getValue())
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "(" + getKey() + ":" + getValue() + ")";
	}
}