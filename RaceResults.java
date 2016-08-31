import java.awt.List;

public class RaceResults {
	List<String> rfid;
	List<TypeDuration> resultats;
	
	public RaceResults (){
		rfid = new List<TimeDuration>;
		resultats = new List<TimeDuration>();
	}
	
	public RaceResults (String r, TimeDuration t){
		rfid.add(r);
		resultats.add(t);
	}
	
	protected void onNewResult (String tagNumber, TimeDuration resultTime){
		rfid.add(tagNumber);
		resultats.add(resultTime);
	}
	
	protected void printResults (){
		for (i)
	}
}
