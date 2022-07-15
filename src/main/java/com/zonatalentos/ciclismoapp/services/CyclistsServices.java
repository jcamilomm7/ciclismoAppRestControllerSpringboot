package com.zonatalentos.ciclismoapp.services;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.repository.CyclingTeamRepository;
import com.zonatalentos.ciclismoapp.repository.CyclistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CyclistsServices {

    @Autowired
    private CyclistsRepository cyclistsRepository;

    @Autowired
    private CyclingTeamRepository cyclingTeamRepository;

    public CyclistsModel crearCiclista(CyclistsModel cyclistsModel) {

        var codigoGenerado = UUID.randomUUID().toString().toUpperCase().substring(0,3);
        cyclistsModel.setCodigoCiclista(codigoGenerado);

//        ArrayList<CyclingTeamModel> cyclingTeamModels = (ArrayList<CyclingTeamModel>) this.cyclingTeamRepository.findAll();
//
//        for (var i=0;i< cyclingTeamModels.size();i++){
//            if(!(cyclingTeamModels.get(i).getCodigoEquipo().equals(cyclistsModel.getCodigoEquipo()))){
//                return cyclistsRepository.save(cyclistsModel);
//            }
//        }

      return  cyclistsModel;

    }

    public ArrayList<CyclistsModel> listarCiclistas(){
        return (ArrayList<CyclistsModel>) cyclistsRepository.findAll();
    }

    public void eliminarCiclista(String id){
        cyclistsRepository.deleteById(id);
    }


}
