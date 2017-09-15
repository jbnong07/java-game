import java.util.Scanner;

public class Mine {
	private static Scanner in = new Scanner(System.in);
	
	public int mine()
	{
		System.out.println("Selcect stage[1 ~ 10]");
		System.out.print("Stage : ");
		int stage = in.nextInt();
		in.nextLine();
		
		System.out.println("Press enter!!");
		System.out.println("If wanna end - input exit");
		
		int i = 0;
		
		for(i = 0 ; i < (stage * 10) ; i++)
		{
			String press = in.nextLine();
			
			if(press.equals("exit") || press.equals("Exit"))
			{
				break;
			}
			
			for(int j = 0 ; j < i / stage ; j++)
			{
				System.out.print("¡Ü");
			}
			
			for(int k = 0 ; k < 10 - (i / stage) ; k++)
			{
				System.out.print("¡Û");
			}
		}
		
		if(i == (stage * 10))
		{	
			System.out.println();
			System.out.println("¡Ü¡Ü¡Ü¡Ü¡Ü¡Ü¡Ü¡Ü¡Ü¡Ü");
			System.out.println("You success! ");
			System.out.println("Mine exit");
			return (stage * 100);
		}
		
		
		{
			System.out.println();
			System.out.println("Mine exit");
			System.out.println();
			return 0;
		}
		
	}
}
