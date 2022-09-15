public class CorporateUser extends User{
    private int id;
    private String name;
    private String taxNumber;

    public CorporateUser(int id, String email, int id1, String name, String taxNumber) {
        super(id, email);
        this.id = id1;
        this.name = name;
        this.taxNumber = taxNumber;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
