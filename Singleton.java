

public class Singleton{

	private static Singleton instancia;

	public static Singleton getInstancia(){

		if (instancia == null) {
			instancia = new Singleton();
		}

		return instancia;
	
	}

	public void connect(){

		System.out.println("Conectant...");
	
	}

}

 

class Main {

	public static void main(String args[]){

		Singleton c = Singleton.getInstancia();
		c.connect();
	
	}

}