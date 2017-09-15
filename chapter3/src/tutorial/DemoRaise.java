package tutorial;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary1;
		
		System.out.println("Demonstrating some raises");
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("What is your salary?");
		salary1 = input.nextDouble
		predictRaise(salary1);
		
	}	
		public static void predictRaise(double salary)
		{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary +" After raise" + newSalary);
		}
		
	

}
