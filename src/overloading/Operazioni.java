package overloading;

public class Operazioni {

    //creo vari metodi

    public double somma(int a, int b) {
        return a + b;
    }

    public double somma(int a, int b, int c) {
        return a + b + c;
    }

    // questo ci da errore perche java va a guardare i parametri
//    public  double somma (int b , int a ){
//        return b+a;
//    }


    // qua funziona in quanto come parametro prende un in ed un double rispetto al esempio di sopra
    public double somma(int a, double b) {
        return b + a;
    }

    public  double somma (double a, int b){
        return  a+b;

    }
}
