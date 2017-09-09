
public class Main {
	
	private static Player player = Player.getIns();
	private static Monster[] monster = new Monster[5];
	private static Menu menu = new Menu();
	private static Getting getting = new Getting();
	
	public static void main(String args[])
	{
		monster[0] = new Monster("Slime", 1, 10, 0, 10);
		monster[1] = new Monster("Mush", 2, 50, 1, 20);
		
		player.join();
		
		player.login();
		
		while(true)
		{
			int menu_num = menu.menu_4("Hunt", "Stat", "Reinforcement", "Exit");
						
			if(menu_num == 1)
			{
				
				int m_lv = monster[0].mobLv();
				
				boolean hunt = monster[m_lv].hunt(player);
				
				if(hunt == true)
				{
					int get_exp = monster[m_lv].getExp();
					getting.exp(get_exp, player);
				}
			}
			
			else if(menu_num == 2)
			{
				
			}
			
			else if(menu_num == 3)
			{
				
			}
			
			else if(menu_num == 4)
			{
				break;
			}
		}
	}
}
