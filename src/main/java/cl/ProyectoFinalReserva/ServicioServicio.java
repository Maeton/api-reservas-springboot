package cl.ProyectoFinalReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioServicio {
    @Autowired
    private ServicioRepository reposer;
    public Servicio save(Servicio serv) {
        return reposer.save(serv);
    }

}
