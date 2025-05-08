package EsPomeridiani;

public class Volontario implements CheckInable {


    private String nome;
    private int eta;

    private String cv;


    public Volontario(String nome, String cv, int eta) {
        this.nome = nome;
        this.cv = cv;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    // metodo

    @Override
    public void checkin() {
        System.out.println("Il volontario cade malato");
    }
}
