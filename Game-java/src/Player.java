import java.util.Scanner;

public class Player extends Stat{
	
//	private Player(){}
//	
//	private static Player player = new Player();
//	
//	public static Player getIns()
//	{
//		if(player == null)
//		{
//			player = new Player();
//		}
//		
//		return player;
//	}
	
	private String id;
	private String pw;
	private int gold = 0;
	private static Scanner in = new Scanner(System.in);
	
	public void join()
	{
		System.out.println("== Join ==");
		System.out.print("Id : ");
		id = in.nextLine();
		
		System.out.print("Pw : ");
		pw = in.nextLine();
		
		System.out.println();
		
		System.out.println("Your ID is '" + id + "'");
		System.out.println("Your PW is '" + pw + "'");
		
		System.out.println();
		
		super.lv = 1;
		super.hp = 10;
		super.att = 10;
	}
	
	public void login()
	{
		int cnt = 0;
		
		while(cnt < 3)
		{
			System.out.println("== Login ==");
			System.out.print("ID : ");
			String tmp_id = in.nextLine();
			
			System.out.print("PW : ");
			String tmp_pw = in.nextLine();
			
			System.out.println();
			
			if(tmp_id.equals(this.id))
			{
				if(tmp_pw.equals(this.pw))
				{
					System.out.println("Login success");
					System.out.println();
					break;
				}
				
				else
				{
					System.out.println("Login fail");
					System.out.println();
					cnt ++;
				}
			}
			
			else
			{
				System.out.println("Login fail");
				System.out.println();
				cnt++;
			}
		}
	}
	
	public int lvExp(int lv)
	{
		int[] lv_exp = new int[100];
		
		for(int i = 0 ; i < 100 ; i++)
		{
			lv_exp[i] = i * 10 + (i / 10 * 100);
		}
		
		return lv_exp[lv];
	}
	
	public int getHp()
	{
		return super.hp;
	}
	
	public void setHp(int hp)
	{
		super.hp = hp;
	}
	
	public int getAtt()
	{
		return super.att;
	}
	
	public void setAtt(int att)
	{
		super.att = att;
	}
	
	public int getLv()
	{
		return super.lv;
	}
	
	public void setLv(int lv)
	{
		super.lv = lv;
	}
	
	public int getExp()
	{
		return super.exp;
	}
	
	public void setExp(int exp)
	{
		super.exp = exp;
	}
	
	public int getGold()
	{
		return this.gold;
	}
	
	public void setGold(int gold)
	{
		this.gold += gold;
	}
}
