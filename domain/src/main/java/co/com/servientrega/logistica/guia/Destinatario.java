package co.com.servientrega.logistica.guia;

import co.com.servientrega.logistica.guia.values.*;
import co.com.sofka.domain.generic.Entity;

public class Destinatario extends Entity<DestinarioId> {
    private Nombre nombre;
    private Direccion direccion;
    private Telefono telefono;
    private MedioDeEntrega medioDeEntrega;


    public Destinatario(DestinarioId entityId, Nombre nombre,Direccion direccion, Telefono telefono,MedioDeEntrega medioDeEntrega) {
        super(entityId);
    }
}
