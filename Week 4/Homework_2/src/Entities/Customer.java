package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    // Siniflar ciplak kaliyor ise yani inheritence veya implementation almiyor ise
    // ilerleyen zamanlarda nesnellik zaafiyeti yasanabilecek demektir.
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBrith;
    private String nationalityId;

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBrith, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBrith = dateOfBrith;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
