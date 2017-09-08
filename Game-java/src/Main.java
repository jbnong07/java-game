
public class Main {
	
	private static Player player = new Player();
	private static Monster[] monster = new Monster[5];
	
	public static void main(String args[])
	{
		monster[0] = new Monster("Slime", 1, 10, 0, 10);
		monster[1] = new Monster("Mush", 2, 50, 1, 20);
		
		player.join();
		
		int m_lv = 1;
		boolean hunt = monster[m_lv].hunt(player);
		
		if(hunt == true)
		{
		}
	}
}
