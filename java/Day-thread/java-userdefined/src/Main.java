//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        newException obj = new newException();
        try{
            obj.vote(18);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("thank you");

        }
    }

}