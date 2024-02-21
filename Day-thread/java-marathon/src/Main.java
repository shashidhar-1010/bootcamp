import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the details:");
        System.out.println("enter name:");
        String name = sc.nextLine();

        int age=0;
        while(true){
            try{
                System.out.println("age:");
                age = Integer.parseInt(sc.nextLine());
                if(age <=0){
                    throw new IllegalArgumentException("age should be positive");
                }
                break;//loop is breaked if the input is valid
            }catch(NumberFormatException e){
                System.out.println("enter the valid input for age:");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("gender");
        String gender = sc.nextLine();

        System.out.println("contact:");
        String contact = sc.nextLine();

        Marathon mar = new Marathon(name,age,gender,contact);

        System.out.println("details-");
        System.out.println("Name:" +mar.name);
        System.out.println("Age:" +mar.age);
        System.out.println("Gender:"+ mar.gender);
        System.out.println("contact:"+ mar.contact);

        sc.close();


    }

}