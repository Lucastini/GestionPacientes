
package negocio;

import java.util.Collections;
import negocio.ClasesDeComparacion.ComparaPorAltura;
import negocio.ClasesDeComparacion.ComparaPorEdad;
import negocio.ClasesDeComparacion.ComparaPorPeso;
import presentacion.VentanaPrincipal;

public class Principal {

    public static void main(String[] args) {
        /*Paciente p1,p2,p3,p4,p5;
        p1=new Paciente("Sanchez", "Aldo", 40, 1.8, 80.0);
        p2=new Paciente("Lutre", "Edgar", 45, 1.9, 85);
        p3=new Paciente("Tini", "Lucas", 37, 1.7, 76.0);
        p4=new Paciente("Ferrer", "Gladis", 46, 1.6, 65.0);
        
        GestorPacientes g=new GestorPacientes();
        g.addPaciente(p1);
        g.addPaciente(p2);
        g.addPaciente(p3);
        g.addPaciente(p4);
        
        System.out.println(g.toString());
        System.out.println("\n");
        System.out.println(g.mostrarOrdenadoSegunParametro(new ComparaPorPeso()));*/
        
        VentanaPrincipal v1= new VentanaPrincipal();
        v1.setVisible(true);

    }
    
}
