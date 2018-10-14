package mainAndOthers;

import mainAndOthers.FactorySuper;

public class App{

	Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
		
		System.out.println("Introdueix 'BD' per entrar a la fàbrica de la base de dades: \nIntrodueix 'REST' per entrar a la fàbrica del REST: ");
		String temp = sc.nextLine();

		AbstractFactoryGeneralConnection factoryBD = FactorySuper.getBD(temp);

		if (temp.equals("BD")){

			System.out.println("Escriu 'MySql' per a establir conexió amb la base dedades MySQL, o 'Oracle' per a entrar a la base de dades Oracle.");
			String aux = sc.nextLine();			

			GeneralConnection f = Factory.getBD(aux);
			f.connection();
			f.disconnection();

		}else if (temp.equals("REST")){

			System.out.println("Introduiex 'Vendes' per a saber les vendes o 'Compres' per a saber les compres: ");
			String aux = sc.nextLine();			

			GeneralConnectionREST fREST = FactoryREST.getREST(aux);
			fREST.urlReader(aux);

		}

	}

}