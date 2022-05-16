package co.com.servientrega.logistica.distribucion;

import co.com.servientrega.logistica.guia.Guia;
import co.com.servientrega.logistica.guia.GuiaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Map;

public class Distribucion extends AggregateEvent<DistribucionId> {
    protected EmpleadoId empleadoId;
    protected VehiculoId vehiculoId;
    protected Map<GuiaId, Guia> guias;

    public Distribucion(DistribucionId entityId) {
        super(entityId);
    }
}
