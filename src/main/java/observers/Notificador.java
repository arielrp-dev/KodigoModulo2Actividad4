package observers;

import models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<ClienteObserver> observadores;

    public Notificador() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(ClienteObserver observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ClienteObserver observador) {
        observadores.remove(observador);
    }

    public void notificar(Cliente cliente) {
        for (ClienteObserver observador : observadores) {
            observador.actualizar(cliente);
        }
    }
}
