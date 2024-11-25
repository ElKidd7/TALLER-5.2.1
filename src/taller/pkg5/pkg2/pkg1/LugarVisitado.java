
package taller.pkg5.pkg2.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LugarVisitado {
    private String nombre;
    private List<String> comentarios = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public LugarVisitado(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComentario(String comentario) {
        lock.lock();
        try {
            comentarios.add(comentario);
            System.out.println("Nuevo comentario en " + nombre + ": " + comentario);
        } finally {
            lock.unlock();
        }
    }

    public String getNombre() {
        return nombre;
    }
}
