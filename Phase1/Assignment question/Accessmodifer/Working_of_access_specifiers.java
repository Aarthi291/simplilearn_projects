package Accessmodifer;

public class Working_of_access_specifiers {
	public static int a=10;
	protected static int b=20;
	static int c=30;
	private static int d=40;
	
	public static void valuea()
	{
		System.out.println(a);
	}
	protected static void valueb()
	{
		System.out.println(b);
	}
	 static void valuec()
	{
		System.out.println(c);
	}
	private static void valued()
	{
		System.out.println(d);
	}
	 public static void main(String[] args)
	 {
		 valuea();
		 valueb();
		 valuec();
		 valued();
		 
	 }

}
