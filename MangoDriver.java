class MangoDriver

{
	public static void main(String[] args)
	{
		Mango m1 = new Mango();

		m1.type="alphanzo";
		m1.price = 1000.00;
		m1.place ="ratnagiri";

		m1.displayType().displayPrice().displayPlace();

	}
}