public class contact {
    private String firstname;
    private String lastname;
    private String phoneno;

    public contact(String firstname, String lastname, String phoneno) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneno = phoneno;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getPhoneno(){
        return phoneno;
    }

    @Override
    public String toString() {
        return "contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneno='" + phoneno + '\'' +
                '}';
    }
}
