package com.zonatalentos.ciclismoapp.repository;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CyclingTeamRepository extends MongoRepository<CyclingTeamModel, String> {
}
