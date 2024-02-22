import java.nio.CharBuffer;

public class buffer {
    public static void main(String[] args) {
        CharBuffer ch = CharBuffer.allocate(16);
        String text = "example";
        System.out.println("input text:"+text);

        //writing to buffer

        for(int i =0;i<text.length();i++){
            char c = text.charAt(i);
            ch.put(c);
        }
        System.out.println("position of buffer"+ch.position());
        ch.flip();

        //reading from buffer
        while(ch.hasRemaining()){
            System.out.println(ch.get());
        }




    }

}
