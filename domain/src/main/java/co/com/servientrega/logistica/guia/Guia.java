package co.com.servientrega.logistica.guia;

import co.com.servientrega.logistica.guia.events.GuiaCreada;
import co.com.servientrega.logistica.guia.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Guia extends AggregateEvent<GuiaId> {
    protected RemitenteId remitenteId;
    protected DestinarioId destinarioId;
    protected Paquete paquete;
    protected Precio precio;
    protected Estado estado;
    protected Fecha fecha;

    public Guia(GuiaId entityId, RemitenteId remitenteId, DestinarioId destinarioId,Paquete paquete,Precio precio,Estado estado,Fecha fecha) {
        super(entityId);
        appendChange(new GuiaCreada(remitenteId,destinarioId,paquete,precio,estado,fecha)).apply();
    }


}
