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
}
