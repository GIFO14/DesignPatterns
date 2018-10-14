package mainAndOthers;

import mainAndOthers.AbstractFactoryGeneralConnection;

public class FactorySuper{

	public AbstractFactoryGeneralConnection getFactory(String factory){
		
		if (factory.equalsIgnoreCase("BD")){

			return new Factory();
			
		}else if (factory.equalsIgnoreCase("REST")){

			return new FactoryREST();
		
		}

		return null;
		
	}

}