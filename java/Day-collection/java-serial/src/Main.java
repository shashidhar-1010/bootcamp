import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) throws IOException, ClassNotFoundException {
        Dog dog1 = new Dog("chotu","lab");
        FileOutputStream output = new FileOutputStream("file1.txt");
        ObjectOutputStream objOutput = new ObjectOutputStream(output);
        objOutput.writeObject(dog1);


        FileInputStream input = new FileInputStream("file1.txt");
        ObjectInputStream objInput = new ObjectInputStream(input);
        Dog newObj = (Dog)objInput.readObject();
        System.out.println("Name"+newObj.getName()+"Breed"+ newObj.getBreed());





    }
}