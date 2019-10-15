package MLB;

public interface CreateGame {
	public abstract void runGame();

	// should run the game as a simulation that automatically plays the whole
	// game until end of 9 innings.

	public abstract String printAfterInning();

	// should print score for each team after each inning

	public abstract String printWinnerAfterGame();

	// should print the winner and final score after game completed
}
