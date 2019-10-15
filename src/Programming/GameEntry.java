package Programming;

public class GameEntry

{

	protected String name; // name of the person earning this score

	protected int score; // the score value

	/** Constructor to create a game entry */

	public GameEntry(String n, int s)

	{

		name = n;

		score = s;

	}

	/** Retrieves the name field */

	public String getName()

	{

		return name;

	}

	/** Retrieves the score field */

	public int getScore()

	{

		return score;

	}

	/** Returns a string representation of this entry */

	public String toString()

	{

		return "(" + name + ", " + score + ")";

	}
	public static void main(String[] args) {
		GameEntry g1 = new GameEntry("G1", 10);
		GameEntry g2 = new GameEntry("G2", 20);
		GameEntry g3 = new GameEntry("G3", 30);
		GameEntry g4 = new GameEntry("G4", 40);
		GameEntry [] e = new GameEntry[4];
		e[0]=g1;
		e[1]=g2;
		e[2]=g3;
		e[3]=g4;
		Scores s = new Scores();
		s.add(g1);
		s.add(g2);
		s.add(g3);
		s.add(g4);
		System.out.println(s);

	}

}

class Scores

{

	public static final int maxEntries = 10; // number of high scores we keep

	private int numEntries; // number of actual entries

	private GameEntry[] entries; // array of game entries (names & scores)

	/** Default constructor */

	public Scores()

	{

		entries = new GameEntry[maxEntries];

		numEntries = 0;

	}

	/** Attempt to add a new score to the collection (if it is high enough) */

	public void add(GameEntry e)

	{

		int newScore = e.getScore();

		// is the new entry e really a high score?

		if (numEntries == maxEntries) // the array is full

		{

			if (newScore <= entries[numEntries - 1].getScore()) // the new
																// entry, e, is
																// not a high
																// score in this
																// case

			{

				return;

			}

		}

		else // the array is not full

		{

			numEntries++;

		}

		// Locate the place that the new (high score) entry e belongs

		int i;

		for (i = numEntries - 1; (i >= 1) && (newScore > entries[i - 1].getScore()); i--)

		{

			System.out.println("Moving element at position " + (i - 1) + " (" + entries[i - 1] + ") to the right");

			entries[i] = entries[i - 1]; // move entry i one to the right

		}

		// add the new score to entries

		System.out.println("Moving new element into position " + i + " (" + e + ")");

		entries[i] = e;

	}

	/** Remove and return the high score at index i */

	public GameEntry remove(int i) throws IndexOutOfBoundsException

	{

		if ((i < 0) || (i >= numEntries))

		{

			throw new IndexOutOfBoundsException("Invalid index: " + i);

		}

		GameEntry temp = entries[i]; // temporarily save the object to be
										// removed

		for (int j = i; j < numEntries - 1; j++) // count up from i (not down)

		{

			entries[j] = entries[j + 1]; // move one cell to the left

		}

		entries[numEntries - 1] = null; // null out the old last score

		numEntries--;

		return temp; // return the removed object

	}

	public String toString(){
	
		StringBuffer sb = new StringBuffer("[");
		for(int i=0;i<numEntries;i++){
			sb.append(entries[i].toString()+",");
		}
		if(sb.length()==1)
			return "[]";
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		
		return new String(sb);
	}
}