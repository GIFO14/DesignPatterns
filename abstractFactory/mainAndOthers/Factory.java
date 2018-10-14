package mainAndOthers;

public class Factory extends AbstractFactoryGeneralConnection{

	@Override
	public GeneralConnection getBD( String plataforma ){

		if (plataforma == null){

			return NoSpecifiedPlatform();

		}else if (plataforma.equalsIgnoreCase("MySql")) {

			return MySqlConnection();

		}else if (plataforma.equalsIgnoreCase("Oracle")){
	
			return OracleConnection();

		}
		
		return NoSpecifiedPlatform();
	
	}

	@Override 
	public GeneralConnexionREST getREST(String url){
		return null;
	}

}