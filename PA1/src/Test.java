import java.util.LinkedList;


public class Test {
	public static void main(String[] args) {
		// BruteForceSimilarity tests
//		String s1 = "abca";
//		String s2 = "efghi";
//		String num1 = "1268264612";
//		String num2 = "251188438";
//		int shingleLength = 1;
		
//		BruteForceSimilarity b = new BruteForceSimilarity(num1, num2, shingleLength);
//		System.out.println("VectorLength(S) = " + b.lengthOfS1());
//		System.out.println("VectorLength(T) = " + b.lengthOfS2());
//		System.out.println("Similarity: " + b.similarity());
		
		// HashTable tests
//		HashTable table = new HashTable(5);
//		
//		Tuple hello = new Tuple(4, "hello");
//		table.add(hello);
//		table.add(new Tuple(8, "world"));
//		table.add(new Tuple(2, "tiger"));
//		table.add(new Tuple(7, "frog"));
//		table.add(new Tuple(15, "deer"));
//		table.add(new Tuple(3, "dino"));
//		table.add(new Tuple(21, "ferret"));
//		
//		//table.add(new Tuple(1, "deer"));
//		
//		System.out.println("Number of entries in table: " + table.numElements());
//		System.out.println("Maxload: " + table.maxLoad());
//		System.out.println("Avg. load: " + table.averageLoad());
//		System.out.println("Load factor: " + table.loadFactor());
//		Helpers.printTable(table);
//		System.out.println();
//		System.out.println("Tuple (4:hello) removed");
//		table.remove(hello);
//		Helpers.printTable(table);
		
		// Example for project description
		String x = "aroseisaroseisarose";
		String y = "aroseisaflowerwhichisarose";
		int k = 4;
		HashStringSimilarity hss = new HashStringSimilarity(x, y, k);
		System.out.println("VectorLength(S) = " + hss.lengthOfS1());
		System.out.println("VectorLength(T) = " + hss.lengthOfS2());
		System.out.println("Similarity should be ~0.686");
		System.out.println("Similarity: " + hss.similarity());

		// Couldn't delete it
		//Tuple t = new Tuple(1,"your");
		//Tuple z = new Tuple(2,"mom");
		//Tuple m = new Tuple(3,"gay");
	}
}
