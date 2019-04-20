
package negocio.ClasesDeComparacion;

import java.util.Comparator;
import negocio.Paciente;

public class ComparaPorAltura implements Comparator <Paciente>{

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return (int)(p1.getAltura()*100-p2.getAltura()*100);
    }
    
}
