package co.com.servientrega.logistica.distribucion.events;

import co.com.servientrega.logistica.distribucion.values.DistribucionId;
import co.com.servientrega.logistica.distribucion.values.EmpleadoId;
import co.com.servientrega.logistica.distribucion.values.VehiculoId;
import co.com.sofka.domain.generic.DomainEvent;

public final class DistribucionCreada extends DomainEvent {

    private DistribucionId distribucionId;
    private EmpleadoId empleadoId;
    private VehiculoId vehiculoId;

    public DistribucionCreada(DistribucionId DistribucionId, EmpleadoId empleadoId, VehiculoId vehiculoId) {
        super("co.com.servientrega.logistica.distribucion.events.DistribucionCreado");
        distribucionId = DistribucionId;
        this.empleadoId = empleadoId;
        this.vehiculoId = vehiculoId;
    }

    public DistribucionId getDistribucionId() {
        return distribucionId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
