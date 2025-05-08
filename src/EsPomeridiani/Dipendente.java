package EsPomeridiani;

abstract class Dipendente implements CheckInable {

    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    // costruttore
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
    // setters


    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    // getters

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    // metodo calculate salary in quanto astratto non ha le {} richiede soltanto la firma
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola +" Stipendio "+ (calculateSalary())+ '\'' +
                '}';
    }

    @Override
    public void checkin() {
        System.out.println("IL DIPENDENTE CADE MALATISSIMO");
    }
}
