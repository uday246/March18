package mat25;

import java.util.ArrayList;
import java.util.List;

class Runner extends Athlete{
	private String country;
	// array list to hold the events
	private List<String>events=new ArrayList<String>();
	// constructor
	Runner(String lName,String fName,int birthYear,int birthMonth,int birthDay,String country){
		super(lName,fName,birthYear,birthMonth,birthDay);
		this.country=country;
	}
	public String getCountry(){
		return country;
		
	}
	// setEvent to add the event
	public void setEvent(String evnt){
		events.add(evnt);
	}
	public void setEvent(List<String> evnt){
		events.addAll(evnt);
	}
	public String toString(){
		return super.toString()+" swimmer for team : "+team+" in the following events : "+events;
	}
	
}
public class TestSwimmer {

}
