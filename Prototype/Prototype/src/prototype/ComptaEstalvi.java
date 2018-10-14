package prototype;

public class ComptaEstalvi implements ICompta {

    private String tipus;
    private double quantitat;

    public ComptaEstalvi() {

        tipus = "Estalvi";

    }

    @Override
    public ICompta clonar() {

        ICompta compta = null;

        try {

            compta = (ComptaEstalvi) clone();

        } catch (Exception e) {

            System.out.println("No s'ha pogut clonar la compta.");

        }

        return compta;
    }

    public void mostrar() {

        System.out.println("La quantitat de diners que es troben en aquesta compta és: " + quantitat);

    }

    public double getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(double quantitat) {
        this.quantitat = quantitat;
    }

}
