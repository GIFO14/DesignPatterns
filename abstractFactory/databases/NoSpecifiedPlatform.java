package databases;

import mainAndOthers.GeneralConnection;

public class NoSpecifiedPlatform implements GeneralConnexion{

	private String noSpecifiedPlatform;

	public NoSpecifiedPlatform(){

		this.noSpecifiedPlatform = "No specified platform";

	}

	@Override
	public void connection(){

		System.out.println("Plataforma no específicada");	

	}

}