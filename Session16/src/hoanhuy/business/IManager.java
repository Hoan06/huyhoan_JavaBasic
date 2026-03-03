package hoanhuy.business;

import hoanhuy.model.Customer;
import hoanhuy.model.Pet;

import java.util.List;

public interface IManager<T> {
    void add(T p);
    void showList();
    void search(String id);
    void remove(String id, String idCus);

    List<T> findAll();
}
