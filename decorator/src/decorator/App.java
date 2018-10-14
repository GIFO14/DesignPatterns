package decorator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        IComptaBancaria compta;

        System.out.print("Introdueix un id i una contrassenya per crear una compta. \nId: ");
        long id = sc.nextLong();

        System.out.print("\nContrassenya: ");
        String contrassenya = sc2.nextLine();

        Compta c = new Compta(id, contrassenya);

        System.out.println("Introdueix 'Estalvi' per a crear una compta d'estalvis. Escriu 'Corrent' per a crear una compta corrent.");
        String comptaTipus = sc2.nextLine();

        if (comptaTipus.equalsIgnoreCase("estalvi")) {
            
            compta = new ComptaEstalvi();
            
        } else{
            
            compta = new ComptaCorrent();
            
        }
        
        System.out.print("Vols afegir protecció adicional a la compta? ");
        String temp = sc2.nextLine();
        
        if(temp.equalsIgnoreCase("si")){
            
            IComptaBancaria comptaProtegida = new ProteccioDecorator(compta);
            comptaProtegida.obrirCompta(c);
            
            System.out.println("La compta amb la id (" + c.getId() + ") ha sigut protegida amb èxit!");
            
        }

    }

}
