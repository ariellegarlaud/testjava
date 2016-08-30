
public enum TypeMoteur {
	
	DIESEL ("Diesel"),
	ESSENCE ("Essence"),
	HYBRIDE ("Hybride"),
	ELECTRIQUE ("Electrique");

	private String name = "";

	   
	  //Constructeur

	  TypeMoteur (String name){

	    this.name = name;

	  }

	   

	  public String toString(){

	    return name;

	  }
	 
}
