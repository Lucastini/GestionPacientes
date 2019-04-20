
package negocio;


public class Paciente implements Comparable <Paciente>{
    private String nombre, apellido;
    private double altura, peso;
    private int edad;
    private static int cod=1;
    private int codigo;
    
    public Paciente(String ape, String nom, int ed, double al, double pe){
        codigo=cod;
        cod++;
        apellido=ape;
        nombre=nom;
        edad=ed;
        altura=al;
        peso=pe;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Paciente p) {
        return apellido.compareToIgnoreCase(p.apellido);
    }
    
    @Override
    public String toString(){
        return "Cod: "+codigo+", Apellido: "+apellido+", Nombre: "+nombre+", Edad: "+edad+", Altura: "+altura+"m, Peso: "+peso+"kg.";
    }
    
    
    
    
}
