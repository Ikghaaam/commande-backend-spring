package com.example.MyTp1Spring.ws;

import com.example.MyTp1Spring.bean.Commande;
import com.example.MyTp1Spring.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commande")

public class CommandeWs {

    @Autowired
    private CommandeService commandeService;

    @GetMapping("ref/{ref}")
    public Commande findByRef(@PathVariable String ref) {
        return commandeService.findByRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return commandeService.deleteByRef(ref);
    }

    @PostMapping("")
    public int save(@RequestBody Commande entity) {
        return commandeService.save(entity);
    }

    @GetMapping("")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
