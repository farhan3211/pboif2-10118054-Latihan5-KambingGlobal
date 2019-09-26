/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118054.latihan5.kambingglobal;

/**
 *
 * @author ASUS
 * nama  :Farhan Milardi 
 * kelas :IF-2
 * nim   :10118054
 */
public class Pboif210118054Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Pboif210118054Latihan5KambingGlobal KambingSusu = new Pboif210118054Latihan5KambingGlobal();
      
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         KambingSusu.getJumlahKambing();
         
        // Menambah satu kambing
         KambingSusu.tambahKambing();
         
        // Menampilkan jumlah kambing yang ada
         KambingSusu.getJumlahKambing();
    }
    
}
