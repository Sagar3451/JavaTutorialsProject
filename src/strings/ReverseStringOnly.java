package strings;

public class ReverseStringOnly {

	public static void main(String[] args) {
		
		String s = "ghg3gg445bhg6&^5hj(*jhi76%^^";
		int l = s.length();
		String fs = "";
		for(int i=l-1;i>=0;i--) {

			if((s.charAt(i)>=65 && s.charAt(i)<=90) 
					||(s.charAt(i)>=97 && s.charAt(i)<=122)) {
				fs+=(s.charAt(i));				
			}
		}	

		System.out.println(fs);
	}

}
