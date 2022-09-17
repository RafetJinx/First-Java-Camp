package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    // BaseCustomerManager'in abstract class olarak olusturulmasinin sebebi:
    //      Kod implementasyonu olacak (birden fazla yerde ayni kod blogu kullanilacak)
    //      Bu durumda kod implementasyonunu yonetmek icin abstract class olusturuyoruz.
    //      Boylece "BaseCustomerManager"i extend eden siniflar icin ayni islevi gorecek.
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to db" + customer.getFirstName());
    }
}
