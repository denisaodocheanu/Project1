public class Produs {
    private String Name;
    private String Type;
    private double Price;

    public Produs(String nume, String tip, double pret){
        this.Name = nume;
        this.Type  = tip;
        this.Price = pret;
    }

    public double getPrice() {
        return Price;
    }
}
