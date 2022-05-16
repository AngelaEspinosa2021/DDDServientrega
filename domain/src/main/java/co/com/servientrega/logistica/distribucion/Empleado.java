package co.com.servientrega.logistica.distribucion;

import co.com.servientrega.logistica.distribucion.values.EmpleadoId;
import co.com.sofka.domain.generic.Entity;

public final class Empleado extends Entity<EmpleadoId> {

    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }
}
