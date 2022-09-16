public class UserManager {
    public void add(User user){
        System.out.println("User eklendi : " + user.getEmail()); // Db'de user tablosuna eklendi.
    }

    public void addMultiple(User[] users){
        for(User user : users){
            this.add(user);
        }
    }

    public void delete(User user){
        System.out.println("User silindi : " + user.getEmail()); // Db'de User tablosundan silindi.
    }

    public void deleteMultiple(User[] users){
        for(User user : users){
            this.delete(user);
        }
    }
}
