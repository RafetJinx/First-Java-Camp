public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(
                1,
                "ins@email.com",
                1,
                "Engin",
                "Demirog",
                "11111111111",
                "Expert");

        UserManager userManager = new UserManager();
        userManager.add(instructor); // Sadece user tablosuna ekleme yapiyor.

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor); // User tipimiz instructor oldugu için ilgili tum tablolara ekleme yapiyor.
    }
}
