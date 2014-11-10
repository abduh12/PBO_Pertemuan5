import java.util.Scanner;

public class Kecepatan {
    private int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int getHitung(){
        int x;
        Scanner i = new Scanner (System.in);
        Kecepatan ab = new Kecepatan();
        System.out.print("Masukkan Jarak tempuh anda : ");
        ab.setA(Integer.parseInt(i.nextLine()));
        System.out.print("Masukkan waktu tempuh anda : ");
        ab.setB(Integer.parseInt(i.nextLine()));
        x = (int) ab.getA()/ab.getB();
        return x;
    }
    public static void main(String[] args) {
        Kecepatan a = new Kecepatan();
        System.out.println("Kecepatan anda adalah "+a.getHitung()+"KM/jam");
    }
}
