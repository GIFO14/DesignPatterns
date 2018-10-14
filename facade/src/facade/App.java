package facade;

import java.util.Scanner;

public class App {

    public static void code() {

        CheckFacade cf = new CheckFacade();
        Scanner sc = new Scanner(System.in);

        String temp;

        System.out.print("Si vols buscar vols escriu 'Vol', i si vols cercar hotels entra 'Hotel': ");
        temp = sc.nextLine();

        if (temp.equals("Vol")) {

            String dia, hora, desviaments, lloc, gama;

            System.out.print("Introdueix el dia del vol: ");
            dia = sc.nextLine();

            System.out.print("Introdueix el dia del vol: ");
            cf.buscarHotel(temp, temp, temp, temp);

        } else {
        }

    }

    public static void main(String[] args) {

        code();
        
    }

}
