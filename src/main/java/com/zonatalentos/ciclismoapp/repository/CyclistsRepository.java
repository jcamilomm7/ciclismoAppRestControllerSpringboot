package com.zonatalentos.ciclismoapp.repository;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CyclistsRepository extends MongoRepository<CyclistsModel, String> {
}
