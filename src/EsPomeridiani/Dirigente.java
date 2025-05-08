package EsPomeridiani;

public class Dirigente extends  Dipendente{

    private  final double bonus=200;

    // costruttore
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


// metodo
    @Override
    public double calculateSalary() {
        return (getStipendio()+bonus);
    }
}
