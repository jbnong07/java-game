
public class Getting {
	
	public void getExp(int m_exp, Player player)
	{
		System.out.println("You get " + m_exp + " exp");
		player.setExp(m_exp);
		System.out.println();
		
	}
	
	public void loseExp(int m_exp, Player player)
	{
		System.out.println("You lose " + m_exp + "exp");
		player.setExp(-1 * m_exp);
		
		if(player.getExp() <= 0)
		{
			player.setExp(0);
		}
		
		System.out.println();
	}
	
	public void getGold(int gold, Player player)
	{
		System.out.println("You get " + gold + "gold");
		player.setGold(gold);
		
		System.out.println(2);
		
	}
}
