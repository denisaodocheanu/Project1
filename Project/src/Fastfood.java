public class Fastfood {
    Coscump cs = new Coscump(0);
    Produs pr1 = new Produs("Vita" ,"Sandvis",19);
    Produs pr2 = new Produs("Pui" ,"Sandvis",17);
    Produs pr3 = new Produs("Mixt" ,"Sandvis",20);
    Produs pr4 = new Produs("Salata cu ton" ,"Salate",17);
    Produs pr5 = new Produs("Salata cu Caesar" ,"Salate",23);
    Produs pr6 = new Produs("Cola" ,"Sucuri",6);
    Produs pr7 = new Produs("Sprite" ,"Sucuri",5);
    Produs pr8 = new Produs("Fanta" ,"Sucuri",6.5);

    public void adaugcos(int option,int cant){
            switch(option){
                case 1 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr1.getPrice(), cant);
                    break;
                case 2 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr2.getPrice(), cant);
                    break;
                case 3 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr3.getPrice(), cant);
                    break;
                case 4 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr4.getPrice(), cant);
                    break;
                case 5 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr5.getPrice(), cant);
                    break;
                case 6 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr6.getPrice(), cant);
                    break;
                case 7 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr7.getPrice(), cant);
                    break;
                case 8 :
                    System.out.println("Produsul a fost adaugat in cos");
                    cs.Totalsum(pr8.getPrice(), cant);
                    break;
            }

        }
        public double alegereprodus(int option){
            switch(option){
                case 1 :
                    return pr1.getPrice();
                case 2 :
                    return pr2.getPrice();
                case 3 :
                    return pr3.getPrice();
                case 4 :
                    return pr4.getPrice();
                case 5 :
                    return pr5.getPrice();
                case 6 :
                    return pr6.getPrice();
                case 7 :
                    return pr7.getPrice();
                case 8 :
                    return pr8.getPrice();
            }
            return 0;
        }
    }
