import java.util.*;

public class Main {

    public static void main(String[] args) {

        //int pazymejimoNr, String pavardeVardas, String gimimoData,  String grupe, double vidurkis
        Fakultetas f0 = new Fakultetas(123450, "Jonas Jonaitis", "1990.01.01", "pirma19", 8.54);
        Fakultetas f1 = new Fakultetas(123451, "Linas Linaitis", "1991.08.24", "antra18", 3.5);
        Fakultetas f2 = new Fakultetas(123452, "Petras Petraitis", "1992.12.07", "pirma19", 6.54);
        Fakultetas f3 = new Fakultetas(123453, "Rasa Rasaitė", "1990.05.12", "trecia17", 5.89);
        Fakultetas f4 = new Fakultetas(123454, "Denis Denisov", "1994.09.08", "trecia17", 4.25);
        Fakultetas f5 = new Fakultetas(123455, "Kristina Kristinaitė", "1993.11.26", "antra18", 7.67);
        Fakultetas f6 = new Fakultetas(123456, "Liepa Liepaitė", "1991.12.01", "pirma19", 3.8);
        Fakultetas f7 = new Fakultetas(123457, "Marius Maraitis", "1988.06.17", "trecia17", 8);
        Fakultetas f8 = new Fakultetas(123458, "Greta Gretaitė", "1994.09.21", "pirma19", 7.44);
        Fakultetas f9 = new Fakultetas(123459, "Tadas Tadaitis", "1992.10.30", "antra18", 4.5);

        ArrayList<Fakultetas> sarasas = new ArrayList<>();
        sarasas.add(f0);
        sarasas.add(f1);
        sarasas.add(f2);
        sarasas.add(f3);
        sarasas.add(f4);
        sarasas.add(f5);
        sarasas.add(f6);
        sarasas.add(f7);
        sarasas.add(f8);
        sarasas.add(f9);

        System.out.println(sarasas);

        String paieska;
        System.out.println("Studentų paieška.");
        System.out.println("Įveskite grupės pavadinimą:");
        Scanner scanner = new Scanner(System.in);
        paieska = scanner.next();
        System.out.println(paieska);

    int count = 0;
        for(Fakultetas a : sarasas){
            if (a.getGrupe() == paieska){
                count++;
            }
            else if(a.getGrupe() == paieska)
                count++;
            else if(a.getGrupe() == paieska)
                count++;

        }
        System.out.println(count);
    }

}

