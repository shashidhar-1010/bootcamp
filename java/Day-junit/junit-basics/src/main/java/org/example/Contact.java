package org.example;

public class Contact {

    String firstname;
    String lastname;

    String contactnumber;

    public Contact(String firstname, String lastname, String contactnumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactnumber = contactnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

}
