import java.util.Scanner;
import java.util.Objects;

public class Meniu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fastfood ff = new Fastfood();
        int option,option2,cantitate;
        String input = "0",nume;
        System.out.println("Buna ziua! Ce doriti sa comandati?");
        while(!Objects.equals(input, "1")){
            System.out.println("1.Sandvisuri");
            System.out.println("2.Salate");
            System.out.println("3.Sucuri");
            System.out.println("4.Verificare suma");
            System.out.println("5.Stergere produs");
            System.out.println("6.Finalizare comanda");
            option2 = sc.nextInt();
            switch(option2){
                case 1 :
                    System.out.println("1.Vita");
                    System.out.println("2.Pui");
                    System.out.println("3.Mixt");
                    option2 = sc.nextInt();
                    System.out.println("Cate bucati doriti sa adaugati?");
                    cantitate = sc.nextInt();
                    ff.adaugcos(option2,cantitate);
                    break;
                case 2 :
                    System.out.println("1.Salata cu ton");
                    System.out.println("2.Salata Caesar ");
                    option2 = sc.nextInt();
                    System.out.println("Cate bucati doriti sa adaugati?");
                    cantitate = sc.nextInt();
                    ff.adaugcos(option2,cantitate);
                    break;
                case 3 :
                    System.out.println("1.Cola");
                    System.out.println("2.Sprite");
                    System.out.println("3.Fanta");
                    option2 = sc.nextInt();
                    System.out.println("Cate bucati doriti sa adaugati?");
                    cantitate = sc.nextInt();
                    ff.adaugcos(option2,cantitate);
                    break;
                case 4 :
                    System.out.println(ff.cs.getSold());
                    break;
                case 5 :
                    System.out.println("Ce produs doriti sa stergeti?");
                    option2 = sc.nextInt();
                    System.out.println("Ce cantitate?");
                    cantitate = sc.nextInt();
                    ff.cs.DeleteElemcos(ff.alegereprodus(option2), cantitate,option2);
                    break;
                case 6 :
                    System.out.println("Doriti sa finalizati comanda?");
                    String raspuns = sc.next();
                    String da="da";
                    String Da="Da";
                    String DA="DA";
                    if (da.equalsIgnoreCase(raspuns) || Da.equalsIgnoreCase(raspuns) || DA.equalsIgnoreCase(raspuns))
                        ff.cs.finalizarecomanda();
                    break;
            }
            System.out.println("Doriti sa iesiti?");
            String raspuns = sc.next();
            String da="da";
            String Da="Da";
            String DA="DA";
            if (da.equalsIgnoreCase(raspuns) || Da.equalsIgnoreCase(raspuns) || DA.equalsIgnoreCase(raspuns)) break;
        }
    }
}
