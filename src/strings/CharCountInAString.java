package strings;

import java.util.HashMap;
import java.util.Map;

public class CharCountInAString {

	public static void main(String[] args) {
		String s= "I am a boy my name is vidyasagar and my age is so and so";
		Map<String, Integer> cntrMap = new HashMap<String, Integer>();
		
		s=s.replace(" ", "");
		System.out.println(s);
		for(int i=0; i<=s.length()-1; i++) {
			
			if(!cntrMap.containsKey(String.valueOf(s.charAt(i)))){
				cntrMap.put(String.valueOf(s.charAt(i)), 1);
			}else {
				cntrMap.replace(String.valueOf(s.charAt(i)), cntrMap.get(String.valueOf(s.charAt(i)))+1);
			}
		}
		
		System.out.println(cntrMap);

	}

}
