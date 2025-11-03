package org.example.usecase;

import org.example.domain.ReservaRepository;

public class CancelarReserva {

    private final ReservaRepository reservaRepository;

    public CancelarReserva(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void cancelarReserva(String id) {

        reservaRepository.buscarPorId(id)
                .ifPresentOrElse(reserva -> {
                    reservaRepository.cancelarReserva(id);
                    System.out.println("Reserva Cancelada: " + id);
                }, () -> {
                    System.out.println("No se encontró la reserva con id: " + id);
                });
    }
}
