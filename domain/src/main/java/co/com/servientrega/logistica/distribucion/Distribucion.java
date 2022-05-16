package co.com.servientrega.logistica.distribucion;

import co.com.sofka.domain.generic.AggregateEvent;

public class Distribucion extends AggregateEvent<DistribucionId> {


    public Distribucion(DistribucionId entityId) {
        super(entityId);
    }
}
