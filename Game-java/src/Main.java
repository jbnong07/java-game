
public class Main {
	
	private static Player player = new Player();
	private static Monster[] monster = new Monster[5];
	private static Menu menu = new Menu();
	private static Getting getting = new Getting();
	private static LvUp lvup = new LvUp();
	private static Mine mine = new Mine();
	
	public static void main(String args[])
	{
		monster[0] = new Monster("Slime", 1, 10, 0, 10);
		monster[1] = new Monster("Mush", 2, 50, 1, 20);
		
		player.join();
		
		player.login();
		
		while(true)
		{
			int menu_num = menu.menu_5("Hunt", "Mine", "Stat", "Reinforcement", "Exit");
						
			if(menu_num == 1)
			{
				menu1:
				while(true)
				{
					int m_lv = monster[0].mobLv();
					
					boolean hunt = monster[m_lv].hunt(player);
					
					if(hunt == true)
					{
						int get_exp = monster[m_lv].getExp();
						getting.getExp(get_exp, player);
						
						boolean lv_up = lvup.checkLvUp(player);
						
						if(lv_up == true)
						{
							lvup.lvUp(player);
						}
					}
					
					else if(hunt == false)
					{
						int lose_exp = monster[m_lv].getExp();
						getting.loseExp(lose_exp, player);
					}
					
					int menu_ans = menu.retry();
					
					if(menu_ans == 1)
					{
						continue menu1;
					}
					
					else 
					{
						break;
					}
				}
			} //Hunt end
			
			else if(menu_num == 2)
			{
				menu2:
				while(true)
				{
					getting.getGold(mine.mine(), player);
					
					int menu_ans = menu.retry();
					
					if(menu_ans == 1)
					{
						continue menu2;
					}
					
					else 
					{
						break;
					}
				}
			}
			
			else if(menu_num == 3)
			{
				
			}
			
			else if(menu_num == 4)
			{
				
			}
			
			else if(menu_num == 5)
			{
				break;
			}
			
			else
			{
				System.out.println("Select in menu");
				continue;
			}
		}
	}
}
