import java.util.Scanner;

public  class AirFactory {

	Scanner input =new Scanner(System.in);
private String model;	
private String name;
private int km;
private int age;
private int weight;
private char letter;
	
	public Plane makeAir(String model)
	{
		System.out.println("Enter name of the plane");
		name = input.nextLine();
		
		System.out.println("Enter km");
		km = intput.nextInt();
		
		System.out.println("enter age");
		age = input.nextInt();
		
		
		
		if(model.equals("Plane747"))
		{
			Plane747 p747 = new Plane747(name,km,age);
			System.out.println("Plane747 was build");
			return p747;
		}
		
		else if (model.equals("Plane757"))
		{
			System.out.println("enter weight");
			weight = input.nextInt();
			Plane757 p757= new Plane757(weight , name , km, age) ;
			System.out.println("Plane757 was build");
			return p757;
		}
		
		else if (model.equals("Plane223"))
		{
			System.out.println("Enter letter");
			letter = input.nextline().charAt(0);
			Plane223 p223 = new Plane223(letter, model, km, age);
			System.out.println("Plane223 was build");
			return p223;
		}
	
		else
		{System.out.println("enter weight");
		weight = input.nextInt();
			AirForceOne airforce = new AirForceOne(name, km, age, weight);
			System.out.println("AirForceOne was build");
			return airforce;
		}
	
	
	}
	

}
