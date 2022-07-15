package com.zonatalentos.ciclismoapp.repository;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface CyclistsRepository extends MongoRepository<CyclistsModel, String> {

    public abstract ArrayList<CyclistsModel> findBycodigoEquipo(String codigoEquipo);
}
