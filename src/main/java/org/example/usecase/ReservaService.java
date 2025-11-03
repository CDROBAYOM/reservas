package org.example.usecase;

import org.example.domain.Reserva;
import org.example.domain.ReservaRepository;

import java.time.LocalDate;

public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void crearReserva(String id, String cliente, LocalDate fecha, int cantidadPersonas) {
        Reserva reserva = new Reserva(id, cliente, fecha, cantidadPersonas );
        reservaRepository.guardar(reserva);
        System.out.println("Reserva creada: " + reserva);
    }

    public void listarReservas() {
       System.out.println("Reservas encontradas");
    }


}
