package commun;

import java.util.Date;

public class Jeton {
	private Date dateExpiration;
	private String valeur;
	
	
	public Jeton(Date dateExpiration, String valeur) {
		this.dateExpiration = dateExpiration;
		this.valeur = valeur;
	}
	
	
}
