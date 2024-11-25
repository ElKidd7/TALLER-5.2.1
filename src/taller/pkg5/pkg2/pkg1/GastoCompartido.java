
package taller.pkg5.pkg2.pkg1;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GastoCompartido {
    private double monto;
    private List<Usuario> responsables;
    private Lock lock = new ReentrantLock();

    public GastoCompartido(double monto, List<Usuario> responsables) {
        this.monto = monto;
        this.responsables = responsables;
    }

    public void ajustarMonto(double nuevoMonto) {
        lock.lock();
        try {
            this.monto = nuevoMonto;
            System.out.println("Monto ajustado a: " + nuevoMonto);
        } finally {
            lock.unlock();
        }
    }

    public double getMonto() {
        return monto;
    }
}
