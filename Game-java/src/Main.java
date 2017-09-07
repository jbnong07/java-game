
public class Main {
	
	private static Player player = new Player();
	private static Monster[] monster = new Monster[5];

	public static void main(String args[])
	{
		monster[0] = new Monster("Slime", 1, 10, 0);
		monster[1] = new Monster("Mush", 2, 20, 1);
		
		player.join();
		
		monster[0].hunt(player);
	}
}
