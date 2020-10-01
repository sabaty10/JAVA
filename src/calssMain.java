import java.security.Key;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class calssMain {

	public static void main(String[] args) {
	 String model;
	 Plane p;
	
	 Random Key= new Random();
	 Hashtable<Key, Plane> table = new Hashtable<>();
	 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter model name");
		model = scanner.nextLine();
		
		p = makeAir(model);
		
		table.compute(key, p);
		
		
		System.out.println(p.toString());
				
	}

}
