package tutorial;
import java.util.Scanner;
public class CreateSpaServices {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
	SpaService firstService = new SpaService();
	SpaService secondService = new SpaService();;
	firstService = getData(firstService);
	secondService = getData(secondService);
	System.out.println("First service details:");
	System.out.println(firstService.getServiceDescripton() + "$" + firstService.getPrice());
	System.out.println("Second service details:");
	System.out.println(secondService.getServiceDescription() + "$" + secondService.getPrice());
		}
	public static SpaService getData(SpaServices)
	{
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter service>>");
		servie = keyboard.nextLine();
		System.out.println("Enter price>>");
		priuce = keyboard.nextDouble();
		keyboard.nextLine();
		S.setServiceDescription(service);
		s.setPrice(Price);
		
		return S;
		
	
	}
	
	

}
