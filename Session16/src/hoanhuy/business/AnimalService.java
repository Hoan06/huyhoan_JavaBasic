package hoanhuy.business;

import hoanhuy.model.Customer;
import hoanhuy.model.Pet;

import java.util.*;

public class AnimalService implements IManager<Pet>  {
    private static final List<Pet> listPets = new ArrayList<>();

    private final CustomerService customerService;

    public AnimalService() {
        this.customerService = new CustomerService();
    }

    @Override
    public void add(Pet p) {
        listPets.add(p);
        System.out.println("Thêm thành công thú cưng !");
    }

    @Override
    public void showList() {
        System.out.println("Danh sách thú cưng trong cửa hàng : ");
        for (Pet p : listPets){
            System.out.println(p.toString());
        }
    }

    @Override
    public void search(String id) {
        boolean flag = true;
        for (int i = 0 ; i < listPets.size() ; i++){
            if(listPets.get(i).getId().equals(id)){
                System.out.println(listPets.get(i).toString());
                flag = false;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy thú cưng muốn tìm !");
        }
    }
    @Override
    public void remove(String id, String idCus) {
        Scanner sc = new Scanner(System.in);
        Customer customer = customerService.findById(idCus);

        if(customer == null){
            System.out.println("Không tìm thấy khách hàng!");
            return;
        }

        boolean flag = true;
        for (int i = 0 ; i < listPets.size() ; i++){
            Pet pet = listPets.get(i);
            if(listPets.get(i).getId().equals(id)){
                listPets.remove(pet);
                customer.addPet(pet);
                flag = false;
                System.out.println("Bán thành công thú cưng !");
            }
        }
        if (flag){
            System.out.println("Không tìm thấy thú cưng muốn tìm !");
        }
    }

    @Override
    public List<Pet> findAll() {
        return listPets;
    }

    public Pet findById(String id){
        for(Pet p : listPets){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }


}
