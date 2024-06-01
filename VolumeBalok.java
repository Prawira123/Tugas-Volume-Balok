/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumebalok;

/**
 *
 * @author erick
 */
public class VolumeBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hitungvolumebalok SP = new hitungvolumebalok(3,2,4);

        
        System.out.println("Nilai Panjang: "+ SP.getPANJANG());
        System.out.printf("Nilai Lebar: %d\n", SP.getLEBAR());
        System.out.printf("Nilai Tinggi: %d\n\n", SP.getTINGGI());
        System.out.printf("Hasilnya adalah: %d\n\n", SP.getHASIL());

        
        
    }
    }
    

