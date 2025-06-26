
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Luis
 */


public class ConsultaMedica {

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHora;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    
    public ConsultaMedica(Paciente paciente, Medico medico, LocalDateTime fechaHora, 
                   String motivo, String diagnostico, String tratamiento) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    // Getters y Setters
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    
    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
    
    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }
    
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    
    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }
    
    @Override
    public String toString() {
        return "Consulta: " + paciente.getNombre() + " con Dr. " + medico.getNombre() + 
               " - " + fechaHora.toString();
    }
}