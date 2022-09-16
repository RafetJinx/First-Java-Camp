public class CorporateUser extends User{
    private int id;
    private String name;
    private String taxNumber;

    public CorporateUser(int UserId, String UserMail, int id, String name, String taxNumber) {
        super(UserId, UserMail);
        this.id = id;
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
