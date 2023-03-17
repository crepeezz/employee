package pekerja;
public class Boss extends Employee{
    
    void setBatasJamKerja(){
        super.batasJamKerja = 100; //batas jam kerja boss perbulannya
    }
    
    void setGaji(){
        super.gaji = 25_000_000; //gaji boss perbulannya 
    }
    
    int potongan(int jam){
        setBatasJamKerja();
        setGaji();
    int jamKerjaPegawai = super.batasJamKerja - jam; //batas jam kerja bos dikurangi jam kerja yang diinputkan pegawai
    int potonganPegawai = 10_000 * jam; //jam kerja pegawai bolos dikalikan potongan perjamnya
    super.potongan = super.gaji - potonganPegawai;  //gaji perbulan dikurangi potongan gaji perjam yang bolos
    return super.potongan;
    }
}
