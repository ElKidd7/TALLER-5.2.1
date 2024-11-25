
package taller.pkg5.pkg2.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Usuario {
    private String nombre;
    private List<Viaje> listaDeViajes = new ArrayList<>();
    private List<Usuario> seguidores = new ArrayList<>();
    private Lock lock = new ReentrantLock(); // Sincronización para evitar conflictos

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSeguidor(Usuario usuario) {
        lock.lock();
        try {
            seguidores.add(usuario);
            System.out.println(nombre + " tiene un nuevo seguidor: " + usuario.getNombre());
        } finally {
            lock.unlock();
        }
    }

    public void agregarViaje(Viaje viaje) {
        lock.lock();
        try {
            listaDeViajes.add(viaje);
        } finally {
            lock.unlock();
        }
    }

    public String getNombre() {
        return nombre;
    }
}
