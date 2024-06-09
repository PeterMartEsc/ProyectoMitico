package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Bestia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DaoBestia extends MongoRepository<Bestia, Integer> {

}
