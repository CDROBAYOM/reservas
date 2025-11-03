package org.example.infrastructure;

import java.util.ArrayList;
import java.util.List;

public class ExternalReservaAPI {

    private List<String> reservasExternas = new ArrayList<>();

    public void createExternalBooking(String jsonData) {
        reservasExternas.add(jsonData);
        System.out.println("Reserva externa creada: " + jsonData);
    }

    public List<String> fetchExternalBookings() {
        return reservasExternas;
    }
}
