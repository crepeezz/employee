package pekerja;
public class CleaningService extends Employee {
    
    void setBatasJamKerja(){
        super.batasJamKerja = 100; //batas jam kerja pegawai perbulannya
    }
    
    void setGaji(){
        super.gaji = 4_000_000; //gaji pegawai perbulannya 
    }
    
    int potongan(int jam){
        setBatasJamKerja();
        setGaji();
    int jamKerjaPegawai = super.batasJamKerja - jam; //batas jam kerja pegawai dikurangi jam kerja yang diinputkan pegawai
    int potonganPegawai = 8_000 * jam; //jam kerja pegawai bolos dikalikan potongan perjamnya
    super.potongan = super.gaji - potonganPegawai;  //gaji perbulan dikurangi potongan gaji perjam yang bolos
    return super.potongan;
    }
}
