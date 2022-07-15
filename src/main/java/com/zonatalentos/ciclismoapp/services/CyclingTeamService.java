package com.zonatalentos.ciclismoapp.services;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.repository.CyclingTeamRepository;
import com.zonatalentos.ciclismoapp.repository.CyclistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CyclingTeamService {

    @Autowired
    private CyclingTeamRepository cyclingTeamRepository;

    public CyclingTeamModel crearEquipo(CyclingTeamModel cyclingTeamModel) {

        var codigoGenerado = UUID.randomUUID().toString().toUpperCase().substring(0,3);
       cyclingTeamModel.setCodigoEquipo(codigoGenerado);
        return cyclingTeamRepository.save(cyclingTeamModel);
    }
}
