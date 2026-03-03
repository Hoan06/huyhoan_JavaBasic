package hoanhuy.business;

import hoanhuy.model.Customer;
import hoanhuy.model.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements IManager<Customer>{

    private static final Map<String, Customer> customers = new HashMap<>();

    public Customer findById(String id){
        return customers.get(id);
    }

    @Override
    public void add(Customer p){
        customers.put(p.getId() , p);
        System.out.println("Đăng kí thành công !");
    }

    @Override
    public void showList() {
        if(customers.isEmpty()){
            System.out.println("Danh sách khách hàng trống!");
            return;
        }

        for(Customer c : customers.values()){
            System.out.println(c);
        }
    }

    @Override
    public void search(String id) {
        Customer c = customers.get(id);

        if(c == null){
            System.out.println("Không tìm thấy khách hàng!");
        }else{
            System.out.println(c);
        }
    }

    @Override
    public void remove(String id, String idCus) {

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }



}
