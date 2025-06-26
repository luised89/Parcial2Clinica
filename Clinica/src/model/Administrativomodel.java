
package model;

/**
 *
 * @author Luis
 */
public class Administrativomodel extends Persona {
    private String clave;
    private String cargo;

    
    public Administrativomodel(String nombre, String identificacion, 
                 String cuenta, String clave, String cargo) {
        super(nombre, identificacion, cuenta);
        this.clave = clave;
        this.cargo = cargo;
        
    }
    
    // Getters y Setters específicos
    public String getClave() { return clave; }
    public void setClave(String cargo) { this.clave = clave; }
    
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    

    @Override
    public String toString() {
        return super.toString() + " - " + cargo + " [Administrativo]";
    }
}
    

