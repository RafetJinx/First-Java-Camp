public class Student extends IndividualUser{
    private String grade;

    public Student(int UserId, String UserEmail, int id, String firstName, String lastName, String tckno, String grade) {
        super(UserId, UserEmail, id, firstName, lastName, tckno);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
