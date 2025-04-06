class Test
{
	static int a = 100;
	 char k ='A';


    Test()
    {
    	System.out.println("from constructor");

    }
    
	 static
	 {
	 	System.out.println("from static block 1");
	 }

	 static 
	 {
	 	System.out.println("from static block 2");
	 }

	 {
	 	System.out.println("from non static block 1");
	 }


	 {
	 	System.out.println("from non static block 2 ");
	 }

}