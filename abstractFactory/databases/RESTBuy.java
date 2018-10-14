package databases;

import mainAndOthers.GeneralConnectionREST;

public class RESTBuy implements GeneralConnexionREST{

	@Override
	public void urlReader(String url){

		System.out.println("Connectat a: " + url);	

	}

}