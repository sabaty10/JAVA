
public class Plane757 extends Plane implements InterfacePlane757{

	protected int wieght;

	public Plane757(int wieght,String name,int km,int age) {
		super();
		this.name = name;
		this.km=km;
		this.age=age;
		this.wieght = wieght;
	}

		@Override
		public String toString() {
			return super.toString()+
			 "Plane757 wieght is:" + wieght ;
	}
	
	//enter max wight on the main
	
	
	
	
}
