import java.io.*;
import java.net.URL;

public class HttpStatusImageDownloader {

    void downloadStatusImage(int code) {

        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();

        try {
            URL url = new URL(httpStatusChecker.getStatusImage(code));
            InputStream in = new BufferedInputStream(url.openStream());
            OutputStream out = new BufferedOutputStream(new FileOutputStream("ImageCatStatus" + code + ".jpg"));

            for (int i; (i = in.read()) != -1; ) {
                out.write(i);
            }
            System.out.println("Image with code "+code+" download");
            in.close();
            out.close();

        } catch (Exception ex) {
            System.out.println(ex+"\n");
        }

    }
}
