public class CorporateUserManager extends UserManager{
    public void add(CorporateUser corporateUser) {
        super.add(corporateUser);
        System.out.println("CorporateUser eklendi :" + corporateUser.getName()); // Db'de corporateUser tablosuna eklendi.
    }

    public void addMultiple(CorporateUser[] corporateUsers){
        for(CorporateUser corporateUser : corporateUsers){
            this.add(corporateUser);
        }
    }

    public void delete(CorporateUser corporateUser){
        super.delete(corporateUser);
        System.out.println("CorporateUser silindi : " + corporateUser.getName()); // Db'de corporateUser tablosundan silindi.
    }

    public void deleteMultiple(CorporateUser[] corporateUsers){
        for(CorporateUser corporateUser : corporateUsers){
            this.delete(corporateUser);
        }
    }
}
