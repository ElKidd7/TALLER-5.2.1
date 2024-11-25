
package taller.pkg5.pkg2.pkg1;

public class Notificador extends Thread {
    private Usuario usuario;
    private String mensaje;

    public Notificador(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println("Notificación para " + usuario.getNombre() + ": " + mensaje);
    }
}
