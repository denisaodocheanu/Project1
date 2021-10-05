import java.lang.Math;
public class Transport {
    String _adresa;
    double distantaX, distantaY;
    public Transport (String adresa)
    {
        this._adresa = adresa;
    }

    public double pretTrasport() {
        double PretPerUnitate = 10;
        return PretPerUnitate*(Math.sqrt(splitAdresa(_adresa, "x")*splitAdresa(_adresa, "x") + splitAdresa(_adresa, "y")*splitAdresa(_adresa, "y")));
    }

    public double splitAdresa (String Adresa, String axis){
        String X = "x";
        String Y = "y";
        double str;
        String[] parts = Adresa.split("-");
        if (axis.equalsIgnoreCase(X)) {
            str = Double.parseDouble(parts[0]);
        }
        else str = Double.parseDouble(parts[1]);
        return str;
    }

}
