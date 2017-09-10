
public class Getting {
	private static Player player = Player.getIns();
	
	public void getExp(int m_exp)
	{
		System.out.println("You get " + m_exp + " exp");
		player.setExp(m_exp);
		System.out.println();
		
	}
	
	public void loseExp(int m_exp)
	{
		System.out.println("You lose " + m_exp + "exp");
		player.setExp(-1 * m_exp);
		
		if(player.getExp() <= 0)
		{
			player.setExp(0);
		}
		
		System.out.println();
	}
}
