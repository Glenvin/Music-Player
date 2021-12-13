import java.util.Scanner;

public class Headphones {
    private String nama;

    public Headphones(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void play() {
        System.out.println(nama + " is playing");
    }
}
