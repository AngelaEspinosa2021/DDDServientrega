package co.com.servientrega.logistica.distribucion;

import co.com.servientrega.logistica.distribucion.values.DistribucionId;
import co.com.servientrega.logistica.distribucion.values.EmpleadoId;
import co.com.servientrega.logistica.distribucion.values.VehiculoId;
import co.com.servientrega.logistica.guia.Guia;
import co.com.servientrega.logistica.guia.values.GuiaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Map;

public class Distribucion extends AggregateEvent<DistribucionId> {
    protected EmpleadoId empleadoId;
    protected VehiculoId vehiculoId;
    protected Map<GuiaId, Guia> guias;

    public Distribucion(DistribucionId DistribucionId, EmpleadoId empleadoId, VehiculoId vehiculoId) {
        super(DistribucionId);
    }


}
