package com.tuanluc.springdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tuanluc.springdata.entities.RssData;
@Repository
public interface RssDataRepository extends MongoRepository<RssData, String> {

}