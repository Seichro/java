package switch_vars;

public class Main {
	public static void main(String[] args)
	{
	String x = "water";
	String y = "cool-aid";
	
	System.out.println("Strings before swap:");
	System.out.println(x);
	System.out.println(y);
	String temp = x;
	x = y;
	y = temp;
	
	System.out.println("\nStrings after swap:");
	System.out.println(x);
	System.out.println(y);
	
	}
}
