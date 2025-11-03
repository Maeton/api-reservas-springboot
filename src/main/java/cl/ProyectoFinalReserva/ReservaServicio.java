package cl.ProyectoFinalReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServicio {
    @Autowired
    private ReservaRepository res;
    public Reserva reservar(Reserva reserva){
        return res.save(reserva);
    }
    public List<Reserva> mostrar(){
        return res.findAll();
    }
}
