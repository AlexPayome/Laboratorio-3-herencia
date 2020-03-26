package herencia;
//Estudiante Alex Enrique Payome Rincón
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Estudiante extends Persona{
    private long carnet;
    private double promedioNotas;
    private int numeroMaterias;
    
    public Estudiante(){
        
    }

    public Estudiante(long carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    
    public void setNumeroMatieras(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public double calculaPromedio(int numeroMaterias){
        double promedioNotas;
        double suma = leerNotas(numeroMaterias);
        promedioNotas = suma/numeroMaterias;
        return (promedioNotas); 
    }
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        long carnet = 0;
        int numeroMaterias = 0;
        double promedioNotas = 0.0;
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        carnet = leerDatoTipoLong("Ingrese el carnet del estudiante");
        numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias del estudiante");
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMatieras(numeroMaterias);
        promedioNotas = calculaPromedio(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        return (nuevoEstudiante);
    }
    public double leerNotas(int numeroMaterias){
        double nota;
        double suma = 0;
        for (int i = 1; i <= numeroMaterias; i++) {
            nota = leerDatoTipoReal("Ingrese la nota de la materia: " + i);
            suma +=nota;
        }
        return (suma);
    }
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "Carnet estudiante: "+ carnet);
        JOptionPane.showMessageDialog(null, "Reporte de notas: "
                + "\nNumero de materias: " + numeroMaterias +
                "\nPromedio notas: "+ promedioNotas);
    }
}