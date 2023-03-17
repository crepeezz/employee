package pekerja;
public class Manager extends Employee {
    
     void setBatasJamKerja(){
        super.batasJamKerja = 100; //batas jam kerja manager perbulannya
    }
    
    void setGaji(){
        super.gaji = 15_000_000; //gaji manager perbulannya 
    }
    
    int potongan(int jam){
        setBatasJamKerja();
        setGaji();
    int jamKerjaPegawai = super.batasJamKerja - jam; //batas jam kerja manager dikurangi jam kerja yang diinputkan pegawai
    int potonganPegawai = 25_000 * jam; //jam kerja pegawai bolos dikalikan potongan perjamnya
    super.potongan = super.gaji - potonganPegawai;  //gaji perbulan dikurangi potongan gaji perjam yang bolos
    return super.potongan;
    }
}
