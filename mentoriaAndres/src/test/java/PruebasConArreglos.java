import org.junit.Test;

import java.sql.SQLOutput;

public class PruebasConArreglos {
    @Test
    public void arregloDeCadenas(){
        String[] arrayMeses = {"Enero", "Febrero", "Marzo", "..."};
        for (String mes: arrayMeses){
            System.out.println(mes);
        }
    }
}
