class MarkerDriver
{
	public static void main(String[] args) 
	{
		Marker m1 = new Marker("thin","red",15.0, "camel", "permenat");

		m1.displayMarker();

		System.out.println("---------------------------------------------");

		Marker m2 = new Marker("thick", "blue" , 30.0, "camel", "temporary");
		m2.displayMarker();
		
	}
}