package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoEntityAbstract;
import es.ies.puerto.modelo.db.interfaces.IDao;
import es.ies.puerto.modelo.impl.Suceso;

import javax.persistence.EntityManagerFactory;

public interface DaoSuceso extends MongoRepository <Suceso, Integer> {

}
