import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // IoC Container ile kontrol edilir (ex: BaseCustomer Manager)
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(
                1,
                "rafet",
                "ersoy",
                LocalDate.of(2000,2,12),
                "56389321984"));

        System.out.println();
    }
}
