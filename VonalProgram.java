package vonalProgram;

public class VonalProgram {

    public static void main(String[] args) {
        new VonalProgram().feladat();
        
        /*Vonal v5 = new Vonal(érték < 1, "az érték nem egy szín magyar nyelven vagy nincs érték megadva", 
        "az érték nem egy típus ad meg magyar nyelven vagy nincs érték megadva", érték < 1);*/
        
        
    }
    private void feladat(){
        helyesTeszt();
        //helytelenTeszt();
    }
    private void helyesTeszt(){
            Vonal v0 = new Vonal();
            Vonal v1 = new Vonal(7);
            Vonal v2 = new Vonal(10, "sárga");
            Vonal v3 = new Vonal(6, "kék", Vonal.VonalStilus.Szimpla );
            Vonal v4 = new Vonal(3, "piros", Vonal.VonalStilus.Szaggatott, 5);
            
            System.out.println("Helyes Teszt!");
            System.out.println(v0);
            v0.rajzol();
            System.out.println(v1);
            v1.rajzol();
            System.out.println(v2);
            v2.rajzol();
            System.out.println(v3);
            v3.rajzol();
            System.out.println(v4);
            v4.rajzol();
        }
    
    private void helytelenTeszt(){
        Vonal h0 = new Vonal(); //0 nem lehet a hossz
        Vonal h1 = new Vonal(-5); // negatív szám nem lehet a hossz
        Vonal h2 = new Vonal(5, ""); //üres nem lehet a hossz
        Vonal h3 = new Vonal(5, "blue"); // csak magyar szín
        Vonal h4 = new Vonal(5, "piros", "dotted"); //csak magyar típus
        Vonal h5 = new Vonal(5, "red", ""); //angol és üres
        Vonal h6 = new Vonal(5, "pont", "kék"); //nem lehet felcserélni
        Vonal h7 = new Vonal(5, null, null, 2); //nem lehet null
        Vonal h8 = new Vonal(5, "sárga", "szaggatott", -3); //csak magyar típus

        System.out.println("Helytelen Teszt!");
        System.out.println(h0);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
    }
    
    
}
