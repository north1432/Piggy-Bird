package logic;

import res.Resource;

public class GameLogic {

	private static GameLogic instance = new GameLogic();
	protected Player player = new Player(30,10,0,0,0,2,1,Resource.character);
	private static final int SPAWN_DELAY = 100;
	private int spawnDelayCounter = 0;
	
	public static GameLogic getInstance() {
		return instance;
	}
	
	public GameLogic() {
		RenderableHolder.getInstance().add(player);
		//RenderableHolder.getInstance().add(playerStatus);
	}
	
	public void logicUpdate() {
		player.update();
	}
}
