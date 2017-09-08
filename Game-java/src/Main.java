
public class Main {
	
	private static Player player = new Player();
	private static Monster[] monster = new Monster[5];
	
	public static void main(String args[])
	{
		monster[0] = new Monster("Slime", 1, 10, 0, 10);
		monster[1] = new Monster("Mush", 2, 50, 1, 20);
		
		player.join();
		
		player.login();
		
		while(true)
		{
			System.out.println("== Menu ==");
			System.out.println("1. Hunt");
			System.out.println("2. Stat");
			System.out.println("3.Reinforcement");
			System.out.println("Exit");
			
			int m_lv = 1;
			boolean hunt = monster[m_lv].hunt(player);
			
			if(hunt == true)
			{
			}
		}
	}
}
