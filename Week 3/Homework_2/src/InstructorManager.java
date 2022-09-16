public class InstructorManager extends IndividualUserManager{
    public void add(Instructor instructor) {
        super.add(instructor);
        System.out.println("Instructor eklendi : " + instructor.getFirstName()
        + " " + instructor.getLastName()); // Db'de instructor tablosuna eklendi.
    }

    public void addMultiple(Instructor[] instructors) {
        super.addMultiple(instructors);
    }

    public void delete(Instructor instructor) {
        super.delete(instructor);
        System.out.println("CorporateUser silindi : " + instructor.getFirstName()
                + " " + instructor.getLastName()); // Db'de instructor tablosundan silindi.
    }

    public void deleteMultiple(Instructor[] instructors) {
        super.deleteMultiple(instructors);
    }
}
