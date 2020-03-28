import org.junit.Test;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

class Coche {
    String marca;

    Coche(String marca){
        this.marca = marca;
    }

    String getMarcaCoche(){ return marca; }
}

public class PrincipioAbiertoCerrado {
    @Test
    public void testPrincipioOpenClose() {
        Coche[] arrayCoches = {
                new Coche( "Renault"),
                new Coche( "Audi")
        };
        this.imprimirPrecioCoche(arrayCoches);
    }

    public void imprimirPrecioCoche (Coche[] arrayCoches) {
        for (Coche coche: arrayCoches){
            if (coche.marca.equals("Renault")) System.out.println(18000);
            if (coche.marca.equals("Audi"))System.out.println(25000);
            if (coche.marca.equals("Mercedes"))System.out.println(27000);
        }
    }
}
