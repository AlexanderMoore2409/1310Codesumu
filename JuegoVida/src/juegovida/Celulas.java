/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegovida;

/**
 *
 * @author Usuario
 */
public class Celulas {
    private String celula1;
    private int VecinosVivos;
    private int VecinosMuertos;

    public Celulas() {
        celula1 = "";
        VecinosVivos = 0;
        VecinosMuertos = 0;
    }
    
    public Celulas (String Celula, int VecinosVivos, int VecinosMuertos){
    
this.celula1 = Celula;
this.VecinosVivos = VecinosVivos ;
this.VecinosMuertos = VecinosMuertos; 
    
    }

    public String getCelula1() {
        return celula1;
    }

    public void setCelula1(String celula1) {
        this.celula1 = celula1;
    }

    public int getVecinosVivos() {
        return VecinosVivos;
    }

    public void setVecinosVivos(int VecinosVivos) {
        this.VecinosVivos = VecinosVivos;
    }

    public int getVecinosMuertos() {
        return VecinosMuertos;
    }

    public void setVecinosMuertos(int VecinosMuertos) {
        this.VecinosMuertos = VecinosMuertos;
    }

   

}
    

   
