package co.com.servientrega.logistica.distribucion;

import co.com.servientrega.logistica.distribucion.values.VehiculoId;
import co.com.sofka.domain.generic.Entity;

public final class Vehiculo extends Entity<VehiculoId> {
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(VehiculoId entityId, TipoVehiculo tipoVehiculo) {
        super(entityId);
    }
}
