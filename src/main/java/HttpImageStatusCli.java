import java.util.Scanner;

public class HttpImageStatusCli {
    void askStatus() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code or exit");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    new HttpStatusImageDownloader().downloadStatusImage(scanner.nextInt());
                    System.out.println("Enter HTTP status code or exit");
                } else if (scanner.hasNext("exit")) {
                    System.exit(0);
                    scanner.close();
                } else {
                    System.out.println("Please enter valid number\n");
                    new HttpImageStatusCli().askStatus();
                }

            }

        }

}