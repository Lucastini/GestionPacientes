
package negocio.ClasesDeComparacion;

import java.util.Comparator;
import negocio.Paciente;

public class ComparaPorEdad implements Comparator <Paciente> {

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return p1.getEdad()-p2.getEdad();
    }
    
}
