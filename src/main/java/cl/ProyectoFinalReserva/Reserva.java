package cl.ProyectoFinalReserva;

import jakarta.persistence.*;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servicio_id_servicio")
    private Servicio servicio;

    // --- 1. REQUERIDO POR JPA ---
    public Reserva() {
        // Constructor vacío
    }

    // --- 2. FALTABAN ESTOS ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // --- TUS MÉTODOS (Limpiados) ---
    // (No es necesario el "cl.ProyectoFinalReserva."
    // pero funciona de ambas formas)

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}