package EsPomeridiani;

public class MainDipendente {
    public static void main(String[] args) {

        double stipendiTotale=0;

        // instanziare 3 dipartimenti

        Dipendente dipendente1=new DipendenteFullTIme("MAT01",2450.50,Dipartimento.PRODUZIONE);
        Dipendente dipendente2=new DipendentePartTime("MAT02",20,Dipartimento.AMMINISTRAZIONE,20);
        Dipendente dipendente3=new Dirigente("MAT03",2450.50,Dipartimento.VENDITE);
        Volontario dipendente4= new Volontario("ciccio","gamer",40);

        //CREO UN ARRAY DI TIPO DIPENDENTI chiamato arrayDipendenti

        Dipendente[] arrayDipendenti = new Dipendente[3];
        arrayDipendenti[0] = dipendente1;
        arrayDipendenti[1] = dipendente2;
        arrayDipendenti[2] = dipendente3;

        System.out.println("Matricole dei dipendenti sono le seguenti :");
        for (int i = 0; i <arrayDipendenti.length ; i++) {
            System.out.println(arrayDipendenti[i]);
            stipendiTotale+=arrayDipendenti[i].calculateSalary();

        }
        System.out.println(stipendiTotale);

        CheckInable[] arraydiCheckin= new CheckInable[3];
        arraydiCheckin[0]=dipendente1;
        arraydiCheckin[1]=dipendente2;
        arraydiCheckin[2]=dipendente4;

        for (int i = 0; i <arraydiCheckin.length ; i++) {
            arraydiCheckin[i].checkin();

        }


    }



}
