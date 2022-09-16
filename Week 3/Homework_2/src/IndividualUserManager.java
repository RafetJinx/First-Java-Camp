public class IndividualUserManager extends UserManager{
    public void add(IndividualUser individualUser) {
        super.add(individualUser);
        System.out.println("IndividualUser eklendi :" + individualUser.getFirstName()
                + " " + individualUser.getLastName()); // Db'de individualUser tablosuna eklendi.
    }

    public void addMultiple(IndividualUser[] individualUsers){
        for(IndividualUser individualUser : individualUsers){
            this.add(individualUser);
        }
    }

    public void delete(IndividualUser individualUser){
        super.delete(individualUser);
        System.out.println("CorporateUser silindi : " + individualUser.getFirstName()
                + " " + individualUser.getLastName()); // Db'de individualUser tablosundan silindi.
    }

    public void deleteMultiple(IndividualUser[] individualUsers){
        for(IndividualUser individualUser : individualUsers){
            this.delete(individualUser);
        }
    }
}
