package com.zonatalentos.ciclismoapp.controllers;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.response.CyclistResponseOne;
import com.zonatalentos.ciclismoapp.response.CyclistsResponse;
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
    public CyclistResponseOne add(@RequestBody CyclistsModel cyclistsModel) {
        return this.cyclistsServices.crearCiclista(cyclistsModel);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CyclistResponseOne actualizarCilista(@RequestBody CyclistsModel cyclistsModel) {
        return this.cyclistsServices.actualizarCiclista(cyclistsModel);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public CyclistsResponse listarCiclistas() {
        return this.cyclistsServices.listarCiclistas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public CyclistResponseOne listarCiclistas(@PathVariable String id) {
        return this.cyclistsServices.listarCiclistasPorId(id);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public CyclistsResponse eliminarCiclista(@PathVariable String id) {
      return  this.cyclistsServices.eliminarCiclista(id);
    }


}
