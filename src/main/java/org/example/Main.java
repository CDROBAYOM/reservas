package org.example;

import org.example.domain.Reserva;
import org.example.domain.ReservaRepository;
import org.example.infrastructure.ExternalReservaAPI;
import org.example.infrastructure.ExternalReservaAdapter;
import org.example.usecase.CancelarReserva;
import org.example.usecase.CrearReserva;
import org.example.infrastructure.InMemoryReservaRepository;
import org.example.usecase.ReservaService;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReservaRepository repo = new InMemoryReservaRepository();
        ReservaService service = new ReservaService(repo);

        service.crearReserva("1", "Carlos", LocalDate.now(), 1);
        service.crearReserva("2", "María", LocalDate.now(), 2);
        service.listarReservas();

        System.out.println("\nUsando la API externa con Adapter:");
        ExternalReservaAPI externalAPI = new ExternalReservaAPI();
        ReservaRepository externalRepo = new ExternalReservaAdapter(externalAPI);
        ReservaService serviceAPI = new ReservaService(externalRepo);

        serviceAPI.crearReserva("3", "Pedro", LocalDate.now(), 1);
        serviceAPI.listarReservas();
    }
}