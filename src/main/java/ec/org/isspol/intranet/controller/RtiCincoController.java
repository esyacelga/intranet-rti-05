package ec.org.isspol.intranet.controller;

import ec.org.isspol.intranet.persistence.entities.RtiCinco;
import ec.org.isspol.intranet.persistence.services.IRtiCincoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RtiCincoController {
    @Autowired
    private IRtiCincoService rtiCincoService;


    @GetMapping("/listar")
    public List<RtiCinco> listar() {
        return rtiCincoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public RtiCinco buscarTicketPorId(@PathVariable Integer id) {
        return rtiCincoService.findById(id);
    }

}
