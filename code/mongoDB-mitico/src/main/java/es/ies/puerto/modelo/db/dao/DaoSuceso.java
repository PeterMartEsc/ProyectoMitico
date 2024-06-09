package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoEntityAbstract;
import es.ies.puerto.modelo.db.interfaces.IDao;
import es.ies.puerto.modelo.impl.Suceso;

import javax.persistence.EntityManagerFactory;

public class DaoSuceso extends DaoEntityAbstract implements IDao {
    public DaoSuceso(EntityManagerFactory emf) {
        super(emf);
    }

    /*
    @Override
    public List getAll() {
    }
     */

    @Override
    public Object getById(int id) {
        Suceso suceso = new Suceso(id);
        return getEm().find(Suceso.class,suceso.getId());
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
        Suceso suceso = new Suceso(id);
        try {
            getEm().getTransaction().begin();
            getEm().remove(suceso);
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
