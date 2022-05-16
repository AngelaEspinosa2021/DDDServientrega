package co.com.servientrega.logistica.guia;

import co.com.sofka.domain.generic.AggregateEvent;

public class Guia extends AggregateEvent<GuiaId> {
    protected RemitenteId remitenteId;
    protected DestinarioId destinarioId;
    protected Paquete paquete;
    protected Precio precio;
    protected Estado estado;
    protected Fecha fecha;

    public Guia(GuiaId entityId) {
        super(entityId);
    }
}
