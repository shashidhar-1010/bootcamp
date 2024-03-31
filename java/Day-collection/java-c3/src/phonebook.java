import java.util.ArrayList;

public class phonebook {
    private static ArrayList<contact> contacts = new ArrayList<>();


    public static void addContact(contact cont){
        contacts.add(cont);
    }
    public static void removecontact(contact cont){
        contacts.remove(cont);
    }
    public static void viewall(){
        for (contact cont:contacts){
            System.out.println(cont);
        }
    }
    public static contact findbyphone(String phoneno){
        for(contact cont:contacts){
            if(cont.getPhoneno().equals(phoneno)){
                return cont;
            }
        }
        return null;
    }
}
