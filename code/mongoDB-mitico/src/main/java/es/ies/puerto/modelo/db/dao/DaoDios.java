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
    public boolean addElement(Object o) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(o);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public void deleteElement(int id) {
        Dios dios = new Dios(id);
        try {
            getEm().getTransaction().begin();
            getEm().remove(dios);
            getEm().getTransaction().commit();
        }catch (Exception exception){
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public boolean updateElement(Object o) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(o);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }
}
