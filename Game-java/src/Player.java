import java.util.Scanner;

public class Player extends Stat{
	
	private String id;
	private String pw;
	private static Scanner in = new Scanner(System.in);
	
	public void join()
	{
		System.out.println("== Join ==");
		System.out.print("Id : ");
		id = in.nextLine();
		
		System.out.print("Pw : ");
		pw = in.nextLine();
		
		System.out.println("Your ID is '" + id + "'");
		System.out.println("Your PW is '" + pw + "'");
		super.lv = 1;
		super.hp = 10;
		super.att = 1;
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
}
