package App;

/**
 *
 * @author mblan
 */
public class App {

    static Vista v = new Vista();
    static Controller c = new Controller();

    public static void main(String[] args) {

        Vista v = new Vista();
        Controller c = new Controller();

        for (int j = 0; j <= 10; j++) {
            
            addOperation();
            otherConstant();
            
        }
    }

    public static void otherConstant() {

        v.preguntarExecucioOperacions();
        if (v.check) {

            c.invokerExecute();

        }

        v.preguntarRecuperacioOperacio();
        if (v.check1) {

            c.recuperarOperacio(v.index);

        }

        v.preguntarBorrarBackUpList();
        if (v.check2) {

            c.borrarBackUpList();

        }
        
        System.out.println("\n");

    }

    public static void addOperation() {

        v.preguntarNum();
        c.getNum(v.n1, v.n2);

        v.preguntarTipusOperacio();
        c.getInstanciaDeIOperacio(v.tipusOperacio);
        c.addToInvoker();

    }

}
