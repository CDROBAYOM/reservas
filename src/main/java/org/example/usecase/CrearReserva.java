package org.example.usecase;

import org.example.domain.Reserva;
import org.example.domain.ReservaRepository;

import java.time.LocalDate;
import java.util.UUID;

public class CrearReserva {
    private final ReservaRepository reservaRepository;

    public CrearReserva(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva ejecutar(String cliente, LocalDate fecha, int cantidadPersonas) {
        Reserva nuevaReserva = new Reserva(UUID.randomUUID().toString(), cliente, fecha, cantidadPersonas);
        reservaRepository.guardar(nuevaReserva);
        return nuevaReserva;
    }
}

