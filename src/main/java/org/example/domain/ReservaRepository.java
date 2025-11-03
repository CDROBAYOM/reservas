package org.example.domain;

import java.util.List;
import java.util.Optional;

public interface ReservaRepository {

    void guardar(Reserva reserva);
    void cancelarReserva(String id);
    Optional<Reserva> buscarPorId(String id);
    Optional<List<Reserva>> buscarTodas();
}
