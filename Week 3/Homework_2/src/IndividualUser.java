public class IndividualUser extends User{
    private int id;
    private String firstName;
    private String lastName;
    private String tckno;

    public IndividualUser(int UserId, String UserEmail, int id, String firstName, String lastName, String tckno) {
        super(UserId, UserEmail);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tckno = tckno;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
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

    public String getTckno() {
        return tckno;
    }

    public void setTckno(String tckno) {
        this.tckno = tckno;
    }
}
