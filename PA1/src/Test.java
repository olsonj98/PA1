
public class Test {
	public static void main(String[] args) {
		String s1 = "abca";
		String s2 = "efghi";
		String num1 = "1268264612";
		String num2 = "251188438";
		int shingleLength = 1;
		//BruteForceSimilarity b = new BruteForceSimilarity(num1, num2, shingleLength);
		//System.out.println("VectorLength(S) = " + b.lengthOfS1());
		//System.out.println("VectorLength(T) = " + b.lengthOfS2());
		//System.out.println(b.similarity());
		HashTable h = new HashTable(10);
		Tuple t = new Tuple(1,"your");
		Tuple z = new Tuple(2,"mom");
		Tuple m = new Tuple(3,"gay");
		h.add(t);
		h.add(z);
		h.add(m);
		//h.printTable();
		//walk through these with debugger to see if they work
		//h.search(3);
		//h.search(t);
	}
}
