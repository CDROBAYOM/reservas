package org.example.domain;
import java.time.LocalDate;

public class Reserva {
    private String id;
    private String cliente;
    private LocalDate fecha;
    private int cantidadPersonas;


    public Reserva(String id, String cliente, LocalDate fecha, int cantidadPersonas) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getId() { return id; }
    public String getCliente() { return cliente; }
    public LocalDate getFecha() { return fecha; }
    public int getCantidadPersonas() { return cantidadPersonas; }

    public void setId(String id) { this.id = id; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setCantidadPersonas(int cantidadPersonas) { this.cantidadPersonas = cantidadPersonas; }

    public String toString(){ return id + " " + cliente + " " + fecha + " " + cantidadPersonas; }
}
