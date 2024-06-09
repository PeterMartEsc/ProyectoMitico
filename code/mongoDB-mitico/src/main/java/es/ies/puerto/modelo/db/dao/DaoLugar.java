package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Lugar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoLugar extends MongoRepository<Lugar, Integer> {

}
