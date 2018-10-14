package mainAndOthers;

public class Factory{

	public GeneralConnection Connection( String plataforma ){

		if (plataforma == null){

			return new NoSpecifiedPlatform();

		}else if (plataforma.equalsIgnoreCase("MySql")) {

			return new MySqlConnection();

		}else if (plataforma.equalsIgnoreCase("Oracle")){
	
			return new OracleConnection();

		}
		
		return new NoSpecifiedPlatform();
	
	}

}