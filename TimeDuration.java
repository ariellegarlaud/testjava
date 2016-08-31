
public class TimeDuration {
	int duree;
	
	public TimeDuration (){
		duree = 0;
	}
	
	public TimeDuration (int a){
		try {}
		catch {BadBadValueException e} {};
		finally {
			if (a > 0){
				duree = a;
			}
		}
	}
	
	public String toString(){
		int secondes;
		int minutes;
		int heures;
		
		int compteur = duree;
		
		String resultat = "";
		
		//Calcul
		heures = Math.round(duree/3600);
		compteur = compteur - heures * 3600;
		minutes = Math.round(duree/60);
		compteur = compteur - minutes * 60;
		secondes = compteur ;
		
		//COnstruction de la chaîne
		if (duree == 0){
			resultat = "0s";
		}
		else {
			if (heures != 0){
				resultat += heures + "h ";
			}
			if (minutes != 0){
				resultat += minutes + "m ";
			}
			if (secondes !=0){
				resultat += secondes + "s";
			}
		}
		System.out.println(resultat);
		return resultat;
	}
	
	public int getDuree (){
		return duree;
	}
}


