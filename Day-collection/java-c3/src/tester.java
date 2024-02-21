public class tester{
    public static void main(String[] args){
        phonebook book = new phonebook();

        phonebook.addContact(new contact("apple","fruit","123455"));
        phonebook.addContact(new contact("lion","animal","456789"));
        phonebook.addContact(new contact("ravi","man","123098"));


        System.out.println("All Contacts:");
        phonebook.viewall();

        String search = "123455";
        System.out.println("finding the contact with phone number" + search+":");
        contact foundcontact = phonebook.findbyphone(search);
        if(foundcontact != null){
            System.out.println(foundcontact);
        }else{
            System.out.println("contact not found" + search);
        }

        phonebook.removecontact(foundcontact);

        System.out.println("all contacts after removal");
        phonebook.viewall();


    }

}