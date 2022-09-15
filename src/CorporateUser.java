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
}
