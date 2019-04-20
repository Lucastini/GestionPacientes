
package negocio.ClasesDeComparacion;

import java.util.Comparator;
import negocio.Paciente;

public class ComparaPorApellido implements Comparator <Paciente>{

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return p2.getApellido().compareToIgnoreCase(p2.getApellido());
    }
    
    
}
