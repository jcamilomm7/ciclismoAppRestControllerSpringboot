package com.zonatalentos.ciclismoapp.services;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import com.zonatalentos.ciclismoapp.repository.CyclingTeamRepository;
import com.zonatalentos.ciclismoapp.repository.CyclistsRepository;
import com.zonatalentos.ciclismoapp.response.CyclingTeamResponse;
import com.zonatalentos.ciclismoapp.response.CyclistResponseOne;
import com.zonatalentos.ciclismoapp.response.CyclistsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class CyclistsServices {

    @Autowired
    private CyclistsRepository cyclistsRepository;

    @Autowired
    private CyclingTeamRepository cyclingTeamRepository;

    public CyclistResponseOne crearCiclista(CyclistsModel cyclistsModel) {
        CyclistResponseOne cyclistResponseOne = new CyclistResponseOne();

        var codigoGenerado = UUID.randomUUID().toString().toUpperCase().substring(0,3);
        cyclistsModel.setCodigoCiclista(codigoGenerado);

        ArrayList<CyclingTeamModel> cyclingTeamModels = (ArrayList<CyclingTeamModel>) this.cyclingTeamRepository.findAll();

        for (var i=0;i< cyclingTeamModels.size();i++){
            if(cyclingTeamModels.get(i).getCodigoEquipo().equalsIgnoreCase(cyclistsModel.getCodigoEquipo())){
                cyclistResponseOne.setMensaje("EL ciclista se creo correctamente");
                 CyclistsModel result= cyclistsRepository.save(cyclistsModel);
                 cyclistResponseOne.setCyclistsModels(Optional.of(result));
                 return cyclistResponseOne;
            }
        }

        cyclistResponseOne.setMensaje("El codigo del equipo es incorrecto");

      return cyclistResponseOne;

    }

    public CyclistsResponse listarCiclistas(){
        CyclistsResponse cyclistsResponse = new CyclistsResponse();

        var result2 =(ArrayList<CyclistsModel>) cyclistsRepository.findAll();
        cyclistsResponse.setCyclistsModels(result2);
        cyclistsResponse.setMensaje("Lista de ciclistas");
        return cyclistsResponse;
    }

    public CyclistsResponse eliminarCiclista(String id){

        CyclistsResponse cyclistsResponse = new CyclistsResponse();

        if (!cyclistsRepository.findById(id).isEmpty()){
            cyclistsRepository.deleteById(id);
            cyclistsResponse.setMensaje("El ciclista ha sido eliminado con exito");
            return cyclistsResponse;
        }

        cyclistsResponse.setMensaje("El Id ingresado no correspondea ningun ciclista de la BD");
        return cyclistsResponse;

    }


    public CyclistResponseOne listarCiclistasPorId(String id){

    CyclistResponseOne cyclistResponseOne = new CyclistResponseOne();

    Optional<CyclistsModel> cyclistsModel =  cyclistsRepository.findById(id);


    if (!cyclistsModel.isEmpty()){
        cyclistResponseOne.setMensaje("Se encontro el ciclista registrado en la bd");
        cyclistResponseOne.setCyclistsModels(cyclistsModel);
        return cyclistResponseOne;

    }
        cyclistResponseOne.setMensaje("No se encontro el ciclista registrado en la bd");
    return cyclistResponseOne;

}

    public CyclistResponseOne actualizarCiclista(CyclistsModel cyclistsModel) {
        CyclistResponseOne cyclistResponseOne = new CyclistResponseOne();


        if(!cyclistsRepository.findById(cyclistsModel.getId()).isEmpty()){
            cyclistsRepository.save(cyclistsModel);
            cyclistResponseOne.setMensaje("El cilcista ha sido actualizado");
            cyclistResponseOne.setCyclistsModels(Optional.of(cyclistsModel));
            return cyclistResponseOne;
        }


        cyclistResponseOne.setMensaje("El ciclista no existe en la bd");

        return cyclistResponseOne;

    }


}