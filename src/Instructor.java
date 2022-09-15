public class Instructor extends IndividualUser{
    private String profession;

    public Instructor(int UserId, String UserEmail, int id, String firstName, String lastName, String tckno, String profession) {
        super(UserId, UserEmail, id, firstName, lastName, tckno);
        this.profession = profession;
    }
}
