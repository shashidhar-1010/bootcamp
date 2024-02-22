import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class pingurl implements Runnable{

    private String url;

    public pingurl (String url){
        this.url = url;
    }

    @Override
    public void run() {
        String res = "";
        int code = 200;

        String result;
        try {

            URL siteurl = new URL(url);
            HttpURLConnection connection = (HttpsURLConnection) siteurl.openConnection();
            connection.setRequestMethod("get");
            connection.setConnectTimeout(5000);
            connection.connect();
            code = connection.getResponseCode();

            if (code == 200) {
                result = "->green \t\t " + "code :" + code;
            } else {
                result = "->yellow \t\t " + "code :" + code;
            }

        } catch (Exception ex) {
            result = "->red  \t\t " + " wrong domain::" + code + ex.getMessage();
        }
        System.out.println(url + "\t\t status:" + result);


    }

}
