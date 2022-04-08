package operation;

public class BitwiseOperation {

	public static void main(String[] args) {
		int a=12, b=20;
		
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));

	}

}
