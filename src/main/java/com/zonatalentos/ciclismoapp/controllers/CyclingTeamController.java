package com.zonatalentos.ciclismoapp.controllers;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.response.CyclingTeamResponse;
import com.zonatalentos.ciclismoapp.response.CyclingTeamResponseOne;
import com.zonatalentos.ciclismoapp.services.CyclingTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cyclingteam")
public class CyclingTeamController {

    @Autowired
    CyclingTeamService cyclingTeamService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CyclingTeamModel crearEquipo(@RequestBody CyclingTeamModel cyclingTeamModel) {
        return this.cyclingTeamService.crearEquipo(cyclingTeamModel);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public CyclingTeamResponse listarEquipos() {
        return this.cyclingTeamService.listarEquipos();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public CyclingTeamResponse eliminarEquipo(@PathVariable String id) {
        return this.cyclingTeamService.eliminarEquipo(id);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CyclingTeamResponseOne actualizarEquipo(@RequestBody CyclingTeamModel cyclingTeamModel) {
        return this.cyclingTeamService.actualizarEquipo(cyclingTeamModel);
    }

}
