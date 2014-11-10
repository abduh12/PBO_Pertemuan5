import java.util.Scanner;
public class calculator {
    private int a,b,hasil;
    private String o;

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
    
    public void tampil(){
        Scanner i = new Scanner (System.in);
        System.out.println("-----------------------");
        System.out.println("Operasi Aritmatika :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih operasi : ");
        o = i.nextLine();
        System.out.println("------------------");
   
    }
    
    public void hitung(){
        
        if (o.equals("1")) {
            hasil=a+b;
        }else if(o.equals("2")){
            hasil=a-b;
        }else if(o.equals("3")){
            hasil=a*b;
        }else if(o.equals("4")){
            hasil=a/b;
        }
        System.out.println("(Penjumalahan/Pengurangan/Perkalian/Pembagian) adalah "+hasil);
    
    }
    
    public static void main(String[] args) {
        
        Scanner ipt = new Scanner (System.in);
        calculator ab = new calculator();
        System.out.print("Masukkan angka 1 : ");
        ab.setA(Integer.parseInt(ipt.nextLine()));
        //a = Integer.parseInt(ipt.nextLine());
        System.out.print("Masukkan Angka 2: ");
        ab.setB(Integer.parseInt(ipt.nextLine()));
        //b = Integer.parseInt(ipt.nextLine());
        ab.tampil();
        ab.hitung();
    }
}
