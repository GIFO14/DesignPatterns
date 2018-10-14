package databases;

import mainAndOthers.GeneralConnectionREST;

public class RESTSell implements GeneralConnexionREST{

	@Override
	public void connection(){

		System.out.println("Connectat a: " + url);	

	}

}