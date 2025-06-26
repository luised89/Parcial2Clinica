
package model;

/**
 *
 * @author Luis
 */

public class Paciente extends Persona {
    private String tipoSangre;
    private String fechaNacimiento;
    private String alergias;
    
    // Constructor único y funcional
    public Paciente(String nombre, String identificacion, 
                   String cuenta, String tipoSangre, 
                   String fechaNacimiento, String alergias) {
        super(nombre, identificacion, cuenta);
        this.tipoSangre = tipoSangre;
        this.fechaNacimiento = fechaNacimiento;
        this.alergias = alergias;
    }
    
    // Getters y Setters
    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }
    
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    
    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }
    
    @Override
    public String toString() {
        return super.toString() + " [Paciente]";
    }
}