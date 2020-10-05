
public class Plane223 extends Plane{
	
	private char letter;

	public Plane223(char letter,String name,int km,int age) {
		super();
		this.name = name;
		this.km = km;
		this.age = age;
		this.letter = letter;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+
		 " letter is: " + letter;
	
}
}