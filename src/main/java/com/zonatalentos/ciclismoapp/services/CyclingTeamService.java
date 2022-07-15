package com.zonatalentos.ciclismoapp.services;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.repository.CyclingTeamRepository;
import com.zonatalentos.ciclismoapp.response.CyclingTeamResponse;
import com.zonatalentos.ciclismoapp.response.CyclingTeamResponseOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class CyclingTeamService {

    @Autowired
    private CyclingTeamRepository cyclingTeamRepository;

    public CyclingTeamModel crearEquipo(CyclingTeamModel cyclingTeamModel) {

        var codigoGenerado = UUID.randomUUID().toString().toUpperCase().substring(0, 3);
        cyclingTeamModel.setCodigoEquipo(codigoGenerado);
        return cyclingTeamRepository.save(cyclingTeamModel);
    }

    public CyclingTeamResponse listarEquipos(){
        CyclingTeamResponse cyclingTeamResponse= new CyclingTeamResponse();

        var result2 =(ArrayList<CyclingTeamModel>) cyclingTeamRepository.findAll();
       cyclingTeamResponse.setCyclingTeamModels(result2);
        cyclingTeamResponse.setMensaje("Lista de equipos");
        return cyclingTeamResponse;
    }

    public CyclingTeamResponse eliminarEquipo(String id){
        CyclingTeamResponse cyclingTeamResponse = new CyclingTeamResponse();

        if (!cyclingTeamRepository.findById(id).isEmpty()){
            cyclingTeamRepository.deleteById(id);
            cyclingTeamResponse.setMensaje("El equipo ha sido eliminado con exito");
            return cyclingTeamResponse;
        }

        cyclingTeamResponse.setMensaje("El Id ingresado no correspondea ningun equipo de la BD");
        return cyclingTeamResponse;

    }
    public CyclingTeamResponseOne actualizarEquipo(CyclingTeamModel cyclingTeamModel) {
        CyclingTeamResponseOne cyclingTeamResponseOne= new CyclingTeamResponseOne();


        if(!cyclingTeamRepository.findById(cyclingTeamModel.getId()).isEmpty()){
            cyclingTeamRepository.save(cyclingTeamModel);
            cyclingTeamResponseOne.setMensaje("El cilcista ha sido actualizado");
            cyclingTeamResponseOne.setCyclingTeamModel(Optional.of(cyclingTeamModel));
            return cyclingTeamResponseOne;
        }

        cyclingTeamResponseOne.setMensaje("El ciclista no existe en la bd");
        return cyclingTeamResponseOne;

    }

}
