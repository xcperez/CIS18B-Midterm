
public class GameManager {
	
	private static GameManager manager;
	
	private GameManager() {}
	
	public static GameManager getInstance()
	{
		
		if(manager == null) {
			
			manager = new GameManager();
			
		}
		
		return manager;
		
	}
	
	//add win method here 
	//add turn method here 
	
	
}
