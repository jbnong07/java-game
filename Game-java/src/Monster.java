
public class Monster extends Stat{
	
	private String name;
	
	public Monster(String name, int lv, int hp, int att)
	{
		super.lv = lv;
		super.hp = hp;
		super.att = att;
		this.name = name;
	}
	
	public boolean hunt(Player player)
	{
		int hp = player.getHp();
		System.out.println(hp);
		return true;
	}

}
