package pekerja;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        Employee pekerja = new Employee();
        
        pekerja.nama();
        pekerja.nip();
        
        System.out.print("Masukkan Jam Kerja : ");
        int jamKerja = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Masukkan Jabatan : ");
        String jabatan = scan.nextLine();
        
        
        if (jabatan.equalsIgnoreCase("boss")) {
            Boss boss = new Boss();
            System.out.print("Gaji: "+boss.potongan(jamKerja));
        } 
        else if (jabatan.equalsIgnoreCase("manager")) {
            Manager manager = new Manager();
            System.out.print("Gaji: "+manager.potongan(jamKerja));
        }
        else if (jabatan.equalsIgnoreCase("cleaning service")) {
            CleaningService cleaningService = new CleaningService();
            System.out.print("Gaji: "+ cleaningService.potongan(jamKerja));
        }
        else if (jabatan.equalsIgnoreCase("internship")) {
            Internship internship = new Internship();
            System.out.println("Gaji: "+internship.potongan(jamKerja));
        }
        System.out.println();
    }
    
}
