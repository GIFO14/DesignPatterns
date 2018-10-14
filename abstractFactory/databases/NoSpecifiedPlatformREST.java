package databases;

import mainAndOthers.GeneralConnectionREST;

public class NoSpecifiedPlatformREST implements GeneralConnexionREST{

	private String noSpecifiedPlatformREST;

	public NoSpecifiedPlatformREST(){

		this.noSpecifiedPlatformREST = "No specified platform";

	}

	@Override
	public void urlReader(String url){

		System.out.println("No s'ha pogut conectar a: " + url);	

	}

}