import java.util.LinkedList;


public class Test {
	public static void main(String[] args) {
		
		// HashTable tests
		HashTable table = new HashTable(5);
		
		table.add(new Tuple(4, "hello"));
		table.add(new Tuple(8, "world"));
		table.add(new Tuple(2, "tiger"));
		table.add(new Tuple(7, "frog"));
		table.add(new Tuple(15, "deer"));
		table.add(new Tuple(3, "dino"));
		table.add(new Tuple(21, "ferret"));
		
		System.out.println("Hash Table:\n");
		Helpers.printTable(table);
		System.out.println();
		System.out.println("Number of entries in table: " + table.numElements());
		System.out.println("Maxload: " + table.maxLoad());
		System.out.println("Avg. load: " + table.averageLoad());
		System.out.println("Load factor: " + table.loadFactor() + "\n");
		
		
		// BruteForceSimilarity test
		// Example from project description
		String m = "1268264612";
		String n = "251188438";
		int size = 1;
		long bRuntime;
		BruteForceSimilarity brute = new BruteForceSimilarity(m, n, size);
		System.out.println("BruteForceSimilarity:");
		System.out.println("VectorLength(S) = " + brute.lengthOfS1());
		System.out.println("VectorLength(T) = " + brute.lengthOfS2());
		System.out.println("Similarity: " + brute.similarity());
		bRuntime = brute.runtime();
		System.out.println("Brute Force Runtime: ~" + bRuntime + " nanoseconds");
		System.out.println();
		
		
		// HashStringSimiliarty test
		// Example from project description
		String num1 = "1268264612";
		String num2 = "251188438";
		int shingleLength = 1;
		long hRuntime;
		HashStringSimilarity h = new HashStringSimilarity(num1, num2, shingleLength);
		System.out.println("HashStringSimilarity:");
		System.out.println("VectorLength(S) = " + h.lengthOfS1());
		System.out.println("VectorLength(T) = " + h.lengthOfS2());
		System.out.println("Similarity: " + h.similarity());
		hRuntime = h.runtime();
		System.out.println("Hash Code Runtime: ~" + hRuntime + " nanoseconds");
		System.out.println();
		
		
		System.out.println("\tUsing same strings for BruteForceSimilarity\n" +
						   "\tand HashStringSimilarity above, you can see\n" + 
						   "\tthat the runtime for HashStringSimilarity is\n" +
						   "\tfaster with the same shingle length.\n" + 
						   "\t~" + hRuntime + " ns < ~" + bRuntime + " ns\n");
		
		
		// HashStringSimiliarty test
		// Example from project description
		String a = "aroseisaroseisarose";
		String b = "aroseisaflowerwhichisarose";
		int shinLength = 1;
		long h2Runtime;
		HashStringSimilarity h2 = new HashStringSimilarity(a, b, shinLength);
		System.out.println("HashStringSimilarity:");
		System.out.println("VectorLength(S) = " + h2.lengthOfS1());
		System.out.println("VectorLength(T) = " + h2.lengthOfS2());
		System.out.println("Similarity: " + h2.similarity());
		h2Runtime = h2.runtime();
		System.out.println("Hash Code Runtime: ~" + h2Runtime + " nanoseconds");
		System.out.println();
		
		
		// HashCodeSimilarity test	
		// Example from project description
		String x = "aroseisaroseisarose";
		String y = "aroseisaflowerwhichisarose";
		int k = 4;
		long cRuntime;
		HashCodeSimilarity hss = new HashCodeSimilarity(x, y, k);
		System.out.println("HashCodeSimilarity:");
		System.out.println("VectorLength(S) = " + hss.lengthOfS1());
		System.out.println("VectorLength(T) = " + hss.lengthOfS2());
		System.out.println("Similarity: " + hss.similarity());
		cRuntime = hss.runtime();
		System.out.println("Hash Code Runtime: ~" + cRuntime + " nanoseconds\n");
		
		System.out.println("\tUsing same strings for HashStringSimilarity\n" +
				   "\tand HashCodeSimilarity above, you can see\n" + 
				   "\tthat the runtime for HashCodeSimilarity is\n" +
				   "\tfaster since they have different shingle sizes.\n" + 
				   "\t~" + cRuntime + " ns < ~" + h2Runtime + " ns");
		
		// If you wanted to test these classes with the HashTable,
		// just search the HashTable for the tuples, get their 
		// values and pass them into these classes to get similarity.
	}
}
