package EsPomeridiani;

public class DipendenteFullTIme extends Dipendente {



    public DipendenteFullTIme(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

}
