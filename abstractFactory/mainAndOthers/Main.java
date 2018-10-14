package mainAndOthers;

import mainAndOthers.Factory;

public class Main(){

	public static void main(String args[]){

		Scanner sc = new Scanner();

		System.out.println("Escriu 'MySql' per a establir conexió amb la base dedades MySQL, o 'Oracle' per a entrar a la base de dades Oracle.");
		
		String temp = sc.nextLine();
		Factory f = Factory.Connections(temp); 

		f.connection();
		f.disconnection();
	
	}

}