package cl.ProyectoFinalReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservaController {
    @Autowired
    private ReservaServicio res;
    @PostMapping("/reserva")
    public Reserva guardar(@RequestBody Reserva reser){
        return res.reservar(reser);
    }
    @GetMapping("/reserva")
    public List<Reserva> mostrar (){
        return res.mostrar();
    }
}
