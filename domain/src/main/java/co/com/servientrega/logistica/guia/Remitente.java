package co.com.servientrega.logistica.guia;

import co.com.servientrega.logistica.guia.values.Direccion;
import co.com.servientrega.logistica.guia.values.Nombre;
import co.com.servientrega.logistica.guia.values.RemitenteId;
import co.com.servientrega.logistica.guia.values.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Remitente extends Entity<RemitenteId> {

    private Nombre nombre;
    private Direccion direccion;
    private Telefono telefono;

    public Remitente(RemitenteId entityId, Nombre nombre, Direccion direccion,Telefono telefono) {
        super(entityId);
    }
}
