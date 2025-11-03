package org.example.infrastructure;

import org.example.domain.Reserva;
import org.example.domain.ReservaRepository;

import java.util.*;

public class InMemoryReservaRepository implements ReservaRepository {

    private final Map<String, Reserva> reservas = new HashMap<>();

    @Override
    public void guardar(Reserva reserva) {
        reservas.put(reserva.getId(), reserva);
    }

    @Override
    public void cancelarReserva(String id) {
        reservas.remove(id);
    }

    @Override
    public Optional<Reserva> buscarPorId(String id) {
        return Optional.ofNullable(reservas.get(id));
    }

    @Override
    public Optional<List<Reserva>> buscarTodas() {
        return Optional.empty();
    }
}

