package opps;

public class PlanActionImplementation implements Plan1And2{

	public static void main(String[] args) {
		
		PlanActionImplementation pai = new PlanActionImplementation();
		pai.roll();
		pai.walk();
		pai.run();
		
		System.out.println(pai.rollspeed(1));
		System.out.println(pai.walkspeed(5));
		System.out.println(pai.runspeed(10));
	}

	@Override
	public void walk() {
		System.out.println("Start Walking..!");
		
	}

	@Override
	public void run() {
		System.out.println("Start Running..!");
		
	}

	@Override
	public void roll() {
		System.out.println("Start Rolling..!");
		
	}

	
	@Override
	public int walkspeed(int walkspeed) {
		// TODO Auto-generated method stub
		return walkspeed;
	}

	@Override
	public int runspeed(int runspeed) {
		// TODO Auto-generated method stub
		return runspeed;
	}

	@Override
	public int rollspeed(int rollspeed) {
		// TODO Auto-generated method stub
		return rollspeed;
	}

}
