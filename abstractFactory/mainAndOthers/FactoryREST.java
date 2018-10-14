package mainAndOthers;

public class FactoryREST extends AbstractFactoryGeneralConnection{

	@Override
	public GeneralConnectionREST getREST( String url ){

		if (url == null){

			return NoSpecifiedPlatformREST();

		}else if (url.equalsIgnoreCase("Compres")) {

			return RESTBuy();

		}else if (url.equalsIgnoreCase("Vendes")){
	
			return RESTSell();

		}
		
		return NoSpecifiedPlatformREST();
	
	}

	@Override
	public GeneralConnection getBD(){
		return null;
	}

}