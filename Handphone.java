import java.util.Scanner;

public class Handphone {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        new Handphone();
    }

    public Handphone() {
        int flag = 0;
        do {
            System.out.print("Do you want use Player APPS (Y/N): ");
            String x;
            x = scan.nextLine();
            if(x.equals("Y")) {
                flag = 1;
            }
            else if(x.equals("N")) {
                flag = 2;
            }
        }

        while(flag == 0);
        if(flag == 1) {
            new Application();
        }
    }
}
