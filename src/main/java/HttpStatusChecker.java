import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class HttpStatusChecker {


    String getStatusImage(int code) throws Exception {

        String cat = "https://http.cat/" + code + ".jpg";
        URL url = new URL(cat);

        HttpURLConnection connection = ( HttpURLConnection ) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int statusCode = connection.getResponseCode();

        if (statusCode == 404) {
                throw new Exception("\nThere is not image for HTTP status "+code);
        }
        return cat;
    }
}
