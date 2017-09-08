import java.util.Scanner;
import java.util.Random;

public class Monster extends Stat{
	
	private String name;
	private static Scanner in = new Scanner(System.in);
	private static Random ran = new Random();
	
	public Monster(String name, int lv, int hp, int att, int exp)
	{
		super.lv = lv;
		super.hp = hp;
		super.att = att;
		super.exp = exp;
		this.name = name;
	}
	
	public boolean hunt(Player player)
	{
		int p_hp = player.getHp();
		int p_att = player.getAtt();
		
		int m_hp = super.hp;
		int m_att = super.att;
		
		while(true)
		{
			System.out.println("Select Action");
			System.out.println("1. Attack");
			System.out.println("2. Run");
			System.out.print("ans : ");
			int ans = in.nextInt();
			System.out.println();
			
			if(ans == 1)
			{
				int tmp_p_att = p_att + (p_att * ran.nextInt(3) / 10);
				p_hp -= m_att;
				m_hp -= tmp_p_att;
				
				System.out.println("Your attack damage is " + tmp_p_att);
				System.out.println("Monster damaged you " + m_att);
				System.out.println();
				
				if(m_hp <= 0)
				{
					System.out.println("Monster dead");
					System.out.println("You win!!");
					return true;
				}
				
				else if(p_hp <= 0)
				{
					System.out.println("Your hp is 0");
					System.out.println("You lose..");
					return false;
				}
			}
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getExp()
	{
		return super.exp;
	}
}
