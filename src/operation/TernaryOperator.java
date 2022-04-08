package operation;

public class TernaryOperator {

	public static void main(String[] args) {
		int n1=5, n2=10;
		String res,res1;
		
		res=(n1<n2)? "n2 is greater" : "n1 is greater";
		res1=(n1<n2)? "If true Left statement is executed" : "If false right statement is executed";
		
		System.out.println(res);
		System.out.println(res1);
	}

}
