package App;

import java.util.*;
public class Coscump {
    private double Sold;

    public Coscump(double sold)
    {
        this.Sold=sold;
    }

    public double getSold() {
        return Sold;
    }

    public void Totalsum(double sum, int cant){
        this.Sold += sum*cant;
    }

    public boolean DeleteElemcos(double pret,int cant,int opt){
            this.Sold -= pret*cant;
            return true;
    }

    public void finalizarecomanda(){
            System.out.println("Comanda finalizata: " + this.Sold);
            Scanner scan = new Scanner(System.in);
            System.out.println("Doriti cu transport la domiciliu?");
            String raspuns = scan.next();
            String da="da";
            String Da="Da";
            String DA="DA";
            if (da.equalsIgnoreCase(raspuns) || Da.equalsIgnoreCase(raspuns) || DA.equalsIgnoreCase(raspuns)) {
                System.out.print("Introduceti adresa: ");
                String adresa = scan.next();
                Transport tran = new Transport(adresa);
                System.out.print("Pretul trasportului este: " + tran.pretTrasport() + "\n");
            }
    }
}
