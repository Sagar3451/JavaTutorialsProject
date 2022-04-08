package opps;

class PC{
	
	private String State;
	
	
	public void setState(String state) {
		State=state;
	}
	
	public String getState() {
		return State;
	}
	
	
}

public class Encap {

	public static void main(String[] args) {
		PC pc = new PC();
		pc.setState("Karnataka");
		System.out.println(pc.getState());

	}

}
