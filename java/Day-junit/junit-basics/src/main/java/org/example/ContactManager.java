package org.example;

import java.util.zip.ZipFile;
import java.util.ArrayList;

public class ContactManager {



    private ArrayList <Contact> contactsList;

    public ContactManager(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public ContactManager(){
        this.contactsList = new ArrayList<>();
    }

    public void addContact(String firstname , String lastname , String phone) throws RuntimeException{
        contactsList.add(new Contact(firstname , lastname , phone));
        if(firstname.equals(null)){
            throw new RuntimeException("No valid first name");
        }
        if(lastname.equals(null)){
            throw new RuntimeException("No valid last name");
        }
        if(phone.equals(null)){
            throw new RuntimeException("No valid phone number");
        }
        try {
            contactsList.add(new Contact(firstname, lastname, phone));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Contact> getAllContacts(){
        return this.contactsList;

    }
}
