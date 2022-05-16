package co.com.servientrega.logistica.distribucion.events;

import co.com.sofka.domain.generic.DomainEvent;

public final class VehiculoAsignado extends DomainEvent {

    public VehiculoAsignado() {
        super("co.com.servientrega.logistica.distribucion.events.VehiculoAsignado");
    }
}
