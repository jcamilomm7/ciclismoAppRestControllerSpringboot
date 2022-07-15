package com.zonatalentos.ciclismoapp.controllers;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.services.CyclingTeamService;
import com.zonatalentos.ciclismoapp.services.CyclistsServices;
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

}
