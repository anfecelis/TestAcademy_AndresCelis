import org.junit.Test;

public class InstanciarAnimales {
    @Test
    public void InstanciandoClasePerro(){
        Perro perro = new Perro();
        perro.setNroPatas(4);
        System.out.println(String.format("El número de patas es: %d, %s", perro.getNroPatas(), "Mentoría"));
        perro.producirSonido();
    }

    @Test
    public void InstanciarClaseGato(){
        Gato gato = new Gato();
        gato.setNroPatas(4);
        gato.getNroPatas();
    }
}
