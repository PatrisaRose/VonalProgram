
package vonalProgram;


public class Vonal {
    private int hossz, eltolas;
    private String szin;
    private VonalStilus tipus;
    public enum VonalStilus{Szimpla, Dupla, Pont, Szaggatott};
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    
    public Vonal(){
       this(1);
    }
    
    public Vonal(int hossz){
       this(hossz, "lila");
    }
    
    public Vonal(int hossz, String szin){
        this(hossz, szin, VonalStilus.Szimpla);
    }
    
    public Vonal(int hossz, String szin, VonalStilus tipus){
        this(hossz, szin, tipus, 0);
        }

    public Vonal(int hossz, String szin, VonalStilus tipus, int eltolas) {
        this.hossz = hossz;
        this.eltolas = eltolas;
        this.szin = szin;
        this.tipus = tipus;
    }
    
    public void setHossz(int hossz){
        if (hossz <= 0) {
            hossz = 1;
        }
        this.hossz = hossz;
    }
    
    public void setEltolas(int eltolas){
        if (eltolas <= 0) {
            eltolas = 0;
        }
        this.eltolas = eltolas;
    }
    
    public int getHossz(){
        return this.hossz;
    }
    
    public int getEltolas(){
        return this.eltolas;
    }
    
    public void setTipus(VonalStilus tipus){
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz= " + hossz + ", szin= " + szin + ", tipus= " + tipus + ", eltolas= " + eltolas + '}';
    }
    
    public void rajzol(){
        
        char jel;
        //tipus
        switch(this.tipus){
            default -> jel = '_';
            case Szimpla -> jel = '_';
            case Dupla -> jel = '=';
            case Pont -> jel = '.';
            case Szaggatott -> jel = '-';
        }
        //hossz
        String sz;
        switch(this.szin){
            default -> sz = Vonal.ANSI_WHITE;
            case "piros" -> sz = Vonal.ANSI_RED;
            case "kék" -> sz = Vonal.ANSI_BLUE;
            case "zöld" -> sz = Vonal.ANSI_GREEN;
            case "sárga" -> sz = Vonal.ANSI_YELLOW;
            case "lila" -> sz = Vonal.ANSI_PURPLE;
        }
        for (int i = 0; i < eltolas; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < this.hossz; i++) {
            
            System.out.print(sz + jel);
        }
        System.out.println(" ");
        
        
    }
    
    
    
}
