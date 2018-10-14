package libraries;

/**
 *
 * @author mblan
 */
public interface ICompta {
    
    Compta retirarDiners(Compta compta, double diners);
    Compta depositarDiners(Compta compta, double diners);
    void mostrarSaldo(Compta compta);
    
}
