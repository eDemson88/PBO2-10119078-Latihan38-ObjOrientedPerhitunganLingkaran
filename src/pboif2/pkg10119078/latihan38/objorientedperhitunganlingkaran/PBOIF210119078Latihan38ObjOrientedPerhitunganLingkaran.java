/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan perhitungan lingkaran
 */
package pboif2.pkg10119078.latihan38.objorientedperhitunganlingkaran;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan38ObjOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("=======Perhitungan Lingkaran=======");
        
        lingkaran.getDia();
        lingkaran.hasilLingkaran(lingkaran.dia);
    }
    
}
