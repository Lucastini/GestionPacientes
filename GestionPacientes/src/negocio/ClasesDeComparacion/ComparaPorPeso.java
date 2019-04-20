
package negocio.ClasesDeComparacion;

import java.util.Comparator;
import negocio.Paciente;

public class ComparaPorPeso implements Comparator <Paciente> {

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return (int)(p1.getPeso()*100-p2.getPeso()*100);
    }
    
    
}
