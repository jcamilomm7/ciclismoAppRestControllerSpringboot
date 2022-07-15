package com.zonatalentos.ciclismoapp.controllers;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.services.CyclistsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cyclists")
public class CyclistsController {

    @Autowired
    CyclistsServices cyclistsServices;


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CyclistsModel add(@RequestBody CyclistsModel cyclistsModel) {
        return this.cyclistsServices.crearCiclista(cyclistsModel);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ArrayList<CyclistsModel> listarCiclistas() {
        return this.cyclistsServices.listarCiclistas();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void eliminarCiclista(@PathVariable String id) {
       this.cyclistsServices.eliminarCiclista(id);
    }


}
