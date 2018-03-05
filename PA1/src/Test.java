
public class Test {
	public static void main(String[] args) {
		String s1 = "abca";
		String s2 = "efghi";
		String num1 = "1268264612";
		String num2 = "251188438";
		int shingleLength = 1;
		BruteForceSimilarity b = new BruteForceSimilarity(num1, num2, shingleLength);
		System.out.println("VectorLength(S) = " + b.lengthOfS1());
		System.out.println("VectorLength(T) = " + b.lengthOfS2());
		System.out.println(b.similarity());
	}
}
