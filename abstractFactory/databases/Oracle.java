package databases;

import mainAndOthers.GeneralConnection;

public class Oracle implements GeneralConnexion{

	private String user;
	private String host;

	public MySqlConnection(){

		this.user = "root";
		this.host = "localhost";

	}

	@Override
	public void connection(){

		System.out.println("Connectat a Oracle");	

	}

	@Override
	public void disconnection(){

		System.out.println("Desconnectat a Oracle");	

	}

}