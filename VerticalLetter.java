import java.util.Scanner;

public class VerticalLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int entree = 0;
		while (entree % 2 == 0){
			System.out.println("Entrez un nombre impair.");
			entree = sc.nextInt();
		}
		
		String ligneLettre = new String();
		
		System.out.println();
		
		//Impression de la lettre Z
		
		//Première ligne
		for (int i = 1 ; i<= entree; i++){
			ligneLettre += "*";
		}
		System.out.println(ligneLettre);
		
		//Corps
		for (int i = 2 ; i<=entree - 1 ; i++){
			ligneLettre = new String();
			for (int j = 1 ; j<= entree - i ; j++){
				ligneLettre += " ";
			}
			ligneLettre +="*";
			System.out.println(ligneLettre);
		}
		//Dernière ligne
		ligneLettre = new String ();
		for (int i = 1 ; i<= entree; i++){
			ligneLettre += "*";
		}
		System.out.println(ligneLettre);

	}

}
