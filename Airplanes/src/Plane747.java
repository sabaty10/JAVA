
public class Plane747 extends Plane implements InterfacePlane747{

	protected int high;
	
	

	public Plane747(String name,int km,int age) {
		super();
		this.name = name;
		this.km=km;
		this.age=age;
		if(age >0 && age <10)
			this.high=35000;
		else if (age>10)
			this.high = 25000;
	}



	@Override
	public String toString() {
		return super.toString()+
		 "Plane747 high=" + high ;
	}
	
	
	
	
	
	
}
