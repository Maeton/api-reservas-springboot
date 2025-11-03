package cl.ProyectoFinalReserva;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private ClienteServicio kliente;
    @PostMapping("/clientes")
    public Cliente guardar(@RequestBody Cliente cliente){
        return kliente.save(cliente);
    }


}
