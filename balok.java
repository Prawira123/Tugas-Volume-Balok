/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package volumebalok;

/**
 *
 * @author erick
 */
public class balok {
    
    private int panjang, lebar, tinggi, volume;
    
   //Constructor
   //Parameter: int nP, int nL;
    
    public balok(int nP, int nL, int nT){
        panjang =  nP;
        lebar = nL;
        tinggi = nT;
        volume = nP *nL * nT;
    }
    
    //cara memberikan nilai properti panjang
    //Method: setPANJANG public
    //Parameter: int nVAL
    public void setPANJANG(int nVAL){
        this.panjang = nVAL;     
    }
    //cara memberikan nilai properti lebar
    //Method: setLEBAR public
    //Parameter: int nVAL
    public void setLEBAR(int nVAL){
        this.lebar = nVAL;
    }
    
     public void setTINGGI(int nVAL){
        this.tinggi = nVAL;
    }
    //Membaca nilai property panjang
    //Method: getPANJANG public
    //Parameter: -
    //Output: int (Nilai Panjang)
    public int getPANJANG(){
        return this.panjang;
    }
    
    //Membaca nilai property Lebar
    //Method: getLEBAR public
    //Parameter: -
    //Output: int (Nilai Lebar)
    public int getLEBAR(){
        return this.lebar;
    }
    
    public int getTINGGI(){
        return this.tinggi;
    }
    
    public int getHASIL(){
        return this.volume;
    }
    
    
}
