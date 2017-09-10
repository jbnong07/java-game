public class LvUp {
	private static Player player = Player.getIns();
	
	public boolean checkLvUp()
	{
		int tmp_exp = player.getExp();
		int lv_exp = player.lvExp(player.getLv());
		
		if(tmp_exp >= lv_exp)
		{
			return true;
		}
		
		else
			return false;
	}
	
	public void lvUp()
	{
		int tmp_lv = player.getLv();
		player.setLv(tmp_lv + 1);
				
		int tmp_exp = player.getExp();
		int lv_exp = player.lvExp(tmp_lv);
		
		System.out.println("Debuging tmp_exp1 : " + tmp_exp);
		
		tmp_exp -= lv_exp;
		
		player.setExp(tmp_exp);
		
		System.out.println("Debuging tmp_exp2 : " + tmp_exp);
		
		
		
		System.out.println("Lv up!!");
		System.out.println("LV : " + tmp_lv);
	}
}
