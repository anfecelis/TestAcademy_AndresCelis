import org.junit.Test;

public class CreandoVehiculos {
    @Test
    public void creando_un_camion(){
        IVehiculo vehiculo = FactoríaVehiculo.obtenerTipoVehiculo(EnumVehiculo.Carro);
        vehiculo.arrancar();
        vehiculo.acelerar();
        vehiculo.frenar();
        
    }
}
