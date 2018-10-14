package databases;

import mainAndOthers.GeneralConnection;

public class MySql implements GeneralConnexion{

	private String user;
	private String host;

	public MySqlConnection(){

		this.user = "root";
		this.host = "localhost";

	}

	@Override
	public void connection(){

		System.out.println("Connectat a MySQL");	

	}

	@Override
	public void disconnection(){

		System.out.println("Desconnectat a MySQL");	

	}

}