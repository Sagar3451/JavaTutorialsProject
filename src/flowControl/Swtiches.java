package flowControl;

public class Swtiches {

	public static void main(String[] args) {
		
		System.out.println(findDayForaGivenNumber(99));
	}
	
	public static String findDayForaGivenNumber( int num) {
		String Day="";
		
		switch(num) {
		
		case 1:
			Day="Sunday";
		break;
		
		case 2:
			Day="Monday";
		break;
		
		case 3:
			Day="Tuesday";
		break;
		
		case 4:
			Day="Wednesday";
		break;
		
		case 5:
			Day="Thursday";
		break;
		
		case 6:
			Day="Friday";
		break;
		
		case 7:
			Day="Saturday";
		break;
		
		default:
			Day ="Not Defined";
		
		
		}
		
		return Day;
			
		
		
	}

}
