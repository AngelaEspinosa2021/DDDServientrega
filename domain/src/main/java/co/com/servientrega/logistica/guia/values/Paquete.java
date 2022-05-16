package co.com.servientrega.logistica.guia;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Paquete implements ValueObject<Paquete.Prop> {

    private final Double alto;
    private final Double ancho;
    private final Double peso;
    private final Integer cantidad;

    public Paquete(Double alto, Double ancho, Double peso, Integer cantidad) {
        this.alto = Objects.requireNonNull(alto);
        this.ancho = Objects.requireNonNull(ancho);
        this.peso = Objects.requireNonNull(peso);
        this.cantidad = Objects.requireNonNull(cantidad);
    }

    @Override
    public Prop value() {
        return new Prop() {
            @Override
            public Double alto() {
                return alto;
            }

            @Override
            public Double ancho() {
                return ancho;
            }

            @Override
            public Double peso() {
                return peso;
            }

            @Override
            public Integer cantidad() {
                return cantidad;
            }
        };
    }

    public interface Prop {
        Double alto();
        Double ancho();
        Double peso();
        Integer cantidad();
    }
}
