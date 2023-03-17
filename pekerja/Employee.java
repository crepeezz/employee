package pekerja;
import java.util.Scanner;
public class Employee {
    
        Scanner scan = new Scanner(System.in);
                
        void nip(){
        System.out.print("Masukkan No Induk Pegawai : ");
        int nip = scan.nextInt();
        }
        
        void nama(){
        System.out.print("Masukkan Nama Karyawan : ");
        String nama = scan.next();
        }
    
        int batasJamKerja = 0;
        int potongan = 0;
        int gaji = 0;
        
        
}
