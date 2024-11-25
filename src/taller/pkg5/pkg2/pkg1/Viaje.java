
package taller.pkg5.pkg2.pkg1;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String destino;
    private List<LugarVisitado> lugaresVisitados = new ArrayList<>();
    private List<GastoCompartido> gastos = new ArrayList<>();

    public Viaje(String destino) {
        this.destino = destino;
    }

    public synchronized void agregarLugar(LugarVisitado lugar) {
        lugaresVisitados.add(lugar);
    }

    public synchronized void agregarGasto(GastoCompartido gasto) {
        gastos.add(gasto);
    }

    public String getDestino() {
        return destino;
    }
}
