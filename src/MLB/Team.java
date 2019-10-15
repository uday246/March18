package MLB;

public abstract class Team {

	public final int rosterCount = 9;

	public abstract void setTeamName(String name);

	public abstract String getTeamName();

	public abstract void setTeamCity(String city);

	public abstract String getTeamCity();

	public int getRoster() {

		return rosterCount;

	}

}
