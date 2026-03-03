package hoanhuy.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String fullName;
    private String phone;
    private List<Pet> listPetofCustomers = new ArrayList<>();

    public Customer(String id, String fullName, String phone, List<Pet> listPetofCustomers) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.listPetofCustomers = new ArrayList<>();
    }

    public Customer() {
    }


    public Customer(String cusId) {
        this.listPetofCustomers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Pet> getListPetofCustomers() {
        return listPetofCustomers;
    }

    public void setListPetofCustomers(List<Pet> listPetofCustomers) {
        this.listPetofCustomers = listPetofCustomers;
    }

    public void addPet(Pet p){
        listPetofCustomers.add(p);
    }

    public Pet findByIdPet(String petId){
        for (Pet p : listPetofCustomers){
            if(p.getId().equals(petId)){
                return p;
            }
        }
        return null;
    }


}
