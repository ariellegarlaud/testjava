
import java.util.Iterator;
import java.util.Map;

public class RaceResults {
	//On part du principe que le nombre de participants n'est pas fixe, d'où le choix de Map. 
	Map <String, TypeDuration> registre;
	
	public RaceResults (){
		registre = new Map <String, TypeDuration>();
	}
	
	public RaceResults (String r, TimeDuration t){
		registre.add (r,t);
	}
	
	public void onNewResult (String tagNumber, TimeDuration resultTime){
		registre.add (tagNumber, resultTime);
	}
	
	public void printResults (){
		
		String resultat = "";
		this.tri_registre(registre);
		Iterator i = registre.iterator();
		while (i.hasNext()){
			resultat += i.next().getKey() + " : " + i.next().getValue();
		}
		System.out.println(resultat);
		
	}
	
	//Tri du registre
	private void tri_registre(registre){
		Iterator i = registre.iterator();
		int maximum ;
		resultat = new Map <String, TimeDuration>;
		minimum = registre.next().getValue.getDuree();
		resultat.add (i.next().getKey(), i.next().getValue();
		while (i.hasNext()){
			if (i.next().getValue.getDuree() < minimum){
				//Envoi à la première position
				resultat.push(i.next());
				tri_registre (resultat);
			}
			elseif (i.next().getValue.getDuree > maximum){
				//Envoi à la dernière position
				resultat.add(i.next());
				tri_registre (resultat);
			}
		}
		this.registre = resultat;
		
	}
	
	public static void main (String[] args){
		registre.add("Michel",new TimeDuration (23));
		registre.add ("David", new TimeDuration (25));
	}
}
