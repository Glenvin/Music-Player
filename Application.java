import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> musicList = new ArrayList<>();

    public void generateMusic() {
        String x = new String("Dimension Tripper");
        musicList.add(x);
        x = new String("Ano .ne");
        musicList.add(x);
        x = new String("Shooting Star");
        musicList.add(x);
    }

    public Application() {
        generateMusic();
        int x = 0;
        do {
            System.out.println("Application Player");
            System.out.println("1. Add Song");
            System.out.println("2. Delete Song");
            System.out.println("3. Play");
            System.out.println("4. Exit");
            System.out.print("Select = ");
            x = scan.nextInt();
            scan.nextLine();
            if(x == 1) {
                System.out.print("Add music name : ");
                String nama = scan.nextLine();
                musicList.add(nama);
            }
            else if(x == 2) {
                System.out.println("Index \t Lagu");
                for(int i = 0;i<musicList.size();i++) {
                    System.out.println((i+1) + " \t " + musicList.get(i));
                }
                System.out.print("Select the song you want to delete (1 - " + (musicList.size()) +"): ");
                int y = scan.nextInt();
                scan.nextLine();
                if(y > (musicList.size())) {
                    System.out.println("Index out of range!");
                    System.out.println("Press Enter to Continue...");
                    scan.nextLine();
                }
                else {
                    musicList.remove((y-1));
                    System.out.println("Song succesfully deleted");
                    System.out.println("Press Enter to Continue...");
                    scan.nextLine();
                }
            }
            else if(x == 3) {
                System.out.println("Index \t Lagu");
                for(int i = 0;i<musicList.size();i++) {
                    System.out.println((i+1) + " \t " + musicList.get(i));
                }

                System.out.print("Select song you want to play (1 - " + (musicList.size()) +"): ");
                int y = scan.nextInt();
                scan.nextLine();
                Headphones h = new Headphones(musicList.get(y-1));
                h.play();
                System.out.println("Press Enter to Continue...");
                scan.nextLine();
            }
        }
        while (x != 4);
    }
}
