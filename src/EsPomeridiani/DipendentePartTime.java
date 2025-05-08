package EsPomeridiani;

public class DipendentePartTime extends Dipendente {

    private double oreLavorate;


    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento,double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate=oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return (getStipendio()* oreLavorate);
    }
}
