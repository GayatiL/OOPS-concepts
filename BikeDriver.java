class BikeDriver
{
	public static void main(String[] args) 
	{
		
		Bike b1 = new Bike();

		b1.name="Activa";
		b1.brand = "honda";
		b1.price = 150000;
		b1.engine = 100;
		b1.mileage = 60;

		b1.displayBike();
	}
}