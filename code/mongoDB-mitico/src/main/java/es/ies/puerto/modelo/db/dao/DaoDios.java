package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Dios;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DaoDios extends MongoRepository<Dios, Integer> {

}
