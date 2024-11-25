
package taller.pkg5.pkg2.pkg1;

import java.util.ArrayList;
import java.util.List;

public class EazyWayConcurrente {
    public static void main(String[] args) {
        Usuario alice = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");

        Viaje viajeParis = new Viaje("París");
        alice.agregarViaje(viajeParis);

        LugarVisitado torreEiffel = new LugarVisitado("Torre Eiffel");
        viajeParis.agregarLugar(torreEiffel);

        List<Usuario> responsables = new ArrayList<>();
        responsables.add(alice);
        responsables.add(bob);

        GastoCompartido gasto = new GastoCompartido(200.0, responsables);
        viajeParis.agregarGasto(gasto);

        Notificador notificador = new Notificador(alice, "¡Tu viaje a París fue actualizado!");
        notificador.start();
    }
}

