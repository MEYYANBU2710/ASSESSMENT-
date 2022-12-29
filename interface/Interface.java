interface func{
	static void display()
	{
			System.out.println("This collection of books is in the catalouge of the library");
	}
	void arrays(String[] books);
}
class Main{
	public static void main(String...args)
	{
			String coelho[]={"Alchemist","Brida","Zahir","Veronica"};
			func.display();
			func o=(String[] books)->{
				for(String x:books)
				{
					System.out.println(x);
				}
			};
			o.arrays(coelho);
	}
}