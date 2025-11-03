package cl.ProyectoFinalReserva;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepository repoc;
    public Cliente save(Cliente cliente) {
        return repoc.save(cliente);
    }


}
