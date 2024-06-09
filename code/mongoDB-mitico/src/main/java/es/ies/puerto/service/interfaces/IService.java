package es.ies.puerto.service.interfaces;

import java.util.List;

public interface IService <T> {

    public List<T> getAllFromCollection();

    public T getByIdFromCollection(int id);

    public void addToCollection(T t);

    public void updateCollection(T t);

    public void deleteFromCollection(int id);

}
