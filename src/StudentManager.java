public class StudentManager extends IndividualUserManager{
    public void add(Student student) {
        super.add(student);
        System.out.println("Instructor eklendi : " + student.getFirstName()
                + " " + student.getLastName()); // Db'de student tablosuna eklendi.
    }

    public void addMultiple(Student[] students) {
        super.addMultiple(students);
    }

    public void delete(Student student) {
        super.delete(student);
        System.out.println("CorporateUser silindi : " + student.getFirstName()
                + " " + student.getLastName()); // Db'de student tablosundan silindi.
    }

    public void deleteMultiple(Student[] students) {
        super.deleteMultiple(students);
    }
}
