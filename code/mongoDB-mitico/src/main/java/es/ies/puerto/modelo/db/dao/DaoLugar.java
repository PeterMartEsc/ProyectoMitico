package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Lugar;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DaoLugar extends MongoRepository<Lugar, Integer> {

}
