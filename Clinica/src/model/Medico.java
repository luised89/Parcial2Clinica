
package model;

/**
 *
 * @author Luis
 */

public class Medico extends Persona {
    private String especialidad;
    private String clave;
    
    public Medico(String nombre, String identificacion, 
                 String cuenta, String clave, String especialidad) {
        super(nombre, identificacion, cuenta);
        this.especialidad = especialidad;
        this.clave = clave;
    }
    
    // Getters y Setters específicos
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    

    @Override
    public String toString() {
        return super.toString() + " - " + especialidad + " [Médico]";
    }
}
