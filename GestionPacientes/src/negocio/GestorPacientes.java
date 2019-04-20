
package negocio;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import negocio.ClasesDeComparacion.*;

public class GestorPacientes{
    private LinkedList<Paciente> listaPacientes;
    
    public GestorPacientes(){
    listaPacientes=new LinkedList();
    }
    
    public LinkedList<Paciente> getListaPacientes(){
        return listaPacientes;
    }
    
    public boolean addPaciente(Paciente pa){
        return listaPacientes.add(pa);
    }
    
    @Override
    public String toString(){
        String aux="";
        Collections.sort(listaPacientes);
        for(int i=0;i<listaPacientes.size();i++)
            aux+=listaPacientes.get(i).toString()+"\n";
        return aux;
    }
    
    public String mostrarOrdenadoSegunParametro(Comparator c){
        String aux="";
        ordenarSegunParametro(c);
        for(int i=0;i<listaPacientes.size();i++)
            aux+=listaPacientes.get(i).toString()+"\n";
        return aux;
    }
    
    public void ordenarSegunParametro(Comparator c){
        Collections.sort(listaPacientes, c);
    }

    
}
