package org.example.infrastructure;

import org.example.domain.Reserva;
import org.example.domain.ReservaRepository;

import java.util.List;
import java.util.Optional;


public class ExternalReservaAdapter implements ReservaRepository {

    private ExternalReservaAPI api;

    public ExternalReservaAdapter(ExternalReservaAPI externalAPI) {
        this.api = externalAPI;
    }

    @Override
    public void guardar(Reserva reserva) {
        String json = reserva.toString();
        api.createExternalBooking(json);
    }

    @Override
    public void cancelarReserva(String id) {
    }

    @Override
    public Optional<Reserva> buscarPorId(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Reserva>> buscarTodas() {
        return Optional.empty();
    }
}
