import java.util.HashMap;
import java.util.Map;

public class FactoríaVehiculo {
    static final Map<EnumVehiculo, IVehiculo> ESTRATEGIA = new HashMap<>();
    static {
        ESTRATEGIA.put(EnumVehiculo.Carro, new EstrategiaCarro());
        ESTRATEGIA.put(EnumVehiculo.Moto, new EstategiaMoto());
        ESTRATEGIA.put(EnumVehiculo.Camion, new EstretegiaCaminon());
    }
    public static IVehiculo obtenerTipoVehiculo(EnumVehiculo tipoVehiculo){
        return ESTRATEGIA.get(tipoVehiculo);

    }
}
