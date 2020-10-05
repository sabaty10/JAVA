
public class AirForceOne extends Plane implements InterfacePlane747,InterfacePlane757{
	
	private Plane747 p747;
	private Plane757 p757;
	
	
	public AirForceOne(String name,int km,int age,int wieght) {
		super();
		Plane747 p747 = new Plane747(name, km, age);
		Plane757 p757 = new Plane757(wieght, name, km, age);
	}
	
	
	@Override
	public String toString() {
		return super.toString()
				+ "weight is:" + p757.wieght
				+ "high is: " + p747.high;
				
		

}
}