
public class Getting {
	private static Player player = Player.getIns();
	
	public void getExp(int m_exp)
	{
		System.out.println("You get " + m_exp + " exp");
		player.setExp(m_exp);
		
	}
}
