import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executor {
    private static final int nThreads = 10;
    public static void main(String[] args){
        ExecutorService exeservice = Executors.newFixedThreadPool(nThreads);
        var domains = new String[]{
                "https://google.com",
                "https://bing.com",
                "https://twitter.com",
                "https://web.whatsapp.com"
        };

        for(int i=0;i< domains.length;i++){
            String url = domains[i];
            pingurl tester = new pingurl(url);
            exeservice.execute(tester);
        }

        exeservice.shutdown();

        if(exeservice.isTerminated()){
            System.out.println("finished");
        }else{
            System.out.println("not yet terminared");
        }
    }
}
