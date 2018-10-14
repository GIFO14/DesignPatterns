package mainAndOthers;

import mainAndOthers.FactoryREST;

public class MainREST(){

	public static void main(String args[]){

		Scanner sc = new Scanner();

		System.out.println("Introduiex 'Vendes' per a saber les vendes o 'Compres' per a saber les compres: ");
		
		String temp = sc.nextLine();
		FactoryREST f = FactoryREST.urlReader(temp); 

		f.connection();
		f.disconnection();
	
	}

}