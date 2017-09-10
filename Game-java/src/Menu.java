import java.util.Scanner;

public class Menu {
	private static Scanner in = new Scanner(System.in);
	
	public int menu_3(String one, String two, String three)
	{
		System.out.println("== Menu ==");
		System.out.println("1. " + one);
		System.out.println("2. " + two);
		System.out.println("3. " + three);
		System.out.print("ans : ");
		int ans = in.nextInt();
		in.nextLine();
		
		System.out.println();
		
		return ans;
	}
	
	public int menu_4(String one, String two, String three, String four)
	{
		System.out.println("== Menu ==");
		System.out.println("1. " + one);
		System.out.println("2. " + two);
		System.out.println("3. " + three);
		System.out.println("4. " + four);
		System.out.print("ans : ");
		int ans = in.nextInt();
		in.nextLine();
		
		System.out.println();
		
		return ans;
	}
	
	public int retry()
	{
		System.out.println("Retry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print("ans : ");
		int ans = in.nextInt();
		in.nextLine();
		
		System.out.println();
		
		return ans;
	}
}
