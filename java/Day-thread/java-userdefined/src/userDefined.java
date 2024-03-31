public class userDefined {
    void vote (int age ) throws newException{
        if(age<18){
            throw new newException("age is not sufficient ");
        }
        else{
            System.out.println("you can vote");
        }
    }
}
