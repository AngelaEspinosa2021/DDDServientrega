package co.com.servientrega.logistica.guia.events;

import co.com.servientrega.logistica.guia.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class GuiaCreada extends DomainEvent {

    private RemitenteId remitenteId;
    private DestinarioId destinarioId;
    private Paquete paquete;
    private Precio precio;
    private Estado estado;
    private Fecha fecha;

    public GuiaCreada(RemitenteId remitenteId, DestinarioId destinarioId, Paquete paquete, Precio precio, Estado estado, Fecha fecha) {
        super("co.com.servientrega.logistica.guia.events.GuiaCreada");
        this.remitenteId = remitenteId;
        this.destinarioId = destinarioId;
        this.paquete = paquete;
        this.precio = precio;
        this.estado = estado;
        this.fecha = fecha;
    }

    public RemitenteId getRemitenteId() {
        return remitenteId;
    }

    public DestinarioId getDestinarioId() {
        return destinarioId;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
