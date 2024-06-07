package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoEntityAbstract;
import es.ies.puerto.modelo.db.interfaces.IDao;
import es.ies.puerto.modelo.impl.Dios;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class DaoDios extends DaoEntityAbstract implements IDao {
    public DaoDios(EntityManagerFactory emf) {
        super(emf);
    }

    /*
    @Override
    public List getAll() {
    }
     */

    @Override
    public Object getById(int id) {
        Dios dios = new Dios(id);
        return getEm().find(Dios.class,dios.getId());
    }

    @Override
    public void addElement(Object o) {

    }

    @Override
    public void deleteElement(int id) {

    }

    @Override
    public void updateElement(Object o) {

    }
}
